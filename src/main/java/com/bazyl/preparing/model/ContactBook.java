package com.bazyl.preparing.model;


import java.util.ArrayList;
import java.util.List;

public class ContactBook {

  private List<Contact> book;

  public ContactBook() {
    book = new ArrayList<Contact>();
  }

  public void addContact(Contact contact)
      throws NicknameAlreadyExistException {
    for (Contact entry : book) {
      if (entry.getNickname().equals(contact.getNickname())) {
        throw new NicknameAlreadyExistException("Cannot add the new contact.",
            contact.getNickname());
      }
    }
    book.add(contact);
  }

  public void deleteContact(Contact contact) {
    book.remove(contact);
  }
}
