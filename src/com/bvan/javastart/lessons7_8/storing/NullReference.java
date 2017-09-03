package com.bvan.javastart.lessons7_8.storing;

/**
 * @author bvanchuhov
 */
public class NullReference {

    public static void main(String[] args) {
        String s = null; // Optional
        int length = s.length();
        System.out.println(length);
    }
}
