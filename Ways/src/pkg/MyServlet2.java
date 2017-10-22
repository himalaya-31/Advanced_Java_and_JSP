package pkg;

import javax.servlet.*;
import java.io.IOException;
import java.io.PrintWriter;

public class MyServlet2 extends GenericServlet {
			
	public void service(ServletRequest req, ServletResponse res)throws IOException{
		res.setContentType("text/html");
		PrintWriter out = res.getWriter();
		out.println("<html><body>Way two</body></html>");
	}
}
