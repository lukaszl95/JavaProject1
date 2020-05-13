package com.kodilla.exception.test;

import com.kodilla.exception.test.SecondChallenge;

public class ExceptionHandling {
    public static void main(String[] args) {

        SecondChallenge secondChallenge = new SecondChallenge();

        try {
            String result = secondChallenge.probablyIWillThrowException(1.5, 2.5);
            System.out.println(result);
        } catch (Exception e) {
            System.out.println("Error! Try with another numbers.");
        } finally {
            System.out.println("Program has finished.");
        }
    }
}
