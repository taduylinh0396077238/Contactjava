package Contact;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ContactList {


//    public static void main(String[] args) {
//        List<String> Contact = new ArrayList<>();
//
//        Contact.add("Danh sách 1");
//        Contact.add("Danh sách đv Qúy");
//
//        System.out.println(Contact);
//         Contact.add(1,"Danh sách 2");
//
//        System.out.println(Contact);
//
//
//    }

    private List<Contact> Contacts;
    private static Scanner in = new Scanner(System.in);

   public ContactList(){
       this.Contacts = new ArrayList<>();

   }

    public void getContact(){
       for (Contact stu : Contacts){
           System.out.println("("+ stu.getName()+")"+ stu.getPhone());

       }
    }

    public void addContact(Contact contact){
       Contacts.add(contact);
    }
    public void addContact(){
        String name;
        String phone;


        System.out.println("Enter new Contact name  ");
        System.out.println("Enter new Contact name new");
        name = in.next();

        if (Contacts.stream().allMatch(contact -> !contact.getName().equals(name))){
            System.out.println("Enter phone number");
            phone = in.next();
        }else {
            System.out.println("this person already exists");
        }
    }
        public void setContacts(){
            System.out.println("Enter existing contact name:");
            String id = in.next();
            boolean check = false;
            Contact stu = null;

            for(Contact contact : Contacts){
                if (contact.getName().equals(id)){
                    check = true;
                    stu = contact;
                    break;
                }
            }
            if (check){
                System.out.println("Enter existing contact name:");
                System.out.println("1:Enter new contact name:");
                System.out.println("2:Enter new contact phone number:");
                int  selection = in.nextInt();


                switch (selection){
                    case 1:
                        System.out.println("Enter to change");
                        String name = in.next();
                        for (Contact contact : Contacts){
                            if (contact.equals(stu)){
                                contact.setName(name);
                            }
                        }
                    case 2:
                        System.out.println("Enter to change");
                        String phone = in.next();
                        for (Contact contact : Contacts){
                            if (contact.equals(stu)){
                                contact.setName(phone);
                            }
                        }
                        break;
                    default:
                        System.out.println("Bạn đã chọn sai");
                }

            }else {
                System.out.println("ID bạn ko tồn tại");
            }

        }
        public void removeContact(){
            System.out.println("  E nter existing contact name ");
//            enter existing contact name
//            was deleted -- successfully deleted
            String name = in.next();
            if (Contacts.stream().anyMatch(contact -> contact.getName().equals(name))){
                for (Contact contact : Contacts){
                    if (contact.getName().equals(name)){
                        Contacts.remove(contact);
                        System.out.println(" Successfully deleted");
                        break;
                    }
                }
            }else {
                System.out.println("Does not exist");
            }
        }
        public void searchContact(){
            System.out.println("Query if an existing contact exists");
            System.out.println("1:Name");
            System.out.println("2:Phone");
            int selection = in.nextInt();

            System.out.println("Enter search text");
            String key = in.next();
            switch (selection){
                case 1:
                    if (Contacts.stream().anyMatch(contact -> contact.getName().contains(key))){
                        for (Contact contact : Contacts){
                            if (contact.getName().contains(key)){
                                System.out.println("("+ contact.getName()+")"+ contact.getPhone());
                            }
                        }
                    }
                    break;
                case 2:
                    if (Contacts.stream().anyMatch(contact -> contact.getPhone().contains(key))){
                        for (Contact contact : Contacts){
                            if (contact.getPhone().contains(key)){
                                System.out.println("("+ contact.getName()+")"+ contact.getPhone());
                            }
                        }
                    }
            }
        }
//    to print a list of available actions.
}
