package com.anand;

import java.util.regex.Pattern;

public class ConsecutiveConsonantPresenceRule implements IPasswordValidatorRule {

    private static final String CONSECUTIVE_CONSONANT_REGEX = "[a-z&&[^aeiuo]]{3}";

    public boolean isValid(String password) {

        return !Pattern.compile(CONSECUTIVE_CONSONANT_REGEX).matcher(password).find();
    }

}
