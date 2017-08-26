package com.bvan.javastart.lessons5_6.array;

import java.util.Arrays;

/**
 * @author bvanchuhov
 */
public class ArraySum {

    public static void main(String[] args) {
        int[] array = {10, 30, 20};

//        int sum = 0;
//        for (int i = 0; i < array.length; i++) {
//            int elem = array[i];
//            elem = 1;
//            sum += elem;
//        }

        int sum = 0;
        for (int elem : array) { // for-each, READ-ONLY
            sum += elem;
        }

        System.out.println("sum = " + sum);
    }
}
