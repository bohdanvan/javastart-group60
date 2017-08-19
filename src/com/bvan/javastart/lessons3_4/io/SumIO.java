package com.bvan.javastart.lessons3_4.io;

import java.util.Scanner;

/**
 * @author bvanchuhov
 */
public class SumIO {

    public static void main(String[] args) {
        // Input
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a: ");
        int a = scanner.nextInt();

        System.out.print("Enter b: ");
        int b = scanner.nextInt();

        // BL
        int sum = a + b;

        // Output
        System.out.println("sum = " + sum);
    }
}
