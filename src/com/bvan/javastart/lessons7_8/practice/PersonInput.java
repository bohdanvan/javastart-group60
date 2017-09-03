package com.bvan.javastart.lessons7_8.practice;

import java.util.Scanner;

/**
 * @author bvanchuhov
 */
public class PersonInput {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String name = readName(scanner);
        int age = readAge(scanner);

        String message = personInfo(name, age);

        System.out.println(message);
    }

    public static String personInfo(String name, int age) {
        return "Hello, I'm " + name + ", " + age + " years old";
    }

    public static String readName(Scanner scanner) {
        System.out.print("Enter name: ");
        return scanner.next();
    }

    public static int readAge(Scanner scanner) {
        int age = repeatableReadInt(scanner, "Enter age: ");
        while (!isAge(age)) {
            System.out.println("Illegal age");
            age = repeatableReadInt(scanner, "Enter age: ");
        }
        return age;
    }

    public static boolean isAge(int n) {
        return n >= 1 && n <= 120;
    }

    public static int repeatableReadInt(Scanner scanner, String inputMessage) {
        System.out.print(inputMessage);
        while (!scanner.hasNextInt()) {
            scanner.next(); // skip
            System.out.println("Illegal number");
            System.out.print(inputMessage);
        }
        return scanner.nextInt();
    }
}
