package com.example;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.ServletException;
 
import java.io.IOException;
 
import org.eclipse.jetty.server.Server;
import org.eclipse.jetty.server.Request;
import org.eclipse.jetty.server.handler.AbstractHandler;
 
public class JettyRunner extends AbstractHandler
{
    private String message = "Hello World";

    public JettyRunner(String message){
        super();
        this.message = message;
    }

    public void handle(String target,
                       Request baseRequest,
                       HttpServletRequest request,
                       HttpServletResponse response) 
        throws IOException, ServletException
    {
        response.setContentType("text/html;charset=utf-8");
        response.setStatus(HttpServletResponse.SC_OK);
        baseRequest.setHandled(true);
        response.getWriter().println(message);
    }
 	
 	public static void run(int port, int xMilliSeconds, String message) throws Exception{
 	    Server server = new Server(port);
        server.setHandler(new JettyRunner(message));
        server.start();
        Thread.sleep(xMilliSeconds);
        server.stop();
        server.join();	
 	}
}