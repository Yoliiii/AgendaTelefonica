public class Main {
    public static void main(String[] args) {

        //New Object
        Contact contact = new Contact();
        Contact contac1 = new Contact();
        Contact contact2 = new Contact("Rafael", 760443322, "Avenida Valencia", "Rafael_moya@gmail.com");
        Agenda agenda = new Agenda();


        agenda.AddContacts("Inés", 644330087, "Río Zebra", "Ines_76@gmail.es");
        agenda.DeleteContacts("Ines");
        agenda.ShowContacts();
        agenda.UploadContacts();


        System.out.println(contact);
        System.out.println(contac1);
        System.out.println(contact2);
        contact.setPhone(986544560);
        contact.setName("Isa");
        contact2.setDirection("Rio Tenia");

    }
}
