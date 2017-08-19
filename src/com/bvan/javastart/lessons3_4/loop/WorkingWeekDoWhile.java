package com.bvan.javastart.lessons3_4.loop;

/**
 * @author bvanchuhov
 */
public class WorkingWeekDoWhile {

    public static void main(String[] args) {
        int day = 6;

        do {
            System.out.println(day + ". Work");
            day++;
        } while (day <= 5);
        System.out.println("Beeer");
    }
}
