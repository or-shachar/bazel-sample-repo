package com.example

import javax.servlet.http.{HttpServletRequest, HttpServletResponse}
import org.eclipse.jetty.server.{Request, Server}
import org.eclipse.jetty.server.handler.AbstractHandler

object FailedRunner extends App {
  def main(): Unit = {
    print("Something went wrong...")
  }
}

class MyServer(port: Int, message: String) {
  val server = new Server(port)
  server.setHandler(new JettyRunner(message))

  def start(): Unit = {
    server.start()
    //throw new RuntimeException("I cannot work!!")
    Thread.sleep(5000)
  }

  def stop():Unit = {
    server.stop()
    server.join()
  }


}

class JettyRunner(message: String = "hello-world") extends AbstractHandler {
  override def handle(target: String, baseRequest: Request, request: HttpServletRequest, response: HttpServletResponse): Unit = {
    response.setContentType("text/html;charset=utf-8")
    response.setStatus(HttpServletResponse.SC_OK)
    baseRequest.setHandled(true)
    response.getWriter.println(message)
  }
}