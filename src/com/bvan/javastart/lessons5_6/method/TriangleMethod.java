package com.bvan.javastart.lessons5_6.method;

/**
 * @author bvanchuhov
 */
public class TriangleMethod {

    public static void main(String[] args) {
        printTriangle(4);
    }

    public static void printTriangle(int size) {
        checkNotNegative(size, "size");

        for (int lineCount = 1; lineCount <= size; lineCount++) {
            printLine(lineCount);
        }
    }

    public static void printLine(int count) {
        checkNotNegative(count, "count");

        for (int n = 0; n < count; n++) {
            System.out.print("*");
        }
        System.out.println();
    }

    private static void checkNotNegative(int value, String valueName) {
        if (value < 0) {
            throw new IllegalArgumentException("negative " + valueName + ": " + value);
        }
    }
}
