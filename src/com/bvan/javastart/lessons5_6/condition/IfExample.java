package com.bvan.javastart.lessons5_6.condition;

/**
 * @author bvanchuhov
 */
public class IfExample {

    public static void main(String[] args) {
        int a = 30;
        int b = 30;

        // a < b: -1
        // a == b: 0
        // a > b: 1

        int cmp = (a < b) ? -1 : ((a == b) ? 0 : 1);
        System.out.println(cmp);
    }
}
