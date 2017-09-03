package com.bvan.javastart.lessons7_8.matrix;

import java.util.Arrays;

/**
 * @author bvanchuhov
 */
public class NamesArray {

    public static void main(String[] args) {
        String[] names = {
                "John",
                "Bob",
                "Phil"
        };
        System.out.println(Arrays.toString(names));

        String name = names[2];
        char c = name.charAt(1);
        System.out.println(c);

        int count = countChars(names, 'b');
        System.out.println(count);
    }

    private static int countChars(String[] names, char ch) {
        int count = 0;
        for (String name : names) {
            count += countChars(name, ch);
        }
        return count;
    }

    private static int countChars(String name, char ch) {
        int count = 0;
        for (int i = 0; i < name.length(); i++) {
            if (name.charAt(i) == ch) {
                count++;
            }
        }
        return count;
    }
}
