package pkg;

import com.googlecode.objectify.annotation.Entity;
import com.googlecode.objectify.annotation.Id;
import com.googlecode.objectify.annotation.Index;

@Entity
public class RegisterEntity {
	@Id
	public String name;
	@Index
	public String password;

	public RegisterEntity() {
	}
	
	public RegisterEntity(String name, String password) {
		this.name = name;
		this.password = password;
	}
}
