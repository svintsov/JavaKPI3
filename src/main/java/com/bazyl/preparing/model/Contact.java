package com.bazyl.preparing.model;


public class Contact {

  private String name;
  private String surname;
  private String secondName;
  private String nickname;
  private String skype;
  private String email;
  private String homePhone;
  private String mobilePhone;
  private String city;
  private String house;
  private String street;
  private String appartment;
  private String index;
  private String commentary;
  private String group;
  private String lastEditDate;


  public void setLastEditDate(String lastEditDate) {
    this.lastEditDate = lastEditDate;
  }

  public String getFullName() {
    return name + " " + surname + " " + secondName;
  }

  public String getFullAdress() {
    StringBuilder stringBuilder = new StringBuilder();
    stringBuilder.append(index).append(",").append(city)
        .append(",").append(street)
        .append(",").append(house).append(",").append(appartment);
    return stringBuilder.toString();
  }

  public void setGroup(String group) {
    this.group = group;
  }

  public void setStreet(String street) {
    this.street = street;
  }

  public void setName(String name) {
    this.name = name;
  }

  public void setSurname(String surname) {
    this.surname = surname;
  }

  public void setSecondName(String secondName) {
    this.secondName = secondName;
  }

  public void setNickname(String nickname) {
    this.nickname = nickname;
  }

  public void setSkype(String skype) {
    this.skype = skype;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public void setHomePhone(String homePhone) {
    this.homePhone = homePhone;
  }

  public void setMobilePhone(String mobilePhone) {
    this.mobilePhone = mobilePhone;
  }

  public void setCity(String city) {
    this.city = city;
  }

  public void setHouse(String house) {
    this.house = house;
  }

  public void setAppartment(String appartment) {
    this.appartment = appartment;
  }

  public void setIndex(String index) {
    this.index = index;
  }

  public void setCommentary(String commentary) {
    this.commentary = commentary;
  }


}
