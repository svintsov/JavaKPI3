package com.bazyl.preparing.controller;

class Validator {


    private enum Groups {group1, group2, group3}

    static boolean isValidFIO(String name) {
        return name.matches(PatternHolder.FIO_PATTERN);
    }

    static boolean isValidNickname(String nickname) {
        return nickname.matches(PatternHolder.NICKNAME_PATTERN);
    }

    static boolean isValidComment(String comment) {
        return comment.matches(PatternHolder.COMMENT_PATTERN);
    }

    static boolean isValidGroup(String group) {
        for (Groups gr : Groups.values()) {
            if (gr.toString().equals(group)) {
                return true;
            }
        }
        return false;
    }

    static boolean isValidPhone(String phone) {
        return phone.matches(PatternHolder.PHONE_PATTERN);
    }

    static boolean isValidEmail(String email) {
        return email.matches(PatternHolder.EMAIL_PATTERN);
    }

    static boolean isValidSkype(String skype) {
        return skype.matches(PatternHolder.SKYPE_PATTERN);
    }

    static boolean isValidIndex(String index) {
        return index.matches(PatternHolder.INDEX_PATTERN);
    }

    static boolean isValidCity(String city) {
        return city.matches(PatternHolder.CITY_PATTERN);
    }

    static boolean isValidStreet(String street) {
        return street.matches(PatternHolder.STREET_PATTERN);
    }

    static boolean isValidHouse(String house) {
        return house.matches(PatternHolder.HOUSE_PATTERN);
    }

    static boolean isValidApartment(String apartment) {
        return apartment.matches(PatternHolder.APARTMENT_PATTERN);
    }
}
