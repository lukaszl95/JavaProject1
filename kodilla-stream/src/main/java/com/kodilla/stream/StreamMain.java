package com.kodilla.stream;


import com.kodilla.stream.beautifier.PoemBeautifier;

public class StreamMain {
    public static void main(String[] args) {
        PoemBeautifier poemBeautifier = new PoemBeautifier();

        System.out.println(poemBeautifier.beautify("słowo", (word) -> word.toUpperCase()));
        System.out.println(poemBeautifier.beautify("słowo", (word) -> "*" + word + "*"));
        System.out.println(poemBeautifier.beautify("słowo", (word) -> word + " <-> " + word));
    }
}