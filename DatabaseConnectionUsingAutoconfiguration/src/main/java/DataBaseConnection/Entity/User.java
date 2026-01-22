package DataBaseConnection.Entity;



import jakarta.persistence.Id;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;

@Entity

public class User {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	int id;
	String name;
	
	
	
	
	
	public User() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
	
	
	public User(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}





	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
}
