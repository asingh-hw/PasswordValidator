package com.anand;

public class PasswordValidatorService {

    public boolean validatePassword(String password){
       return PasswordValidatorFactory.getRules().stream().allMatch(iPasswordValidatorRule -> iPasswordValidatorRule.isValid(password));
    }

}
