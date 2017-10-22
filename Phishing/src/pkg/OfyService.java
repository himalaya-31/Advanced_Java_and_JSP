package pkg;
import com.googlecode.objectify.Objectify;
import com.googlecode.objectify.ObjectifyFactory;
import com.googlecode.objectify.ObjectifyService;
import pkg.RegisterEntity;

public class OfyService {
	static{
			ObjectifyService.register(RegisterEntity.class);
		}
	
	public static Objectify ofy(){
		return ObjectifyService.ofy();
	}
	
	 public static ObjectifyFactory factory() {
	        return ObjectifyService.factory();
	    }
}