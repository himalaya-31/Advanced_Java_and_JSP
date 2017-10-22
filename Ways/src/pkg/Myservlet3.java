package pkg;

import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;

public class Myservlet3 extends HttpServlet {
	public void service(HttpServletRequest req, HttpServletResponse res)throws IOException{
		res.setContentType("text/html");
		PrintWriter out = res.getWriter();
		out.println("<html><body>Way three</body></html>");
	}
}
