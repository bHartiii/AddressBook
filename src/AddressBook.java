/**
 * 
 */
import java.util.*;
/**
 * @author Chandani
 *
 */
public class AddressBook {
	String name;
	public void createRecords(Scanner scanner,ArrayList arraylist){
		Record record=new Record();
		record.setValues(scanner);
		arraylist.add(record); 
		Iterator<Record> iterator=arraylist.iterator();
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}
	}
	public void createNewAddressBook(Scanner scanner){
		System.out.println("Enter the name of new address book - ");
		name=scanner.next();
		ArrayList<Record> arraylist=new ArrayList<Record>();
		System.out.println("New created address book - "+name);
//		Iterator iterator=name.iterator();
//		while(iterator.hasNext()) {
//			System.out.println(iterator.next());
//		}
	}
}
