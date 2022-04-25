package Contact;

import java.util.Scanner;

public class TestContactList {
    public static void main(String[] args) {

        ContactList contactList = new ContactList();
        Scanner in = new Scanner(System.in);
        Contact c1 = new Contact("Linh","0396077238");
        Contact c2 = new Contact("Qúy", "0396077238");
        Contact c3 = new Contact("Dũng", "0396077238");

        contactList.addContact(c1);
        int seletion;

        do {
            System.out.println(" 1.to add a new contact\n");
            System.out.println(" 2.to add a new contact\n");
            System.out.println(" 3.to remove an existing contact\n");
            System.out.println(" 4.query if an existing contact exists\n");
            System.out.println(" 5.to print a list of available actions.\n");
            System.out.println("6.out");
            seletion = in.nextInt();

            switch (seletion){
                case 1: contactList.addContact();
                break;
                case 2: contactList.setContacts();
                break;
                case 3: contactList.removeContact();
                break;
                case 4 : contactList.searchContact();
                break;
                case 5 : contactList.getContact();
                break;

            }


        }while (seletion <6);
    }
}
