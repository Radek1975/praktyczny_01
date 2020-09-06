package pl.sdacademy.phonebook.view;

import pl.sdacademy.phonebook.model.entity.Contact;

import java.util.List;

public interface PhoneBookView {
    int showMenuAndGetOption();
    Contact getContactFromUser();
    void showAllContacts(List<Contact> contactList);
    Integer showContactToDeleteMessage();
    Integer showLanguageSelectMenu();
}
