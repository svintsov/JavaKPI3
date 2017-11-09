package com.bazyl.preparing.model;


import java.util.ArrayList;
import java.util.List;

public class ContactBook {

  private List<Contact> book;

  public ContactBook() {
    book = new ArrayList<Contact>();
  }

  public void addContact(Contact contact) {
    book.add(contact);
  }

  public void deleteContact(Contact contact) {
    book.remove(contact);
  }
}
