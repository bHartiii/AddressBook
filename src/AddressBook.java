/**
 * 
 */
import java.io.*;
import java.util.*;

/**
 * @author Chandani
 *
 */
public class AddressBook {
	
	String name;String entrySet;
	
	public void readAddressBooks() {
		System.out.println("Choose AddressBook - ");
		File[] addressBooks = new File("F:\\oops\\AddressBook\\AddressBook\\src\\csv\\").listFiles();
		for(File fileName : addressBooks) {
			if(fileName.isFile()) {
				System.out.println(fileName.getName());
			}
		}
	}
	public void viewAddressBook(Scanner scanner) {
		readAddressBooks();
		String file=scanner.next();
		try {
			Scanner reader=new Scanner(new File("F:\\oops\\AddressBook\\AddressBook\\src\\csv\\"+file+".csv"));
			reader.useDelimiter("\n");
			while(reader.hasNext()) {
				System.out.println(reader.next());
			}
			reader.close();
		}catch(IOException e) {
			System.out.println("An error occurred!!!");
		}
	}
	public void createRecords(Scanner scanner,ArrayList arraylist){
		readAddressBooks();
		String file=scanner.next();
		System.out.println("Enter the number of records to be inserted - ");
		int num=scanner.nextInt();
		for(int i=0;i<num;i++)
		{
			Record record=new Record();
			record.setValues(scanner);
			arraylist.add(record); 
			Iterator<Record> iterator=arraylist.iterator();
			try {
				FileWriter fileWriter=new FileWriter("F:\\oops\\AddressBook\\AddressBook\\src\\csv\\"+file+".csv",true);
				while(iterator.hasNext()) {
					entrySet=iterator.next().toString();
				}
					fileWriter.write(entrySet);
					fileWriter.append("\n");
					fileWriter.close();
					System.out.println("Successfully wrote the new record!!!");
			}
			catch(IOException e) {
				System.out.println("An error occurred");
				e.printStackTrace();
			}
		}
	}
	
	public void createNewAddressBook(Scanner scanner){
		System.out.println("Enter the name of new address book - ");
		name=scanner.next();
		try {
			File file=new File("F:\\oops\\AddressBook\\AddressBook\\src\\csv\\"+name+".csv");
			if(file.createNewFile()) {
				System.out.println("New created address book - "+name);
				}
			}
			catch (IOException e) {
				System.out.println("An error occured");
				e.printStackTrace();
			}
		
	}
}
