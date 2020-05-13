package com.kodilla.stream;

//import com.kodilla.stream.immutable.ForumUser;
//import com.kodilla.stream.iterate.NumbersGenerator;
//import com.kodilla.stream.person.People;
//import com.kodilla.stream.book.Book;
//import com.kodilla.stream.book.BookDirectory;

import com.kodilla.stream.forumuser.Forum;
import com.kodilla.stream.forumuser.ForumUser;

import java.time.LocalDate;
import java.time.Period;
import java.util.Map;
import java.util.stream.Collectors;


public class StreamMain {
    public static void main(String[] args) {
        //Zadanie 7.3
        Forum forum = new Forum();

        Map<Integer, ForumUser> par = forum.getUserList().stream()
                .filter(forumUser -> forumUser.getSex() == 'M')
                .filter(forumUser -> Period.between(forumUser.getBirthDay(), LocalDate.now()).getYears() >= 20)
                .filter(forumUser -> forumUser.getPosts() >= 1)
                .collect(Collectors.toMap(ForumUser::getID, forumUser -> forumUser));

        par.entrySet().stream()
                .map(entry -> entry.getKey() + ":" + entry.getValue())
                .forEach(System.out::println);


        //Zadanie 7.2
        //System.out.println("Using Stream to generate even numbers from 1 to 20");
        //NumbersGenerator.generateEven(20);
        /*ForumUser forumUser = new ForumUser("Adam123", "Adam");
        System.out.println("User name: " + forumUser.getUsername());
        System.out.println("Real name: " + forumUser.getRealName());*/

        //Zadanie 7.1
        /*PoemBeautifier poemBeautifier = new PoemBeautifier();

        System.out.println(poemBeautifier.beautify("słowo", (word) -> word.toUpperCase()));
        System.out.println(poemBeautifier.beautify("słowo", (word) -> "*" + word + "*"));
        System.out.println(poemBeautifier.beautify("słowo", (word) -> word + " <-> " + word));*/
    }
}