package com.bazyl.preparing.controller;


class PatternHolder {
    static final String FIO_PATTERN = "[a-zA-Z]+";
    static final String NICKNAME_PATTERN = "^[a-zA-Z][\\w]*";
    static final String COMMENT_PATTERN = "(/\\*([^*]|[\\r\\n]|(\\*+([^*/]|[\\r\\n])))*\\*+/)|(//.*)";
    static final String PHONE_PATTERN = "^(\\+\\d{1,2}\\s)?\\(?\\d{3}\\)?[\\s.-]\\d{3}[\\s.-]\\d{4}$";
    static final String EMAIL_PATTERN = "(?:[a-z0-9!#$%&'*+/=?^_`{|}~-]+(?:\\.[a-z0-9!#$%&'*+/=?^_`{|}~-]+)*|\"(?:[\\x01-\\x0b\\x0c\\x0e-\\x1f\\x21\\" +
            "x23-\\x5b\\x5d-\\x7f]|\\\\[\\x01-\\x09\\x0b\\x0c\\x0e-\\x7f])*\")@(?:(?:[a-z0-9](?:[a-z0-9-]*[a-z0-9])?\\.)" +
            "+[a-z0-9](?:[a-z0-9-]*[a-z0-9])?|\\[(?:(?:25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)\\.){3}(?:25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?|[a-z0-9-]*[a-z0-9]:" +
            "(?:[\\x01-\\x0b\\x0c\\x0e-\\x1f\\x21-\\x5a\\x53-\\x7f]|\\\\[\\x01-\\x09\\x0b\\x0c\\x0e-\\x7f])+)\\])";
    static final String SKYPE_PATTERN = "^@[\\w]+";
    static final String INDEX_PATTERN = "[0-9]{5}";
    static final String CITY_PATTERN = "[a-zA-Z\\s]+";
    static final String STREET_PATTERN = "[a-zA-Z\\s]+";
    static final String HOUSE_PATTERN = "[1-9]+[a-z]*";
    static final String APARTMENT_PATTERN = "[1-9]+";
}
