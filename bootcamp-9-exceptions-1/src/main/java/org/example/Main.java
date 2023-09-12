package org.example;

import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) throws SaraException {

        Scanner in = new Scanner(System.in);
        System.out.println("enter number");

        String str = in.next();
        try {
            Integer inputNumber = Integer.parseInt(str);
        } catch (NumberFormatException ex) {
            // help by log
            // System.out.println(ex + " - NumberFormatException");
            // help by translate
            throw new SaraException("input is not valid");
        }

    }
}