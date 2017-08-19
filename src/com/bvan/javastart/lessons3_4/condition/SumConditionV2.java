package com.bvan.javastart.lessons3_4.condition;

import java.util.Scanner;

/**
 * @author bvanchuhov
 */
public class SumConditionV2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a: ");
        int a = scanner.nextInt();

        System.out.print("Enter b: ");
        int b = scanner.nextInt();

        int sum = a + b;

        // sum = [100...200] -> 1
        // sum < 100 -> 2
        // sum > 200 -> 3

        if (sum >= 100 && sum <= 200) {
            System.out.println(1);
        }
        if (sum < 100) {
            System.out.println(2);
        }
        if (sum > 200) {
            System.out.println(3);
        }

//        if (sum < 100) {
//            System.out.println(2);
//        } else {
//            if (sum <= 200) {
//                System.out.println(1);
//            } else {
//                System.out.println(3);
//            }
//        }
    }
}
