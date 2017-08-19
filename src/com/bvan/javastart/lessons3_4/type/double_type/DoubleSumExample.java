package com.bvan.javastart.lessons3_4.type.double_type;

/**
 * @author bvanchuhov
 */
public class DoubleSumExample {

    public static void main(String[] args) {
        System.out.println(0.1 + 0.2);
        System.out.println(0.3 - 0.1);

        String s = String.format("%.3f", 0.3 - 0.1);
        System.out.println(s);
    }
}
