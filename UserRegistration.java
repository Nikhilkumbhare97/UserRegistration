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

	public static void main(String[] args){

	System.out.println(" Enter First Name ");
	userFirstName();
	System.out.println(" Enter Last Name ");
	userLastName();

   }
}
