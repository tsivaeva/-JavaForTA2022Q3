package com.epam.tatiana_sivaeva.java.lesson2;

//Given an integer n, return a string array answer (1-indexed) where:
//
//        answer[i] == "FizzBuzz" if i is divisible by 3 and 5.
//        answer[i] == "Fizz" if i is divisible by 3.
//        answer[i] == "Buzz" if i is divisible by 5.
//        answer[i] == i (as a string) if none of the above conditions are true.

import java.util.Scanner;

public class FizzBuzz {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        for (int i = 1; i <= n; i++) {
            if (((i % 3) == 0) && ((i % 5) == 0))
                System.out.println("FizzBuzz");
            else if ((i % 3) == 0)
                System.out.println("Fizz");
            else if ((i % 5) == 0)
                System.out.println("Buzz");
            else
                System.out.println(i);
        }
    }
}
