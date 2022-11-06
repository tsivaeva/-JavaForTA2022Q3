package com.epam.tatiana_sivaeva.java.lesson2;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String x = scanner.nextLine();

        String y = "";

        for (int i = x.length() - 1; i >= 0; i--) {
            y = y + x.charAt(i);
        }

        if (x.equals(y)) {
            System.out.println("TRUE");
        } else {
            System.out.println("FALSE");
        }
    }
}
