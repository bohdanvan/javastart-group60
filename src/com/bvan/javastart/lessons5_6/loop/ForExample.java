package com.bvan.javastart.lessons5_6.loop;

/**
 * @author bvanchuhov
 */
public class ForExample {

    public static void main(String[] args) {
        for (int n = 5; n <= 10; n++) {
            System.out.print(n + " ");
        }
        System.out.println();

        for (int n = 10; n >= 1; n--) {
            System.out.print(n + " ");
        }
        System.out.println();

        for (int n = 2; n <= 100; n += 2) {
            System.out.print(n + " ");
        }
        System.out.println();

        for (int n = 99; n >= 1; n -= 2) {
            System.out.print(n + " ");
        }
        System.out.println();
    }
}
