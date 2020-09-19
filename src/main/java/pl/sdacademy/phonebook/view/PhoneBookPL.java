package pl.sdacademy.phonebook.view;

import pl.sdacademy.phonebook.model.entity.Contact;

import java.util.List;
import java.util.Scanner;

public class PhoneBookPL implements PhoneBookView {

    public int showMenuAndGetOption() {
        System.out.println("\nWybierz jedna z opcji:");
        System.out.println("0 - Wyjdź z programu");
        System.out.println("1 - Wyswietl wszystkie kontakty");
        System.out.println("2 - Dodaj nowy kontakt");
        System.out.println("3 - Usuń kontakt z listy");
        System.out.println("4 - Zmień język");

        Scanner scanner = new Scanner(System.in);
        int option = scanner.nextInt();

        return option;
    }

    public Contact getContactFromUser() {
        Scanner scanner = new Scanner(System.in);
        Contact contact = new Contact();

        System.out.print("Podaj imię: ");
        contact.setName(scanner.nextLine());

        System.out.print("Podaj nazwisko: ");
        contact.setLastName(scanner.nextLine());

        System.out.print("Podaj numer telefonu: ");
        contact.setPhone(scanner.nextLine());

        return contact;
    }

    public void showAllContacts(List<Contact> contactList) {
        System.out.println("\nLista kontaktów:");
        for(int i = 0; i < contactList.size(); i++) {
            Contact contact = contactList.get(i);
            System.out.println((i+1) + ". " + contact.getName() + " " + contact.getLastName() + ", tel. " + contact.getPhone());
        }
    }

    public Integer showContactToDeleteMessage() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj numer kontaktu do usunięcia");
        int indexToDelete = scanner.nextInt();

        return indexToDelete;
    }

    public Integer showLanguageSelectMenu() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Wybierz wersję językową");
        System.out.println("0 - język polski");
        System.out.println("1 - język angielski");
        int selectedOption = scanner.nextInt();
        return selectedOption;
    }
}
