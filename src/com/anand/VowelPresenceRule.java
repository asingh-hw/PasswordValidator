package com.anand;

import java.util.regex.Pattern;

public class VowelPresenceRule implements IPasswordValidatorRule {

    private static final String VOWEL_REGEX = "[aeiou]";

    public boolean isValid(String password) {

        return Pattern.compile(VOWEL_REGEX).matcher(password).find();
    }

}
