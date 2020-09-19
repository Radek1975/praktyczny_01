package pl.sdacademy.phonebook.view;

import pl.sdacademy.phonebook.model.entity.Contact;

import java.util.List;
import java.util.Scanner;

public class PhoneBookEng implements PhoneBookView {
    public int showMenuAndGetOption() {
        System.out.println("Select option");
        System.out.println("1 - Show all contacts");
        System.out.println("2 - Add new contact");
        System.out.println("3 - Delete contact from list");
        System.out.println("4 - Change language");
        System.out.println("0 - Exit program");

        Scanner scanner = new Scanner(System.in);
        int option = scanner.nextInt();

        return option;
    }

    public Contact getContactFromUser() {
        Scanner scanner = new Scanner(System.in);
        Contact contact = new Contact();

        System.out.println("Enter name: ");
        contact.setName(scanner.nextLine());

        System.out.println("Enter last name");
        contact.setLastName(scanner.nextLine());

        System.out.println("Enter mobile");
        contact.setPhone(scanner.nextLine());

        return contact;
    }

    public void showAllContacts(List<Contact> contactList) {
        System.out.println("Contacts list");
        System.out.println("------------------------");
        for(int i = 0; i < contactList.size(); i++) {
            Contact contact = contactList.get(i);
            System.out.println(i + ". " + contact.getName() + " " + contact.getLastName() + " " + contact.getPhone());
        }
    }

    public Integer showContactToDeleteMessage() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter contact index to delete");
        int indexToDelete = scanner.nextInt();

        return indexToDelete;
    }

    public Integer showLanguageSelectMenu() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Select your language");
        System.out.println("1 - Polski");
        System.out.println("2 - English");
        int selectedOption = scanner.nextInt();
        return selectedOption;
    }
}
