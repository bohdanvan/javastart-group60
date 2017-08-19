package com.bvan.javastart.lessons3_4.condition;

/**
 * @author bvanchuhov
 */
public class BooleanTraining {
    public static void main(String[] args) {
        int x = 10;
        int y = 15;
        int z = 30;

        boolean b1 = (x < y) && (z == x) || (z <= y);
        System.out.println("1. " + b1); // F

        boolean b2 = false || true && false || !true;
        System.out.println("2. " + b2); // F

        boolean b3 = !(false || true) && !true && !false;
        System.out.println("3. " + b3); // F
    }
}
