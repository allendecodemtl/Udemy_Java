package Exercise.ArrayListChallenge;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    private static Scanner sc = new Scanner(System.in);
    private static MobilePhone mobilePhone = new MobilePhone("0039 330 4483");

    public static void main(String[] args) {
        boolean quit = false;
        int choice = 0;

        startPhone();
        printActions();

        while (!quit) {
            System.out.println("Enter your choice: ");
            choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 0:
                    printActions();
                    break;
                case 1:
                    mobilePhone.printContacts();
                    break;
                case 2:
                    addNewContact();
                    break;
                case 3:
                    updateContact();
                    break;
                case 4:
                    removeContact();
                    break;
                case 5:
                    queryContact();
                    break;
                case 6:
                    quit = true;
                    break;
            }
        }
    }

    private static void addNewContact(){
        System.out.println("Enter new contact name: ");
        String name = sc.nextLine();
        System.out.println("Enter new phone number: ");
        String phone = sc.nextLine();
        Contact newContact = Contact.createContact(name, phone);

        if (mobilePhone.addNewContact(newContact)) {
            System.out.println("New contact added; name = " + name + ", phone = " + phone);
        } else {
            System.out.println("Cannot add, " + name + "already on file");
        }
    }

    private static void updateContact(){
        System.out.println("Enter existing contact name: ");
        String name = sc.nextLine();

        Contact existingContactRecord = mobilePhone.queryContact(name);
        if (existingContactRecord == null){
            System.out.println("Contact not found.");

        }
    }

    private static void startPhone() {
        System.out.println("Starting phone...");
    }

    public static void printActions() {
        System.out.println("\nPress ");
        System.out.println("\t0 - To print choice option");
        System.out.println("\t1 - To print the list of contacts");
        System.out.println("\t2 - To add a contact");
        System.out.println("\t3 - To modify a contact");
        System.out.println("\t4 - To remove a contact");
        System.out.println("\t5 - To search a contact");
        System.out.println("\t6 - To quit ");
    }
}
