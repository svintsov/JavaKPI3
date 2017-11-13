package com.bazyl.preparing.controller;

public class Validator {


  private enum Groups {group1, group2, group3}

  public static boolean isValidFIO(String name) {
    return name.matches(PatternHolder.FIO_PATTERN);
  }

  public static boolean isValidNickname(String nickname) {
    return nickname.matches(PatternHolder.NICKNAME_PATTERN);
  }

  public static boolean isValidComment(String comment) {
    return comment.matches(PatternHolder.COMMENT_PATTERN);
  }

  public static boolean isValidGroup(String group) {
    for (Groups gr : Groups.values()) {
      if (gr.toString().equals(group)) {
        return true;
      }
    }
    return false;
  }

  public static boolean isValidPhone(String phone) {
    return phone.matches(PatternHolder.PHONE_PATTERN);
  }

  public static boolean isValidEmail(String email) {
    return email.matches(PatternHolder.EMAIL_PATTERN);
  }

  public static boolean isValidSkype(String skype) {
    return skype.matches(PatternHolder.SKYPE_PATTERN);
  }

  public static boolean isValidIndex(String index) {
    return index.matches(PatternHolder.INDEX_PATTERN);
  }

  public static boolean isValidCity(String city) {
    return city.matches(PatternHolder.CITY_PATTERN);
  }

  public static boolean isValidStreet(String street) {
    return street.matches(PatternHolder.STREET_PATTERN);
  }

  public static boolean isValidHouse(String house) {
    return house.matches(PatternHolder.HOUSE_PATTERN);
  }

  public static boolean isValidApartment(String apartment) {
    return apartment.matches(PatternHolder.APARTMENT_PATTERN);
  }
}
