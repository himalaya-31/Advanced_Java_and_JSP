package pkg;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.http.*;

public class ServletForm extends HttpServlet {
	public void service(HttpServletRequest req, HttpServletResponse res) throws IOException
	{
		String name = req.getParameter("uname");
		String name1 = req.getParameter("pswrd");
		res.setContentType("text/html");
		PrintWriter out = res.getWriter(); 
		
		ServletConfig con = getServletConfig();
		out.println(con.getInitParameter("num"));
		
		ServletContext ctx = getServletContext();
		out.println(ctx.getInitParameter("num2"));
		
		if(name.equals("Himalaya") && name1.equals("12345"))
		{
			out.println("<html><body>User Valid</body></html>");
		}
		else
		{
			out.println("<html><body>User Invalid</body></html>");
		}
	}
	
}
