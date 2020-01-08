package com.kodilla.testing;

import com.kodilla.testing.calculator.Calculator;
import com.kodilla.testing.user.SimpleUser;

public class TestingMain {
    public static void main(String[] args){
        SimpleUser simpleUser = new SimpleUser("theForumUser");

        String result = simpleUser.getUsername();
        if (result.equals("theForumUser")){
            System.out.println("test OK");
        } else {
            System.out.println("Error!");
        }

        // Testing Calculator class
        Calculator calculator = new Calculator();
        int addResult = calculator.add(1, 2);
        int subResult = calculator.subtract(3, 1);
        if (addResult == 3) {
            System.out.println("Test dodawania OK");
        } else {
            System.out.println("Błąd!");
        }

        if (subResult == 2) {
            System.out.println("Test odejmowania OK");
        } else {
            System.out.println("Błąd!");
        }
    }
}
