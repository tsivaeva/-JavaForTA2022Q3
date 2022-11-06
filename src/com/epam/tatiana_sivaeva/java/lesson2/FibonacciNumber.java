package com.epam.tatiana_sivaeva.java.lesson2;

//The Fibonacci numbers, commonly denoted F(n) form a sequence, called the Fibonacci sequence, such that each number is
// the sum of the two preceding ones, starting from 0 and 1. That is,
//
//        F(0) = 0, F(1) = 1
//        F(n) = F(n - 1) + F(n - 2), for n > 1.
//        Given n, calculate F(n)

import java.util.Scanner;

public class FibonacciNumber {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        int[] f = new int[n + 1];
        f[0] = 0;
        f[1] = 1;
        for (int i = 2; i <= n; i++) {
            f[i] = f[i - 1] + f[i - 2];
            System.out.println("f[" + i + "]" + f[i]);
        }

        System.out.println("f[" + n + "]" + f[n]);
    }
}
