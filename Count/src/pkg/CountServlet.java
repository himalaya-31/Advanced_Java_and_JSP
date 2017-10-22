package pkg;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletContext;
import javax.servlet.http.*;

@SuppressWarnings("serial")
public class CountServlet extends HttpServlet {
	public void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException {
		resp.setContentType("text/plain");
		PrintWriter out = resp.getWriter();
		ServletContext ctx = getServletContext();
		Integer count = (Integer)ctx.getAttribute("ctr");
		
		//Integer count = (Integer)req.getAttribute("ctr");
		
		if(count == null){
			count = new Integer(0);
		}
		
		out.println("Views: ");
		ctx.setAttribute("ctr", count+1);
		//req.setAttribute("ctr", count+1);
		
		
		out.println(count);
	}
}
