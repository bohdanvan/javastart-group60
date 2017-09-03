package com.bvan.javastart.lessons7_8.storing;

/**
 * @author bvanchuhov
 */
public class IntMethod {

    public static void main(String[] args) {
        int x = 10;
        x = inc(x);
        System.out.println(x);
    }

    public static int inc(int a) {
        return a + 1;
    }
}
