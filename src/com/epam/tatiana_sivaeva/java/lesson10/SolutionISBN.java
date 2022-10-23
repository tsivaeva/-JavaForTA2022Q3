package com.epam.tatiana_sivaeva.java.lesson10;

import java.util.Scanner;

public class SolutionISBN {

    private static final Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {

        String userISBN;

        System.out.println("Could you please enter the ISBN");

        userISBN = scan.next();
        if (userISBN.matches(RegExpISBN.REG_EXPRESSION_ISBN)) {

            System.out.println("Valid ISBN ");
        } else {
            System.out.println("Invalid ISBN");
        }
    }
}
