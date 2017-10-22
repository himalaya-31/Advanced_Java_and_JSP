package pkg;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.*;

@SuppressWarnings("serial")
public class CookiesServlet extends HttpServlet {
	public void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException {
		resp.setContentType("text/html");
		PrintWriter out = resp.getWriter();
		
		String name = req.getParameter("uname");
		String pswrd = req.getParameter("pswrd");
		
		Cookie c1 = new Cookie("Username" , "kuchbhi");
		Cookie c2 = new Cookie("Password" , "kuch");
		
		resp.addCookie(c1);
		resp.addCookie(c2);
		
		
		
		if(name.equals("kuchbhi") && pswrd.equals("kuch")){
			out.println("user valid");
		}
		else{
			out.println("user invalid");
		}
	
		
		Cookie c[] = req.getCookies();
		
		for(int i = 0; i < c.length; i++){
			out.println(c[i].getName());
			out.println(c[i].getValue());
		}
		}
}
