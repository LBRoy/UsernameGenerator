/**
 * This class gets and sets the users info for first name, last name
 * and student number, it also contains a method that creates a username using the
 * users information.
 * @author Braden Howard
 */
public class Username {
	// Declarations
	private String first_name;
	private String last_name;
	private long student_number;
	/**
	 * Default Constructor with no argument
	 */
	public Username() {
	}
	/**
	 * Gets the first name
	 * @return String value of students first name
	 */
	public String getFirst_name() {
		return first_name;
	}
	/**
	 * <p>Sets first_name.</p>
	 * <p>This method uses an example taken from GeeksforGeeks that shows how to remove all white space 
	 * from a String in Java.</p>
	 * <p>Reference:</p>
	 * <p>How to remove all white spaces from a String in Java?. GeeksforGeeks.org</p>
	 * <p>https://www.geeksforgeeks.org/how-to-remove-all-white-spaces-from-a-string-in-java/. (accessed May 18, 2023)</p>
	 * 
	 * @param first_name String value given from user
	 */

	public void setFirst_name(String first_name) {
		this.first_name = first_name.replaceAll("\\s","");// Takes out any white space from users input
	}
	/**
	 * Gets the last name
	 * @return String value of students last name
	 */
	public String getLast_name() {
		return last_name;
	}
	/**
	 * <p>Sets last_name.</p>
	 * <p>This method uses an example taken from GeeksforGeeks that shows how to remove all white space
	 * <p>from a String in Java.</p>
	 * <p>Reference:</p>
	 * <p>How to remove all white spaces from a String in Java?. GeeksforGeeks.org</p>
	 * <p>https://www.geeksforgeeks.org/how-to-remove-all-white-spaces-from-a-string-in-java/. (accessed May 18, 2023)</p>
	 *
	 * @param last_name String value given from user
	 */
	public void setLast_name(String last_name) {
		this.last_name = last_name.replaceAll("\\s","");// Takes out any white space from users input
	}
	/**
	 * Gets the student number
	 * @return String value of students student number.
	 */
	public long getStudent_number() {
		return student_number;
	}
	/**
	 * Sets student_number.
	 * @param student_number Long value given by user
	 * @exception java.util.InputMismatchException when user puts in anything but numbers with no decimal places
	 * @exception java.util.InputMismatchException when user inputs a number larger or smaller than the value of a Long data type
	 */
	public void setStudent_number(long student_number) {
		this.student_number = student_number;
	}	
	/**
	 * <p>This method creates a username using the last char of first_name, first three digits of student_number,
	 *  and first three char of last_name, and uses examples taken from multiple sources.</p> 
	 * <p>First example is taken from DigitalOcean that shows how to convert Long data type to String in Java.</p>
	 * <p>Reference:</p>
	 * <p>Java long to String. DigitalOcean.com.</p>
	 * <p>https://www.digitalocean.com/community/tutorials/java-long-to-string. (accessed May 18, 2023)</p>
	 * 
	 * <p>Second example is taken from HowToDoInJava that shows how to get only the first</p>
	 * <p>4 Chars of a String in Java.</p>
	 * <p>Reference:</p>
	 * <p>Get First 4 Chars of a String in Java. HowToDoInJava.com.</p>
	 * <p>https://howtodoinjava.com/java/string/get-first-4-characters/. (accessed May 18, 2023)</p>
	 * 
	 * <p>Third example is taken from LinuxHint.com that shows how to get only the last character of a String in Java.</p>
	 * <p>Reference:</p>
	 * <p>How to Get the Last Character of a String in Java. LinuxHint.com.</p>
	 * <p>https://linuxhint.com/get-last-character-of-string-in-java/. (accessed May 18, 2023)</p>
	 * 
	 * <p>This method creates a username using the last character of first_name, first three digits of student_number, and first three</p>
	 * <p>characters of the last_name. This method allows you to put a negative value for the student number, but</p>
	 * <p>will output the negative sign as the first digit then the two digits that come after it. The method will</p>
	 * <p>still work if the user inputs numbers or symbols for their first and last name. </p>
	 * 
	 * @return the new Username in all lowercase 
	 * @exception java.lang.StringIndexOutOfBoundsException when user inputs nothing into the console for first name
	 * @exception java.lang.StringIndexOutOfBoundsException when user inputs less than 3 characters for last name
	 * @exception java.lang.StringIndexOutOfBoundsException when user inputs a space between any of the first three
	 * digits of the student number
	 * @exception java.util.InputMismatchException when user inputs a value with a decimal for student number
	 * @exception java.lang.StringIndexOutOfBoundsException when user inputs a number like 000000012 because it will
	 * only use the numbers after the leading zero's. It needs a minimum of 3 meaningful digits.
	 */
	public String createUsername() {
		String studentNum = student_number+""; // Converts Long to String
		String firstThreeDigits = studentNum.substring(0,3);// Uses first three indexes of String
		String firstThreeChar = last_name.substring(0,3);// Uses first three indexes of String
		String lastChar = first_name.substring(first_name.length()-1);//Uses last index of the string
		String username = "Username is: " + lastChar + firstThreeDigits + firstThreeChar;
		return username.toLowerCase();
	}
}
	

	

