package com.exmaple

import java.io.{BufferedReader, InputStream, InputStreamReader}
import java.net.{HttpURLConnection, URL}

import com.example.MyServer
import org.specs2.mutable.SpecificationWithJUnit
import org.specs2.specification.AfterAll
import org.specs2.specification.core.{Description, Fragments, SpecificationStructure}
import org.specs2.specification.create.FragmentsFactory

import scala.util.Try

class JettyRunnerTest extends SpecificationWithJUnit with AfterAll with BeforeAllWithNamedStep {

  val myMessage = "my-message"
  val port = 8080
  val server = new MyServer(port, myMessage)

  private def consumeAndClose(stream: InputStream): String =
    try {
      val input = new BufferedReader(new InputStreamReader(stream))
      val sb = new StringBuilder
      var line = Option(input.readLine())
      while (line.isDefined) {
        sb.append(line.get)
        line = Option(input.readLine())
      }
      sb.mkString
    } finally {
      stream.close()
    }

  private def response(url:String) = {
    val connection = new URL(url).openConnection().asInstanceOf[HttpURLConnection]
    val t = Try {
      connection.setReadTimeout(100)
      connection.setConnectTimeout(100)
      connection.setDoInput(true)
      connection.setDoOutput(false)
      connection.connect()
      val output = consumeAndClose(connection.getInputStream)
      val responseCode = connection.getResponseCode
      HttpResponse(responseCode, output)
    }
    connection.disconnect()
    t
  }

  "test" should{
    "pass" in {
      response(s"http://localhost:$port") must beSuccessfulTry(HttpResponse(200,myMessage))
    }

    "fail" in {
      response(s"http://localhost:$port") must beSuccessfulTry(HttpResponse(200,"not-my-message"))
    }
  }



  override def beforeAll(): Unit = server.start()

  override def beforeAllStepName(): String = "Env Setup"

  override def afterAll(): Unit = server.stop()
}

trait BeforeAllWithNamedStep extends SpecificationStructure with FragmentsFactory {

  def beforeAll(): Unit

  def beforeAllStepName(): String

  override def map(fs: => Fragments) = {
    val beforeAllFragment = fragmentFactory.step(beforeAll()).copy(description = Description.text(beforeAllStepName()))
    super.map(fs).prepend(beforeAllFragment)
  }
}

case class HttpResponse(code:Int, body:String)