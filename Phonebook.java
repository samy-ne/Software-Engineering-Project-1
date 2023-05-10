import java.util.ArrayList;
//include Contact;
public class Phonebook {
	public static void main(String[] args) {
		ArrayList<Contact> phonebook = new ArrayList<Contact>();
		
		// add some contacts to the phonebook
		Contact contact1 = new Contact();
		contact1.SetName("yaniv");
		contact1.SetNumber("555-1234");
		phonebook.add(contact1);
		
		Contact contact2 = new Contact();
		contact2.SetName("hajaj");
		contact2.SetNumber("555-5678");
		phonebook.add(contact2);
		
		// print all contacts in the phonebook
		for (Contact contact : phonebook) {
			contact.PrintContact();
		}
	}
}