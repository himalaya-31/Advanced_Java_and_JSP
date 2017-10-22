package pkg;

import java.io.IOException;
import javax.servlet.http.*;
import pkg.UserDetails;
import static pkg.OfyService.ofy;

@SuppressWarnings("serial")
public class MyDataStoreServlet extends HttpServlet {
	@SuppressWarnings("unused")
	public void doPost(HttpServletRequest req, HttpServletResponse resp) throws IOException {
		String name = req.getParameter("email");
		String pass = req.getParameter("pass");
		
		UserDetails user =	new UserDetails(name, pass);
		ofy().save().entity(user);
		ofy().clear();
		
		resp.getWriter().println("Your data has been stored!!");
		System.out.println(name);
		System.out.println(pass);
		
		UserDetails th1 = ofy().load().type(UserDetails.class).id("abc").now();

	   	 System.out.println(th1.name);
	   	 String password = th1.pass;
	   	 
	   	 
	   	 
	   	 //ofy().save().entity(th1); // asynchronous
	   	 ofy().save().entity(th1).now(); // synchronous

	   	 //ofy().delete().type(UserDetails.class).id("abc"); // asynchronous
	   	  ofy().delete().type(UserDetails.class).id("abc").now(); // synchronous

	   	 //ofy().delete().type(UserDetails.class).ids(1, 2, 2); // asynchronous
	   	 //ofy().delete().type(UserDetails.class).ids(12, 456L, 789L).now(); //
	   	 // synchronous
	   //	ofy().delete().type(UserDetails.class).ids("Hello", "Himalaya");//asynchronous
	   	 /*
	   	  * // Operators are >, >=, <, <=, in, !=, <>, =, ==
	   	 
	   	 List<Car> li = ofy().load().type(Car.class).filter("year >", 1999).list(); List<Car>
	   	  * cars = ofy().load().type(Car.class).filter("year >=", 1999).list();
	   	  * List<Car> cars = ofy().load().type(Car.class).filter("year !=",
	   	  * 1999).list();
	   	  * List<Car> cars = ofy().load().type(Car.class).filter(
	   	  * "year in", yearList).list();
	   	  *
	   	  */
	   	 /*
	   	  * // No operator means == Car car =
	   	  * ofy().load().type(Car.class).filter("vin",
	   	  * "123456789").first().now();
	   	  */

	   	 /*
	   	  * // The Query itself is Iterable Query<Car> q =
	   	  * ofy().load().type(Car.class).filter("vin >", "123456789");
	   	  *  for (Car car: q)
	   	  *   {
	   	  *   System.out.println(car.name);
	   	  *   }
	   	  */

	   	 // List<UserDetails> li = ofy().load().type(UserDetails.class).list();

	   	 /*
	   	  * Query<Car> q = ofy().load().type(Car.class);
	   	  *  q = q.filter("vin >",
	   	  * "123456789");
	   	  * q = q.filter("color", RED);
	   	  */
	   	   	 
	   	 resp.getWriter().println("Your data has been saved successfully please check the datastore");

	   	 System.out.println("name = " + name);
	   	 System.out.println("pass = " + pass);

	}
}
