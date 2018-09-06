package com.example2

import javax.servlet.http.{HttpServletRequest, HttpServletResponse}
import org.eclipse.jetty.server.{Request, Server}
import org.eclipse.jetty.server.handler.AbstractHandler

class MyServer(port: Int, message: String) {
  val server = new Server(port)
  server.setHandler(new JettyRunner(message))

  def start(): Unit = {
    server.start()
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