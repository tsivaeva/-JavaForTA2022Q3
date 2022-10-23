package com.epam.tatiana_sivaeva.java.lesson10;

import java.util.Scanner;

public class SolutionPhoneNumber {
    private static final Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Could you please enter the User Phone Number");
        String userPhoneNumber = scan.next();
        if (userPhoneNumber.matches(RegExpPhoneNumber.REG_EXPRESSION_PHONE_NUMBER)) {
            System.out.println("Valid PhoneNumber ");
        } else {
            System.out.println("Invalid PhoneNumber, it can be includes:\n" +
                    "1. Digits from 0 to 9\n" +
                    "2. The first characters such as +7 7 +8 8 \n" +
                    "3. The length of the phone number is 11 characters");
        }
    }
}
