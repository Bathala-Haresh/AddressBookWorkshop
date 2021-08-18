package com.adressbook;

import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class AddressBookValidation {

    private static final String NAME_PATTERN = "^[A-Z]{1}[a-z]{2,20}";

    /**
     * Boolean Method to validate name
     * @param name
     * @return boolean value
     */
    public boolean validateName(String name) {
        return patternChecker(name, NAME_PATTERN);
    }

    /**
     * method to check the pattern
     * @param input
     * @param fieldPattern
     * @return
     */
    private boolean patternChecker(String input, String fieldPattern) {
        Pattern pattern = Pattern.compile(fieldPattern);
        Matcher matcher = pattern.matcher(input);
        boolean result = matcher.matches();
        return result;
    }

}
