package com.epam.tatiana_sivaeva.java.lesson10;

import java.util.Scanner;

public class SolutionDate {
    private static final Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Could you please enter the Date (for ex. 2022-Oct-17)");
        String userDate = scan.next();
        if (userDate.matches(RegExpDate.REG_EXPRESSION_DATE)) {
            System.out.println("Valid date ");
        } else {
            System.out.println("Invalid date");
        }
    }
}
