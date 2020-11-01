import java.util.*;
import java.io.File;
import java.io.IOException;
public class Menu {
	static int choice; static String name;
	public static void main(String[] args) {
		int flag=0;
		Scanner scanner = new Scanner(System.in);
		AddressBook addressBook=new AddressBook();
		ArrayList<Record> arraylist=new ArrayList<Record>();
		while(flag!=1) {
			System.out.println("Enter Choice : \n"+"1. Create New AddressBook \n"+"2. Add Record \n"+"3. View Address Book \n"+"4. Exit");
			choice=scanner.nextInt();
			switch(choice) {
				case 1:		
					addressBook.createNewAddressBook(scanner);
					break;
				case 2:
					addressBook.createRecords(scanner,arraylist);
					break;
				case 3:
					addressBook.viewAddressBook(scanner);
					break;
				case 4:
					flag=1;
					break;
			}
		}
	}

}
