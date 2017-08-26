package com.bvan.javastart.lessons5_6.triangle;

/**
 * @author bvanchuhov
 */
public class TrianglePrinter {

    public static void main(String[] args) {
        int size = 5;

        // Triangle printer
        for (int lineCount = 1; lineCount <= size; lineCount++) {
            // Line printer
            for (int n = 1; n <= lineCount; n++) {
                System.out.print("*");
            }
            System.out.println();
        }

    }
}
