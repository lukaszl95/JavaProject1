package com.kodilla.testing.collection;

import java.util.ArrayList;

public class OddNumbersExterminator {
    private ArrayList<Integer> numbers;

    public ArrayList<Integer> exterminate(ArrayList<Integer> numbers) {
        for (int n=0; n < numbers.size(); n++){
            if(numbers.get(n) % 2 > 0){
                numbers.remove(n);
                n--;
            }
        }
        return numbers;
    }
}
