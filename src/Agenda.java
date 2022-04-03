import java.util.ArrayList;
import java.util.Calendar;

public class Agenda {

    //Attributes
    private ArrayList<Contact>contacts = new ArrayList<>();

    //Methods

    //Add Contacts
    public void AddContacts(String name, int phone, String direction, String email){
        Contact contact = new Contact(name, phone, direction, email);
        contacts.add(contact);
        System.out.println("Contact added");
    }

    //Delete Contacts
    public void DeleteContacts(String name){
        for (int i = 0; i < contacts.size(); i++){
            if(name == contacts.get(i).getName()){
                contacts.remove(i);
                System.out.println("Deleted contact");
            }
        }
    }

    //Show Contacts
    public void ShowContacts(){
        for (int i = 0; i < contacts.size(); i++){
            System.out.println(contacts.get(i));
        }
    }

    //Upload Contacts
    public void UploadContacts(){

        Contact contact1 = new Contact("Yolanda", 638001334, "Calle Río Cenia", "yolanda_oropesa@hotmail.com");
        Contact contact2 = new Contact("Miguel", 68502001, "Calle Río Turia", "miguel_orie@hotmail.com");
        Contact contact3 = new Contact("Gema", 743567789, "Calle Río Venecia", "gem93@gmail.com");
        Contact contact4 = new Contact("Nerea", 698667423, "Calle Río Palencia", "NereaTruji_93@gmail.com");
        Contact contact5 = new Contact("Diego", 600981122, "Avenida Valencia", "diegacho92@gmail.com");
        contacts.add(contact1);
        contacts.add(contact2);
        contacts.add(contact3);
        contacts.add(contact4);
        contacts.add(contact5);
        ShowContacts();
    }

    //Empty Agenda
    public void EmptyAgenda(){
        contacts.clear();
        System.out.println("The agenda is empty");
    }
}
