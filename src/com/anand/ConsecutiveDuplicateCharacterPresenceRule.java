package com.anand;

import java.util.regex.Pattern;

public class ConsecutiveDuplicateCharacterPresenceRule implements IPasswordValidatorRule {

    private static final String CONSECUTIVE_DUPLICATE_CHARACTER = "([a-z&&[^eo]])\\1+";

    public boolean isValid(String password) {

        return !Pattern.compile(CONSECUTIVE_DUPLICATE_CHARACTER).matcher(password).find();
    }

}
