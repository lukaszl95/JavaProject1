package com.kodilla.stream;


import com.kodilla.stream.immutable.ForumUser;
import com.kodilla.stream.iterate.NumbersGenerator;

public class StreamMain {
    public static void main(String[] args) {
        //Zadanie 7.1
        /*PoemBeautifier poemBeautifier = new PoemBeautifier();

        System.out.println(poemBeautifier.beautify("słowo", (word) -> word.toUpperCase()));
        System.out.println(poemBeautifier.beautify("słowo", (word) -> "*" + word + "*"));
        System.out.println(poemBeautifier.beautify("słowo", (word) -> word + " <-> " + word));*/
        //Zadanie 7.2
        //System.out.println("Using Stream to generate even numbers from 1 to 20");
       //NumbersGenerator.generateEven(20);
        ForumUser forumUser = new ForumUser("Adam123", "Adam");
        System.out.println("User name: " + forumUser.getUsername());
        System.out.println("Real name: " + forumUser.getRealName());
    }
}