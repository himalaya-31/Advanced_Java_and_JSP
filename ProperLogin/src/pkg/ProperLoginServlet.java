package pkg;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.*;

@SuppressWarnings("serial")
public class ProperLoginServlet extends HttpServlet {
	public void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException {
		resp.setContentType("text/html");
		PrintWriter out = resp.getWriter();
		
		String name = req.getParameter("uname");
		String pass = req.getParameter("pass");
		
		if(name.equals("Himalaya")	&&	pass.equals("12345")){
			resp.sendRedirect("home");
		}
		else{
			out.println("Sorry!! You are not a valid user");
		}
	}
}
