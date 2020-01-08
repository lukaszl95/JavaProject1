package com.kodilla.testing.collection;
import com.kodilla.testing.collection.OddNumbersExterminator;
import org.junit.*;
import java.util.ArrayList;

public class CollectionTestSuite {
    @Before
    public void before(){
        System.out.println("Test Case: begin");
    }
    @After
    public void after(){
        System.out.println("Test Case: end");
    }
    @Test
    public void testOddNumbersExterminatorNormalList (){
        OddNumbersExterminator simpleUser = new OddNumbersExterminator();
        ArrayList<Integer> numbers = new ArrayList<Integer>();

        for(int n=0; n < 10; n++){
            int random = (int)(Math.random() * 6 + 1);
            numbers.add(random);
        };

        System.out.println("Odd " + numbers);
        ArrayList<Integer> result = simpleUser.exterminate(numbers);
        System.out.println("Odd " + result);
    }
    @Test
    public void testOddNumbersExterminatorEmptyList (){
        OddNumbersExterminator simpleUser = new OddNumbersExterminator();
        ArrayList<Integer> numbers2 = new ArrayList<Integer>();

        System.out.println("Empty " + numbers2);
        ArrayList<Integer> result2 = simpleUser.exterminate(numbers2);
        System.out.println("Empty " + result2);
    }
}
