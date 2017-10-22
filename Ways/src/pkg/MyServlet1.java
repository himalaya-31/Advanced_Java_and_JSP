package pkg;

import javax.servlet.*;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.http.*;

public class MyServlet1 implements Servlet {
	
	public void init(ServletConfig sc){
		
	}
	
	public void service (ServletRequest req, ServletResponse res)throws IOException{
		res.setContentType("text/html");
		PrintWriter out = res.getWriter();
		out.println("<html><head><title>WayOne</title></head>");
		out.println("<body>Way One</body></html>");
	}
	
	public void destroy(){
		
	}
	
	public ServletConfig getServletConfig(){
		return null;
	}
	
	public String getServletInfo(){
		return null;
	}

}
