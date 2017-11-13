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

  public String getName() {
    return name;
  }

  public String getSurname() {
    return surname;
  }

  public String getSecondName() {
    return secondName;
  }

  public String getNickname() {
    return nickname;
  }

  public String getSkype() {
    return skype;
  }

  public String getEmail() {
    return email;
  }

  public String getHomePhone() {
    return homePhone;
  }

  public String getMobilePhone() {
    return mobilePhone;
  }

  public String getCity() {
    return city;
  }

  public String getHouse() {
    return house;
  }

  public String getStreet() {
    return street;
  }

  public String getAppartment() {
    return appartment;
  }

  public String getIndex() {
    return index;
  }

  public String getCommentary() {
    return commentary;
  }

  public String getGroup() {
    return group;
  }

  public String getLastEditDate() {
    return lastEditDate;
  }
}
