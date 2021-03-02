import java.util.Scanner;
import java.util.regex.*;

public class UserRegistration{

	static Scanner user = new Scanner(System.in);

	static void userFirstName() {

		String firstName = user.nextLine();
		boolean result = Pattern.matches("^[A-Z]{1}[a-z]{2,14}$",firstName);
		if (result == true) {
			System.out.println("You Have Enter Valid First Name: " +firstName);
		}else {
			System.out.println("Not a Valid Name");
			System.out.println("Please Re-enter The First Name: ");
			userFirstName();
		}
	}

	static void userLastName() {

		String lastName = user.nextLine();
		boolean result = Pattern.matches("^[A-Z]{1}[a-z]{2,14}$",lastName);
		if (result == true) {
			System.out.println("You Have Enter Valid Last Name: " +lastName);
		}else {
			System.out.println("Not a Valid Name");
			System.out.println("Please Re-enter The Last Name: ");
			userLastName();
		}
	}

	static void userEmail() {

		String email = user.nextLine();
		boolean result = Pattern.matches("^[A-Za-z0-9+-]+(\\.[A-Za-z0-9-]+)*@" + "[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$", email);
		if (result == true) {
			System.out.println("You Have Enter Valid Email: " +email);
		}else {
			System.out.println("Not a Valid Email");
			System.out.println("Please Re-enter Email: ");
			userEmail();
		}
	}

	static void userMobileNumber() {

		String mobileNumber = user.nextLine();
		boolean result = Pattern.matches("^[0-9]{2}[ ][6-9]{1}[0-9]{9}$", mobileNumber);
		if (result == true) {
			System.out.println("You Have Enter Valid Mobile Number: " +mobileNumber);
		}else {
			System.out.println("Not a Valid Mobile Number");
			System.out.println("Please Re-enter Mobile Number: ");
			userMobileNumber();
		}
	}

	static void userPassword() {

		String password = user.nextLine();
		boolean result = Pattern.matches("^(?=.*[A-Z])(?=.*[a-z])(?=.*[0-9])(?=[^$@!#%*?&]*[$#@!%*?&][^$@!#%*?&]*$).{8,}", password);
		if (result == true) {
			System.out.println("You Have Entered Valid PassWord ");
		}else {
			System.out.println("Not a Valid Password");
			System.out.println("Please Re-enter PassWord ");
			userPassword();
		}
	}

	public static void main(String[] args){

		System.out.println(" Enter First Name ");
		userFirstName();
		System.out.println(" Enter Last Name ");
		userLastName();
		System.out.println(" Enter Email ID");
		userEmail();
		System.out.println("Enter Mobile Number");
		userMobileNumber();
		System.out.println("Enter Password");
		userPassword();

   }
}
