
public class User {

	String username;
	String password;
	String type;
	
	public User(String username, String password){
		this.username = username;
		this.password = password;
	}
	
	
	public void setType(String t){
		this.type = t;
	}
	public String getType(){
		return type;
	}
	public String toString(){
		return "Username: " + username + "Password: " + password;
	}
}
