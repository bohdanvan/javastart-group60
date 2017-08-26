package com.bvan.javastart.lessons5_6.method;

/**
 * @author bvanchuhov
 */
public class MethodExample {

    // Client
    public static void main(String[] args) {
        int x = min(10, 20); // method call
        System.out.println(x);

        int sum = rangeSum(1, 1000);
        System.out.println("sum = " + sum);

        int a = min(rangeSum(200, 300), rangeSum(300, 350));
        System.out.println(a);
    }

    // Creator
    public static int rangeSum(int from, int to) {
        int sum = 0;
        for (int i = from; i <= to; i++) {
            sum += i;
        }
        return sum;
    }

    // Creator
    public static int min(int a, int b) {
        int min;
        if (a < b) {
            min = a;
        } else {
            min = b;
        }
        return min;
    }
}
