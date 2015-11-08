import javax.swing.JOptionPane;

/*The implementation class for the JavaBeaner's Law Firm.
The application class holds the array of case types, searches 
through cases, collects user input & login in information*/
public class LawFirm {
	public static void main(String[] args){

	int choice = 0;
	choice = showLoginMenu();
	
	}
	
	private static int showLoginMenu() {
		String choice = "";
		int menuError = 0;
		do {
			try { 
				choice = JOptionPane.showInputDialog(null, "Please enter your username:", 
				"JavaBeaners Law Firm", JOptionPane.QUESTION_MESSAGE);
				menuError = 1;
				if (choice.equals("")) {
					throw new NullPointerException();
				}
			}
			catch (NullPointerException e) {
				JOptionPane.showMessageDialog(null, "Goodbye!", "JavaBeaners Law Firm", 
				JOptionPane.INFORMATION_MESSAGE);
				menuError = 0;
			}
		} while(menuError == 0);
		
		
		return 0;
	}
}


