package pkg;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.*;

@SuppressWarnings("serial")
public class LoginFormServlet extends HttpServlet {
	public void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException {
		resp.setContentType("text/html");
		PrintWriter out = resp.getWriter();
		out.println("<html><body>");
		String uname = req.getParameter("uname");
		String pass = req.getParameter("pass");
		
		if(uname.equals("Himalaya") && pass.equals("123")){
			out.println("User Valid");
		}
		else{
			out.println("User Invalid");
		}
		out.println("</body></html>");
	}
}
