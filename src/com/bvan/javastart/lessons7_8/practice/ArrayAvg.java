package com.bvan.javastart.lessons7_8.practice;

/**
 * @author bvanchuhov
 */
public class ArrayAvg {

    public static void main(String[] args) {
        System.out.println(avg(new int[]{})); // IllegalArgumentException
        System.out.println(avg(new int[]{10, 40, 20, 10}) == 20); // 20
        System.out.println(avg(new int[]{10}) == 10); // 10
    }

    public static int avg(int[] array) {
        if (array.length == 0) {
            throw new IllegalArgumentException("can't find average for empty array");
        }

        int sum = 0;
        for (int elem : array) {
            sum += elem;
        }
        return sum / array.length;
    }
}
