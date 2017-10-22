package pkg;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.*;

@SuppressWarnings("serial")
public class ServletCollabServlet extends HttpServlet {
	public void service(HttpServletRequest req, HttpServletResponse resp) throws IOException, ServletException {
		resp.setContentType("text/html");
		PrintWriter out = resp.getWriter();
		RequestDispatcher rd = req.getRequestDispatcher("servlet2");
		out.println("Hello from calling Servlet");
		//rd.include(req, resp);
		rd.forward(req, resp);
		out.println("Hello from calling Servlet");
		/*System.out.println("Hello from calling Servlet");
		resp.sendRedirect("servlet2");
		resp.sendRedirect("index.html");
		resp.sendRedirect("https://www.facebook.com/");*/
	}
}
