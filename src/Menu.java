import java.util.*;
public class Menu {
	static int choice; static String name;
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		AddressBook addressBook=new AddressBook();
		ArrayList<Record> arraylist=new ArrayList<Record>();
		System.out.println("Enter Choice : \n"+"1.Create New AddressBook \n"+"2. Add Record");
		choice=scanner.nextInt();
		switch(choice) {
		case 1:
			addressBook.createNewAddressBook(scanner);
			break;
		case 2:
			addressBook.createRecords(scanner,arraylist);
			break;
		}
	}

}
