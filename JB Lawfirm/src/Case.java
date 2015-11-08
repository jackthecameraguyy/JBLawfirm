
public class Case {
	
	int caseNumber;
	String title;
	String status;
	
	public Case(){
		Plaintiff plaintiff = new Plaintiff();
		caseNumber = 0;
		title = "";
		status = "";
		
	}
	public void setCaseNum(int caseNum){
		caseNumber = caseNum;
	}
	public void setTitle(String title){
		this.title = title;
	}
	public void setPlaintiff(){
		
	}
	public void setStatus(String status){
		this.status = status;
	}
	public int getCaseNum(){
		return caseNumber;
	}
	public String getTitle(){
		return title;
	}
	public Plaintiff getPlaintiff(){
		//return plaintiff;
	}
	public String getStatus(){
		return status;
	}
	
	
	
	
}
