package com.bvan.javastart.lessons5_6.triangle;

/**
 * @author bvanchuhov
 */
public class SpecialTriangle {

    public static void main(String[] args) {
        int size = 4;

        // Triangle Printer
        for (int lineCount = size; lineCount >= 1; lineCount--) {
            // Line Printer
            for (int n = lineCount; n >= 1; n--) {
                System.out.print(n + " ");
            }
            System.out.println();
        }
    }
}
