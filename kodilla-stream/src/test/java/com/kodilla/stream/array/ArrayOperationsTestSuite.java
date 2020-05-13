package com.kodilla.stream.array;

import org.junit.Assert;
import org.junit.Test;

public class ArrayOperationsTestSuite {

    @Test
    public void testGetAverage() {
        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8};
        try {
            double result = ArrayOperations.getAverage(numbers);
            Assert.assertEquals(4.5, result, 0);
        } catch (Exception e) {
            System.out.println("Error: " + e);
        }

    }
}