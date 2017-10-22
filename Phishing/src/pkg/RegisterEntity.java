package pkg;

import com.googlecode.objectify.annotation.Entity;
import com.googlecode.objectify.annotation.Id;
import com.googlecode.objectify.annotation.Index;

@Entity
public class RegisterEntity {
	@Id
	String email;
	@Index
	String password;
	
	public RegisterEntity() {
		// TODO Auto-generated constructor stub
	}
	
	public RegisterEntity(String email, String password){
		this.email = email;
		this.password = password;
	}
}
