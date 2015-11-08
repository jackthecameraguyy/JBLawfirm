
public class Case {
	//initialize variables
	int caseNumber;
	String title;
	String status;
	
	//default constructor
	public Case(){
		caseNumber = 0;
		title = "";
		status = "";
		
	}
	
	/**	 
	 * @param caseNum
	 */
	public void setCaseNum(int caseNum){
		caseNumber = caseNum;
	}
	
	/**
	 * 
	 * @param title
	 */
	public void setTitle(String title){
		this.title = title;
	}
	
	/**
	 * 
	 * @param name
	 * @param phone
	 * @param email
	 */
	public void setPlaintiff(String name, String phone, String email ){
		
		Plaintiff plaintiff = new Plaintiff(name, phone, email);
		
	}
	
	//set the status
	/**
	 * 
	 * @param status
	 */
	public void setStatus(String status){
		this.status = status;
	}
	//get casenumber
	public int getCaseNum(){
		return caseNumber;
	}
	//get title
	public String getTitle(){
		return title;
	}
	
	
	//public Plaintiff getPlaintiff(){}
	
	
	public String getStatus(){
		return status;
	}
	public String toString(){
		return "Case Number:" + caseNumber + "Status: " + status + " Title: " + title ;
	}
	
	
	
	
}
