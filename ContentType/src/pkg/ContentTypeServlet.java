package pkg;

import java.io.IOException;
import javax.servlet.http.*;

@SuppressWarnings("serial")
public class ContentTypeServlet extends HttpServlet {
	public void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException {
		resp.setContentType("application/msword");
		resp.getWriter().println("Hello, world");
	}
}
