package com.bridgelabs;

import com.adressbook.AddressBookService;
import com.adressbook.AddressBookValidation;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.List;

public class AdressBookTest {
    AddressBookValidation addressBookValidation = null;


    @Before
    public void setup() throws Exception {
        addressBookValidation = new AddressBookValidation();

    }

    /**
     * Purpose : validate the createContact data
     */
    @After
    @Test
    public void firstNameValidationSuccess() {

        boolean result = addressBookValidation.validateName("Harish");
        Assert.assertTrue(result);

    }

    @Test
    public void firstNameValidationFail() {

        boolean result = addressBookValidation.validateName("11harish");
        Assert.assertFalse(result);

    }

    @Test
    public void firstNameValidationEmpty() {

        boolean result = addressBookValidation.validateName(" ");
        Assert.assertFalse(result);

    }
}
