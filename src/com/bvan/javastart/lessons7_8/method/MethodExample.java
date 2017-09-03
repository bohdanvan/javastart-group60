package com.bvan.javastart.lessons7_8.method;

/**
 * @author bvanchuhov
 */
public class MethodExample {

    public static void main(String[] args) {
        int x = sum(100, 200);
        System.out.println(x);
    }

    public static int sum(int a, int b) {
        return a + b;
    }
}
