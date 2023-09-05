
import java.util.Scanner;
/**
 * This class prompts the user to input their first name, last name,
 * and their student number, it also calls methods to print out the new username.
 * @author Braden Howard
 */
public class Driver {
	/**
	 * Inside of main() 
	 * @param args parameter (not used)
	 */
	public static void main(String[] args) {
		// Declarations
		Scanner keyboard = new Scanner(System.in);
		Username username = new Username();
		String first_name;
		String last_name;
		long student_number;
		
		// Prompt user to input first name.
		System.out.println("Please input your first name: ");
		first_name = keyboard.nextLine();
		username.setFirst_name(first_name);
		
		// Prompt user to input last name.
		System.out.println("Please input your last name: ");
		last_name = keyboard.nextLine();
		username.setLast_name(last_name);
		
		// Prompt user for student number.
		System.out.println("Please input your student number: ");
		student_number = keyboard.nextLong();
		username.setStudent_number(student_number);
		
		// Outputs users new Username
		System.out.println(username.createUsername());
		System.out.println("Program by Braden Howard");
		keyboard.close();
	}

}
