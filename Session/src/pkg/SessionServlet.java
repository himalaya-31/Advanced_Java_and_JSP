package pkg;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.*;

@SuppressWarnings("serial")
public class SessionServlet extends HttpServlet {
	public void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException {
		resp.setContentType("text/plain");
		PrintWriter out = resp.getWriter();
		HttpSession s = req.getSession();
		Integer count = (Integer)s.getAttribute("ctr");
		
		if(count == null){
			count = new Integer(0);
		}
		
		s.setAttribute("ctr", count + 1);
		out.println(count + "\nIs Session new?\nAnswer is: " + s.isNew());
	}
}
