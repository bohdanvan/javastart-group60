package com.bvan.javastart.lessons7_8.storing;

import java.util.Arrays;

/**
 * @author bvanchuhov
 */
public class ArrayMethod {

    public static void main(String[] args) {
        int[] array = new int[10];
        fill(array, 3);
        System.out.println(Arrays.toString(array));
    }

    public static void fill(int[] a, int filler) {
        for (int i = 0; i < a.length; i++) {
            a[i] = filler;
        }
    }
}
