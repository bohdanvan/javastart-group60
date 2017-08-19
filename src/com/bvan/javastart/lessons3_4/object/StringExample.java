package com.bvan.javastart.lessons3_4.object;

/**
 * @author bvanchuhov
 */
public class StringExample {

    public static void main(String[] args) {
        String s = "Java";
        int length = s.length();
        System.out.println("length = " + length); // 4

        char c = s.charAt(2);
        System.out.println("c = " + c); // v

        String upperCase = s.toUpperCase();
        System.out.println("upperCase = " + upperCase);

        boolean startsWithJ = s.startsWith("J");
        System.out.println("startsWithJ = " + startsWithJ);

        String substring = s.substring(1, 4);
        System.out.println("substring = " + substring);

        String reversedString = new StringBuilder(s).reverse().toString();
        System.out.println("reversedString = " + reversedString);
    }
}
