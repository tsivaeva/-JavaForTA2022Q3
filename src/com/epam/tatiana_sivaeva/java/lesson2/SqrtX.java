package com.epam.tatiana_sivaeva.java.lesson2;

import java.math.BigDecimal;
import java.math.MathContext;
import java.math.RoundingMode;
import java.util.Scanner;

public class SqrtX {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();

        double sqrtX;
        double y = x / 2;

        do {
            sqrtX = y;
            y = (sqrtX + (x / sqrtX)) / 2;

        } while ((sqrtX - y) != 0);

        MathContext context = new MathContext(1, RoundingMode.DOWN);
        BigDecimal sqrtY = new BigDecimal(sqrtX, context);

        System.out.println(sqrtY);
    }

}
