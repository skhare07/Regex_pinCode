package com.bridgelabz.regexproblems;

import java.util.regex.Pattern;

public class RegexPinUC4 {
    public static boolean isValid(String regex,String input){
        Pattern pattern =  Pattern.compile(regex);
        return pattern.matches(regex,input);
    }
    public static void main(String[] args){
        boolean regexCheck = isValid("^[1-9][0-9]{2}[\s][0-9]{3}$","400 098");
        System.out.println(regexCheck);
    }

}
