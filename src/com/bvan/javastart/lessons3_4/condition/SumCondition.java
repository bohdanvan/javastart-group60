package com.bvan.javastart.lessons3_4.condition;

import java.util.Scanner;

/**
 * @author bvanchuhov
 */
public class SumCondition {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a: ");
        int a = scanner.nextInt();

        System.out.print("Enter b: ");
        int b = scanner.nextInt();

        int sum = a + b;
        if (sum > 100) {
            System.out.println("OK");
        } else {
            System.out.println("Cancel");
        }
    }
}
