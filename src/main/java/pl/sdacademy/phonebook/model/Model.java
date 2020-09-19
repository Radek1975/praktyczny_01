package pl.sdacademy.phonebook.model;

import pl.sdacademy.phonebook.model.entity.Contact;

import java.util.ArrayList;
import java.util.List;

public class Model {

    private List<Contact> list = new ArrayList<>();

    public void addContact(Contact contact) {
        list.add(contact);
    }

    public void deleteContact(int index) {
        list.remove(index);
    }

    public List<Contact> getList() {
        return list;
    }
}
