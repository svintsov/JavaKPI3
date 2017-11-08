package com.bazyl.preparing.controller;

import org.junit.Assert;
import org.junit.Test;

public class ValidatorTest {
    @Test
    public void isValidIndex() throws Exception {
        Assert.assertTrue(Validator.isValidIndex("02229"));
    }

    @Test
    public void isValidCity() throws Exception {
        Assert.assertTrue(Validator.isValidCity("New York"));
    }

    @Test
    public void isValidStreet() throws Exception {
        Assert.assertTrue(Validator.isValidStreet("Gogol"));
    }

    @Test
    public void isValidHouse() throws Exception {
        Assert.assertTrue(Validator.isValidHouse("22b"));
    }

    @Test
    public void isValidApartment() throws Exception {
        Assert.assertTrue(Validator.isValidApartment("222"));
    }

    @Test
    public void isValidSkype() throws Exception {
        Assert.assertTrue(Validator.isValidSkype("@hello"));
    }

    @Test
    public void isValidEmail() throws Exception {
        Assert.assertTrue(Validator.isValidEmail("svintcov95@gmail.com"));
    }

    @Test
    public void isValidPhone() throws Exception {
        Assert.assertTrue(Validator.isValidPhone("044 543 4766"));
    }


    @Test
    public void isValidGroup() throws Exception {
        Assert.assertTrue(Validator.isValidGroup("group1"));
    }

    @Test
    public void isValidComment() throws Exception {
        Assert.assertTrue(Validator.isValidComment("/*\n" +
                "*there\n" +
                "*/"));
    }

    @Test
    public void isValidNickname() throws Exception {
        Assert.assertTrue(Validator.isValidNickname("h_"));
    }

    @org.junit.Test
    public void validateFIO() throws Exception {
        Assert.assertTrue(Validator.isValidFIO("hello"));
    }

}