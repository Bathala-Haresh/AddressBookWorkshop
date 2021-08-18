package com.adressbook;


/**
 * @author Harish Bathala
 * @date 18-08-2021
 *
 */

public class AddressBookMain {

    /*
     * main method to call AddressBookService
     * @param args
     */
    public static void main(String args[])
    {
        System.out.println("Welcome to Address book");
        // creating reference object for AddressBookService Class
        AddressBookService addressBookService = new AddressBookService();

        // calling createContact method
        addressBookService.createContact();
    }
}
