package com.bazyl.preparing.controller;

import org.junit.Assert;
import org.junit.Test;

public class ValidatorTest {
    @Test
    public void isValidIndex() throws Exception {
        Validator validator = new Validator();
        Assert.assertTrue(validator.isValidIndex("02229"));
    }

    @Test
    public void isValidCity() throws Exception {
        Validator validator = new Validator();
        Assert.assertTrue(validator.isValidCity("New York"));
    }

    @Test
    public void isValidStreet() throws Exception {
        Validator validator = new Validator();
        Assert.assertTrue(validator.isValidStreet("Gogol"));
    }

    @Test
    public void isValidHouse() throws Exception {
        Validator validator = new Validator();
        Assert.assertTrue(validator.isValidHouse("22b"));
    }

    @Test
    public void isValidApartment() throws Exception {
        Validator validator = new Validator();
        Assert.assertTrue(validator.isValidApartment("222"));
    }

    @Test
    public void isValidSkype() throws Exception {
        Validator validator = new Validator();
        Assert.assertTrue(validator.isValidSkype("@hello"));
    }

    @Test
    public void isValidEmail() throws Exception {
        Validator validator = new Validator();
        Assert.assertTrue(validator.isValidEmail("svintcov95@gmail.com"));
    }

    @Test
    public void isValidPhone() throws Exception {
        Validator validator = new Validator();
        Assert.assertTrue(validator.isValidPhone("044 543 4766"));
    }


    @Test
    public void isValidGroup() throws Exception {
        Validator validator = new Validator();
        Assert.assertTrue(validator.isValidGroup("group1"));
    }

    @Test
    public void isValidComment() throws Exception {
        Validator validator = new Validator();
        Assert.assertTrue(validator.isValidComment("/*\n" +
                "*there\n" +
                "*/"));
    }

    @Test
    public void isValidNickname() throws Exception {
        Validator validator = new Validator();
        Assert.assertTrue(validator.isValidNickname("h_"));
    }

    @org.junit.Test
    public void validateFIO() throws Exception {
        Validator validator = new Validator();
        Assert.assertTrue(validator.isValidFIO("hello"));
    }

}