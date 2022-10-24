package com.epam.tatiana_sivaeva.java.lesson10;

//    The first characters such as +7 7 +8 8
//    Digits from 0 to 9
//    PhoneNumber includes 11 Digits


// Valid PhoneNumber: +79372450733, 79372450733, 89372450733
// Invalid PhoneNumber: +19372450733, 99372450733, 89372

// Note: you can use https://regexr.com/


public class RegExpPhoneNumber {
    public static final String REG_EXPRESSION_PHONE_NUMBER = "^[+]?[78]\\d{10}";

}
