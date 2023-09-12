package org.example;

import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Integer total = 0;
        Scanner in = new Scanner(System.in);

        while (true) {
            System.out.println("total is " + total);
            String i = in.next();
            try {
                Integer num = Integer.parseInt(i);
                total += num;
            } catch (NumberFormatException e) {
                System.out.println("input is not valid");

                e.printStackTrace();
                return;

                //throw e;
            }
        }

    }
}