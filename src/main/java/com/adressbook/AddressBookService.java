package com.adressbook;

import java.util.Scanner;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class AddressBookService {

    private String firstName;
    private String lastName;
    private String address;
    private String city;
    private String state;
    private int zip;
    private String phoneNumber;
    private String email;

    AddressBookValidation addressBookValidation = new AddressBookValidation();

    /**
     * Allow to create the contact with zero parameters.
     *
     * Entered Details set to the Contact Object.
     */
    public void createContact() {
        Contacts contacts = new Contacts();
        Scanner sc = new Scanner(System.in);

        System.out.println("enter first name");
        firstName = sc.nextLine();
        addressBookValidation.validateName(firstName);
        contacts.setFirstName(firstName);
        System.out.println("enter last name");
        lastName = sc.nextLine();
        addressBookValidation.validateName(lastName);
        contacts.setLastName(lastName);
        System.out.println("enter address");
        address = sc.nextLine();
        addressBookValidation.validateName(address);
        contacts.setAddress(address);
        System.out.println("enter city");
        city = sc.nextLine();
        addressBookValidation.validateName(city);
        contacts.setEmail(city);
        System.out.println("enter state");
        state = sc.nextLine();
        addressBookValidation.validateName(state);
        contacts.setState(state);
        System.out.println("enter zip");
        zip = sc.nextInt();
        contacts.setZip(zip);
        System.out.println("enter phone number");
        phoneNumber = sc.nextLine();
        addressBookValidation.validateName(phoneNumber);
        contacts.setPhoneNumber(phoneNumber);
        System.out.println("enter email");
        email = sc.nextLine();
        addressBookValidation.validateName(email);
        contacts.setEmail(email);

    }

}
