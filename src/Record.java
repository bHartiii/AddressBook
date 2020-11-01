/**
 * 
 */
import java.util.*;
/**
 * @author Chandani
 *
 */
public class Record {
	String firstName;String lastName;String city;String state;int zipCode;int phoneNo;
	public void setValues(Scanner scanner) {
		System.out.println("Enter first name - ");
		firstName=scanner.next();
		System.out.println("Enter last name - ");
		lastName=scanner.next();
		System.out.println("Enter city - ");
		city=scanner.next();
		System.out.println("Enter state - ");
		state=scanner.next();
		System.out.println("Enter zipcode - ");
		zipCode=scanner.nextInt();
		System.out.println("Enter phone no - ");
		phoneNo=scanner.nextInt();
		
	}
	@override
	public String toString() {
		return "New Record : \n Name - "+firstName+" "+lastName+" City - "+city+" State - "+state+" Zipcode - "+zipCode+" Phone No - "+phoneNo;
	}
	
}
