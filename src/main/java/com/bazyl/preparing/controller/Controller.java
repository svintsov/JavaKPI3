package com.bazyl.preparing.controller;


import com.bazyl.preparing.model.Contact;
import com.bazyl.preparing.model.ContactBook;
import com.bazyl.preparing.view.Console;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Controller {

  ContactBook contactBook;
  Console console;
  Validator validator;


  public Controller(ContactBook contactBook, Console console) {
    this.contactBook = contactBook;
    this.console = console;
    validator = new Validator();
  }

  public void processUser() {
    Scanner scanner = new Scanner(System.in);
    contactBook.addContact(validateFormAndGetContact(scanner));
  }

  Contact validateFormAndGetContact(Scanner scanner) {
    Contact contact = new Contact();
    validateName(scanner, contact);
    validateSurname(scanner, contact);
    validateSecondName(scanner, contact);
    validateNickName(scanner, contact);
    validateEmail(scanner, contact);
    validateSkype(scanner, contact);
    validateIndex(scanner, contact);
    validateHomePhone(scanner, contact);
    validateMobilePhone(scanner, contact);
    validateGroup(scanner, contact);
    validateCity(scanner, contact);
    validateStreet(scanner, contact);
    validateHouse(scanner, contact);
    validateAppartment(scanner, contact);
    validateComment(scanner, contact);
    registerAndShowDateOfChange(contact);
    return contact;
  }

  void validateName(Scanner scanner, Contact contact) {
    String name;
    do {
      name = inputFromScanner(scanner, Console.NAME_INPUT);
    } while (!Validator.isValidFIO(name));
    contact.setName(name);
  }

  void validateSurname(Scanner scanner, Contact contact) {
    String surname;
    do {
      surname = inputFromScanner(scanner, Console.SURNAME_INPUT);
    } while (!Validator.isValidFIO(surname));
    contact.setSurname(surname);
  }

  void validateSecondName(Scanner scanner, Contact contact) {
    String secondName;
    do {
      secondName = inputFromScanner(scanner, Console.SECONDNAME_INPUT);
    } while (!Validator.isValidFIO(secondName));
    contact.setSecondName(secondName);
  }

  void validateNickName(Scanner scanner, Contact contact) {
    String nickname;
    do {
      nickname = inputFromScanner(scanner, Console.NICKNAME_INPUT);
    } while (!Validator.isValidNickname(nickname));
    contact.setNickname(nickname);
  }

  void validateEmail(Scanner scanner, Contact contact) {
    String email;
    do {
      email = inputFromScanner(scanner, Console.EMAIL_INPUT);
    } while (!Validator.isValidEmail(email));
    contact.setEmail(email);
  }

  void validateSkype(Scanner scanner, Contact contact) {
    String skype;
    do {
      skype = inputFromScanner(scanner, Console.SKYPE_INPUT);
    } while (!Validator.isValidSkype(skype));
    contact.setSkype(skype);
  }

  void validateIndex(Scanner scanner, Contact contact) {
    String index;
    do {
      index = inputFromScanner(scanner, Console.INDEX_INPUT);
    } while (!Validator.isValidIndex(index));
    contact.setIndex(index);
  }

  void validateHomePhone(Scanner scanner, Contact contact) {
    String homePhone;
    do {
      homePhone = inputFromScanner(scanner, Console.HOME_PHONE_INPUT);
    } while (!Validator.isValidPhone(homePhone));
    contact.setHomePhone(homePhone);
  }

  void validateMobilePhone(Scanner scanner, Contact contact) {
    String mobilePhone;
    do {
      mobilePhone = inputFromScanner(scanner, Console.MOBILE_PHONE_INPUT);
    } while (!Validator.isValidPhone(mobilePhone));
    contact.setMobilePhone(mobilePhone);
  }

  void validateGroup(Scanner scanner, Contact contact) {
    String group;
    do {
      group = inputFromScanner(scanner, Console.GROUP_INPUT);
    } while (!Validator.isValidGroup(group));
    contact.setGroup(group);
  }

  void validateComment(Scanner scanner, Contact contact) {
    String commentary;
    do {
      commentary = inputFromScanner(scanner, Console.COMMENT_INPUT);
    } while (!Validator.isValidComment(commentary));
    contact.setCommentary(commentary);
  }

  void validateCity(Scanner scanner, Contact contact) {
    String city;
    do {
      city = inputFromScanner(scanner, Console.CITY_INPUT);
    } while (!Validator.isValidCity(city));
    contact.setCity(city);
  }

  void validateStreet(Scanner scanner, Contact contact) {
    String street;
    do {
      street = inputFromScanner(scanner, Console.STREET_INPUT);
    } while (!Validator.isValidStreet(street));
    contact.setStreet(street);
  }

  void validateHouse(Scanner scanner, Contact contact) {
    String house;
    do {
      house = inputFromScanner(scanner, Console.HOUSE_INPUT);
    } while (!Validator.isValidHouse(house));
    contact.setHouse(house);
  }

  void validateAppartment(Scanner scanner, Contact contact) {
    String appartment;
    do {
      appartment = inputFromScanner(scanner, Console.APPARTMENT_INPUT);
    } while (!Validator.isValidApartment(appartment));
    contact.setAppartment(appartment);
  }

  String inputFromScanner(Scanner scanner, String inputMessage) {
    Console.printMessage(inputMessage);
    while (!scanner.hasNextLine()) {
      Console.printMessage("Incorrect! Try again.\n" + inputMessage);
      scanner.next();
    }
    return scanner.nextLine();
  }

  void registerAndShowDateOfChange(Contact contact) {
    SimpleDateFormat dateOfChangeFormat = new SimpleDateFormat(
        Console.bundle.getString(Console.DATE_FORMAT));
    String lastEditDate = dateOfChangeFormat.format(new Date());
    contact.setLastEditDate(lastEditDate);
    System.out.println(lastEditDate);
  }
}
