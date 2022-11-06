package com.epam.tatiana_sivaeva.java.lesson2;

import java.util.Scanner;

public class LengthOfLastWord {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String a = scanner.nextLine();

        String[] aParts = a.split(" ");
        String lastWord = aParts[aParts.length - 1];
        int lengthOfLastWord = lastWord.length();

        System.out.println(lengthOfLastWord);

    }
}