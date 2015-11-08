
public class Plaintiff {
	
	private String name;
	private String phone;
	private String email;
	
	
	public Plaintiff(String name, String phone, String email){
		this.name = name;
		this.phone = phone;
		this.email = email;
	}
	
//	/**
//	 * sets the plaintiff's name
//	 * @param name
//	 */
//	public void setName(String name){
//		this.name = name;
//	}
//	
//	/**
//	 * sets the plaintiff's phone number
//	 * @param phone
//	 */
//	public void setPhone(String phone){
//		this.phone = phone;
//	}
//
//	/**
//	 * sets the plaintiff's email address
//	 * @param email
//	 */
//	public void setEmail(String email){
//		this.email = email;
//	}
	
	/**
	 * @return name
	 */
	public String getName(){
		return name;
	}
	
	/**
	 * @return phone
	 */
	public String getPhone(){
		return phone;
	}
	
	/**
	 * @return email 
	 */
	public String getEmail(){
		return email;
	}
	
	/**
	 * returns a string with plaintiff info in format:
	 * Plaintiff Name: 1234567890, email@email.com
	 * @return plaintiff
	 */
	public String toString(){
		return name + ": " + phone + ", " + email;
	}
	
}
