package com.bvan.javastart.lessons5_6.array;

/**
 * @author bvanchuhov
 */
public class PositiveElemsPrinter {

    public static void main(String[] args) {
        int[] array = {-10, 0, 30, 2};

        for (int elem : array) {
            if (elem > 0) {
                System.out.println(elem);
            }
        }
    }
}
