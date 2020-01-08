package com.kodilla.testing;

import com.kodilla.testing.calculator.Calculator;

public class TestingMain {
    public static void main(String[] args){
        Calculator calculator = new Calculator(1,2);

        int add = calculator.add();
        if (add == 3){
            System.out.println("Test dodawania OK");
        } else {
            System.out.println("Error!");
        }

        int subtract = calculator.subtract();
        if (subtract == -1){
            System.out.println("Test odejmowania OK");
        } else {
            System.out.println("Error!");
        }
    }
}
