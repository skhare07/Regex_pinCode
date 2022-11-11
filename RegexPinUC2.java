package com.bridgelabz.regexproblems;

import java.util.regex.Pattern;

public class RegexPinUC2 {
    public static boolean isValid(String regex,String input){
        Pattern pattern =  Pattern.compile(regex);
        return pattern.matches(regex,input);
    }
    public static void main(String[] args){
        boolean regexCheck = isValid("^[1-9]{1}[0-9]{5}$","A400098");
        System.out.println(regexCheck);
    }

}
