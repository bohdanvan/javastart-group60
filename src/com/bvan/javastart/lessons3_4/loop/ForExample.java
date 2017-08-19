package com.bvan.javastart.lessons3_4.loop;

/**
 * @author bvanchuhov
 */
public class ForExample {

    public static void main(String[] args) {
        for (int n = 5; n <= 10; n++) {
            System.out.print(n + " ");
        }
        System.out.println();

        for (int n = 10; n >= 5; n--) {
            System.out.print(n + " ");
        }
        System.out.println();

        for (int n = 1; n <= 30; n += 3) {
            System.out.print(n + " ");
        }
        System.out.println();
    }
}
