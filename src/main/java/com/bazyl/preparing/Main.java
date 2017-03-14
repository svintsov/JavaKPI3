package com.bazyl.preparing;

import com.bazyl.preparing.controller.Controller;
import com.bazyl.preparing.model.ContactBook;
import com.bazyl.preparing.view.Console;

public class Main{

    public static void main(String[] args) {
        ContactBook contactBook = new ContactBook();
        Console console = new Console();
        Controller controller = new Controller(contactBook,console);
        controller.processUser();
    }
}
