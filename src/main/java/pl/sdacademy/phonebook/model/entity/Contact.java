package pl.sdacademy.phonebook.model.entity;

import lombok.Data;

@Data
public class Contact {
    private String name;
    private String lastName;
    private String phone;
}
