import javax.swing.JOptionPane;

/*The implementation class for the JavaBeaner's Law Firm.
The application class holds the array of case types, searches 
through cases, collects user input & login in information*/
public class LawFirm {
	public static void main(String[] args){

	int choice = 0;
	boolean login = false;
	do {
		login = showLoginMenu();
		if (login == false){
			choice = (int) JOptionPane.showInputDialog(null, "You have entered an incorrect password"
					+ " or username. Would you like to try again?", 
					"JavaBeaners Law Firm", JOptionPane.YES_NO_OPTION,
					null, args, JOptionPane.QUESTION_MESSAGE);
			if (choice != 0) {
				JOptionPane.showMessageDialog(null, "Goodbye!", "JavaBeaners Law Firm",
						JOptionPane.INFORMATION_MESSAGE);
				break;
			}
		}
	} while (choice == 0 && login == false);
	
	
	
}
	/**
	 * This method creates a user object & gets the username & password. 
	 * @return
	 */
	private static boolean showLoginMenu() {
		String userName = "";
		int menuError = 0;
		
		//gets the user input for the username. 
		do {
			try { 
				userName = JOptionPane.showInputDialog(null, "Please enter your username:", 
				"JavaBeaners Law Firm", JOptionPane.QUESTION_MESSAGE);
				menuError = 1;
				if (userName.equals("")) {
					throw new NullPointerException();
				}
			}
			//the program asks for a username until 
			catch (NullPointerException e) {
				JOptionPane.showMessageDialog(null, "Goodbye!", "JavaBeaners Law Firm", 
				JOptionPane.INFORMATION_MESSAGE);
				menuError = 0;
			}
		} while(menuError == 0);
		//Creates a new user object that takes in a username and password
		
		String password = "";
		//gets user input for the password
		do {
			try { 
				password = JOptionPane.showInputDialog(null, "Please enter your password:", 
				"JavaBeaners Law Firm", JOptionPane.QUESTION_MESSAGE);
				menuError = 1;
				if (password.equals("")) {
					throw new NullPointerException();
				}
			}
			catch (NullPointerException e) {
				JOptionPane.showMessageDialog(null, "Goodbye!", "JavaBeaners Law Firm", 
				JOptionPane.INFORMATION_MESSAGE);
				menuError = 0;
			}
		} while(menuError == 0);
		boolean error = false;
		//the method in user is created that checks credientals
		//User user = new User(username, password);
		//boolean error = user.checkCredientals();
		if (error = false) {
			return false;
		}
		else {
			//Calls the method to set the type of user that 
			//setUser(user);
		}
		return false;
	}
}