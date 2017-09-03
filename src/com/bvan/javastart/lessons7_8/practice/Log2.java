package com.bvan.javastart.lessons7_8.practice;

/**
 * @author bvanchuhov
 */
public class Log2 {

    public static void main(String[] args) {
        System.out.println(log2(1)); // 0
        System.out.println(log2(8)); // 3
        System.out.println(log2(10)); // 3
        System.out.println(log2(16)); // 4
        System.out.println(log2(1_000)); // 9
        System.out.println(log2(10_000)); // 13
    }

    // Creator
    public static int log2(int n) {
        if (n <= 0) {
            throw new IllegalArgumentException("not positive arg: " + n);
        }

        int res = 0;
        while (n > 1) {
            n = n / 2;
            res++;
        }
        return res;
    }

    public static int[] createLog2Array(int size) {
        if (size < 0) {
            throw new IllegalArgumentException("negative size: " + size);
        }

        int[] array = new int[size];
        for (int i = 0; i < array.length; i++) {
            array[i] = log2(i + 1);
        }
        return array;
    }


}
