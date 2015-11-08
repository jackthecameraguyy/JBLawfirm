
public class Note {

	String note;
	String lawyer;
	
	public void setNote(String note){
		this.note = note;
	}
	
	public void setLawyer (String lawyer){
		this.lawyer = lawyer;
	}
	
	public String getNote(){
		return note;
	}
	
	public String getLawyer(){
		return lawyer;
	}
	
	public String toString(){
		return lawyer + ": " + note;
	}
	
}
