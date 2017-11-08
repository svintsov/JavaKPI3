package com.bazyl.preparing.view;

import java.util.Locale;
import java.util.MissingResourceException;
import java.util.ResourceBundle;

public class Console {

    static final String MESSAGES_BUNDLE_NAME = "messages";
    static final ResourceBundle bundle =
            ResourceBundle.getBundle(
                    MESSAGES_BUNDLE_NAME,
                    new Locale("ua"));  // Ukrainian
    //new Locale("en"));        // English

    public static String NAME_INPUT = "input.name";
    public static String SURNAME_INPUT = "input.surname";
    public static String SECONDNAME_INPUT = "input.secondname";
    public static String NICKNAME_INPUT = "input.nickname";
    public static String COMMENT_INPUT = "input.commentary";
    public static String GROUP_INPUT = "input.group";
    public static String HOME_PHONE_INPUT = "input.home_phone";
    public static String MOBILE_PHONE_INPUT = "input.mobile_phone";
    public static String EMAIL_INPUT = "input.mail";
    public static String INDEX_INPUT = "input.index";
    public static String SKYPE_INPUT = "input.skype";
    public static String CITY_INPUT = "input.city";
    public static String STREET_INPUT = "input.street";
    public static String HOUSE_INPUT = "input.house";
    public static String APPARTMENT_INPUT = "input.appartment";

    public static void printMessage(String message) {
        try {
            System.out.println(bundle.getString(message));
        } catch (MissingResourceException MRE) {
            System.out.println(message);
        }
    }

}
