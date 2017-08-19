package com.bvan.javastart.lessons1_2;

/**
 * @author bvanchuhov
 */
public class IncrementExample {

    public static void main(String[] args) {
        int x = 10;

        System.out.println("x = " + ++x);
        System.out.println(x);

        int n = 10;
        n += n++ + ++n;
        System.out.println(n);
    }
}
