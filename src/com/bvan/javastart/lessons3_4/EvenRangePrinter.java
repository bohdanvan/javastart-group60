package com.bvan.javastart.lessons3_4;

import java.util.Scanner;

/**
 * @author bvanchuhov
 */
public class EvenRangePrinter {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter from: ");
        int from = scanner.nextInt();

        System.out.print("Enter to: ");
        int to = scanner.nextInt();

//        for (int n = from; n <= to; n++) {
//            if (n % 2 == 0) {
//                System.out.print(n + " ");
//            }
//        }
//        System.out.println();

        if (from % 2 != 0) {
            from++;
        }
        for (int n = from; n <= to; n += 2) {
            System.out.print(n + " ");
        }
        System.out.println();
    }
}
