package com.epam.tatiana_sivaeva.java.lesson10;

import java.util.Scanner;

public class SolutionEmail {
    private static final Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        String userEmail = scan.next();
        if (userEmail.matches(RegExpEmail.REG_EXPRESSION_EMAIL)) {
            System.out.println("Valid email ");
        } else {
            System.out.println("Invalid email, it can be includes:\n" +
                    "1. Uppercase and lowercase letters in English (A-Z, a-z)\n" +
                    "2. Digits from 0 to 9 \n" +
                    "3. Special characters such as !#$%&'*+/=?^`{|-.\n" +
                    "AND Format is like test@gmail.com \n" +
                    "Please change the email and run the program again.");
        }
    }
}
