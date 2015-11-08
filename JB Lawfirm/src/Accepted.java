
public class Accepted extends Case {
	
	int numLawyers;
	String courthouseName;
	float numDaysTrial;
	
	
	public Accepted(){
		super();
		numLawyers  = 0;
		courthouseName = "";
		numDaysTrial = 0;
		
	}
	public void setNumLawyers(int num){
		numLawyers = num;
		
	}
	public void setCourthouseName(String court){
		courthouseName = court;
	}
	public void setNumDaysTrial(float days){
		numDaysTrial = days;
	}
	public int getNumLawyers(){
		return numLawyers;
	}
	public String getCourthouseName(){
		return courthouseName;
	}
	public float getNumDaysTrial(){
		return numDaysTrial;
	}
	public String toString(){
		return "NumLawyers: " + numLawyers + " Courthouse name:" +courthouseName + "Number of days trial is: " + numDaysTrial;
	}
	
}
