package com.bvan.javastart.lessons5_6.cakes;

import java.util.Scanner;

/**
 * @author bvanchuhov
 */
public class CakesV5 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter number of people: ");
        int people = scanner.nextInt();

        System.out.print("Enter number of cakes: ");
        int cakes = scanner.nextInt();

        // personIndex=1...people
        for (int personIndex = 1; personIndex <= people; personIndex++) {
            System.out.println("I'm " + personIndex + " person");
            System.out.println("I have " + cakes + " cakes");
            for (int cakeIndex = 1; cakeIndex <= cakes; cakeIndex++) {
                System.out.println("I have eaten " + cakeIndex + " cake");
            }
            System.out.println();
        }
    }
}
