package com.epam.tatiana_sivaeva.java.lesson3;

//  I m p l e m e n t  m e n u   w i t h 3   o p t i o n s   t o   w o r k   w i t h   y o u r  p r o g r a m :
//        O p t i o n
//        1  –S a v e  a   n e w  o b j e c t   t o   a   f i l e  ( a p p e n d )O p t i o n
//        2  –R e a d  a l l   t h e   o b j e c t s   f r o m   f i l e  a n d   s h o w  t h e m
//        i n   c o n s o l eO p t i o n
//        3  –Q u i t2 .
//        C r e a t e  y o u r   o w n   e x c e p t i o n  a n d   u s e   i t   i n   c a s e
//        u s e rt r i e s   t o   u s e   n o t   s u p p o r t e d   o p t i o n   ( n o t   1 ,   2 ,   3 )


import com.epam.tatiana_sivaeva.java.lesson3.exception.InvalidAException;

import java.io.*;

public class Menu {

    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        VehiclePark vehiclePark = new VehiclePark();

        try {
            int a;
            String vehicleParkToString = vehiclePark.getvehiclesPark().toString();
            System.out.print("Menu has 3 options '\n'"
                    + "Enter the number for one of them: '\n'"
                    + "1 is Save a new object to a file '\n'"
                    + "2 is Read all the objects from file and show them in console '\n'"
                    + "3 is Quit" + "\n");

            a = Integer.parseInt(br.readLine());

            if (a == 1) {
                try (FileWriter to = new FileWriter(".\\resources\\io.txt")) {
                    to.write(vehicleParkToString);
                }

                System.out.println("The object is saved to a file");
            } else if (a == 2) {
                try (BufferedReader from = new BufferedReader(new FileReader(".\\resources\\io.txt"))) {
                    String textLine = from.readLine();
                    while (textLine != null) {
                        System.out.println(textLine);
                        textLine = from.readLine();
                    }
                }

            } else if (a == 3) {
                System.exit(0);
            } else {
                throw new InvalidAException("Incorrect value ");

            }

        } catch (IOException e) {
            e.printStackTrace();
        } catch (InvalidAException invalidAException) {
            System.err.println("invalidAException:  " + invalidAException.getMessage());
        }
    }
}

