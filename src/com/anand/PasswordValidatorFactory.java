package com.anand;

import java.util.ArrayList;
import java.util.List;

public final class PasswordValidatorFactory {

    private PasswordValidatorFactory(){}

    public static List<IPasswordValidatorRule> getRules(){
        List<IPasswordValidatorRule> passwordValidatorRules = new ArrayList<>();
        passwordValidatorRules.add(new VowelPresenceRule());
        passwordValidatorRules.add(new ConsecutiveVowelPresenceRule());
        passwordValidatorRules.add(new ConsecutiveConsonantPresenceRule());
        passwordValidatorRules.add(new ConsecutiveDuplicateCharacterPresenceRule());
        return passwordValidatorRules;
    }
}
