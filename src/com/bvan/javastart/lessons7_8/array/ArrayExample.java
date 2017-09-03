package com.bvan.javastart.lessons7_8.array;

import java.util.Arrays;

/**
 * @author bvanchuhov
 */
public class ArrayExample {

    public static void main(String[] args) {
        int[] array = new int[10];

        int filler = 1;
        for (int i = 0; i < array.length; i++) {
            array[i] = filler;
        }
        System.out.println(Arrays.toString(array));

        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        System.out.println("sum = " + sum);

        for (int elem : array) {
            System.out.println(elem);
        }
    }
}
