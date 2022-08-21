package com.anand;

import java.util.regex.Pattern;

public class ConsecutiveVowelPresenceRule implements IPasswordValidatorRule {

    private static final String CONSECUTIVE_VOWEL_REGEX = "\\b\\w*[aeiou]{3,}\\w*\\b";

    public boolean isValid(String password) {

        return !Pattern.compile(CONSECUTIVE_VOWEL_REGEX).matcher(password).find();
    }
}
