package com.epam.tatiana_sivaeva.java.lesson10;

//    Uppercase and lowercase letters in English (A-Z, a-z)
//    Digits from 0 to 9
//    Special characters such as !#$%&'*+/=?^`{|-.
//    @ and . - not first symbol
//    . not last symbol

// Valid emails: someone@gmail.com   any.doe.1@yahoo.com   any@any.io
// Invalid emails: @domainsample.com johndoedomainsample.com  john.doe@.net john.doe43@domainsample

// Note: you can use https://regexr.com/


public class RegExpEmail {
    public static final String regularExpressionEmail = "^[a-zA-Z][a-zA-Z_0-9!#$%&'*+/=?^`{|-]+@[a-zA-Z]+\\.[a-zA-Z]{2,3}";
}
