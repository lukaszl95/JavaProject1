package com.kodilla.stream.forumuser;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public final class Forum {
    private final List<ForumUser> userList = new ArrayList<>();

    public Forum() {
        userList.add(new ForumUser(1, "Michal Kowalski", 'M', LocalDate.of(2010, 1, 1), 4));
        userList.add(new ForumUser(2, "Anna Kowalska", 'F', LocalDate.of(1990, 1, 1), 4));
        userList.add(new ForumUser(3, "Piotr Kowalsky", 'M', LocalDate.of(1985, 1, 1), 0));
        userList.add(new ForumUser(4, "Ola Kowalska", 'F', LocalDate.of(1980, 1, 1), 4));
        userList.add(new ForumUser(5, "Oskar Kowalsky", 'M', LocalDate.of(1970, 1, 1), 4));
    }

    public List<ForumUser> getUserList() {
        return new ArrayList<>(userList);
    }
}
