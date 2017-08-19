package com.bvan.javastart.lessons3_4.condition;

/**
 * @author bvanchuhov
 */
public class QuestionOperator {
    public static void main(String[] args) {
        int x = 100;

        // (условие) ? (значение-да) : (значение-нет)
        String message = (x < 100) ? "Yes" : "No";
        System.out.println(message);

        //--------------------------------------------------

//        String message;
//        if (x < 100) {
//            message = "Yes";
//        } else {
//            message = "No";
//        }
//        System.out.println(message);
    }
}
