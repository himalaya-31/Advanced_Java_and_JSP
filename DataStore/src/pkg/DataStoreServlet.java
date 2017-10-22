package pkg;
import static pkg.OfyService.ofy;
//import static com.googlecode.objectify.ObjectifyService.ofy;

import java.io.IOException;
import java.util.List;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.googlecode.objectify.cmd.Query;

import pkg.UserDetails;

@SuppressWarnings("serial")
public class DataStoreServlet extends HttpServlet {
		public void doPost(HttpServletRequest req, HttpServletResponse resp) throws IOException {
			
//			String name = req.getParameter("email");
//			String pass = req.getParameter("pass");
//
//			UserDetails user = new UserDetails(name, pass);
//			  
//			ofy().save().entities(user);
			
			
			//ofy().delete().type(UserDetails.class).ids("Hello","Himalaya");
			
			/*List<UserDetails> ud = ofy().load().type(UserDetails.class).filter("pass ==", "12345").list();
			
			for (int i = 0; i < ud.size(); i++) {
				System.out.println(ud.get(i).name);
				System.out.println(ud.get(i).pass);
				
			}*/
			
			/*Query<UserDetails> q = ofy().load().type(UserDetails.class).filter("pass ==", "12345");
			for (UserDetails car: q){
				   	     System.out.println(car.pass);
				   	     }
			*/	   	  
			
			
			Query<UserDetails>	q = ofy().load().type(UserDetails.class);
			q = q.filter("pass ==", "12345");
			
			for(UserDetails ud1: q){
				System.out.println(ud1.pass);
			}

		   	  /*List<UserDetails> li = ofy().load().type(UserDetails.class).list();

		   	 for (int i = 0; i < li.size(); i++) {
				System.out.println(li.get(i).name);
				System.out.println(li.get(i).pass);
			}*/

			ofy().clear();

			resp.getWriter().println("Your data has been saved successfully please check the datastore");
			
			
			/*System.out.println("name = "+ name);			
			System.out.println("pass = "+ pass);*/	
	}
}
