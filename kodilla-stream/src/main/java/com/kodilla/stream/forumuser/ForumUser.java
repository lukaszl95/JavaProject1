package com.kodilla.stream.forumuser;

import java.time.LocalDate;

public class ForumUser {
    private int id;
    private String name;
    private char sex;
    private LocalDate birthDay;
    private int posts;

    public ForumUser(int id, String name, char sex, LocalDate birthDay, int posts) {
        this.id = id;
        this.name = name;
        this.sex = sex;
        this.birthDay = birthDay;
        this.posts = posts;
    }

    public int getID() {
        return id;
    }

    public String getName() {
        return name;
    }

    public char getSex() {
        return sex;
    }

    public LocalDate getBirthDay() {
        return birthDay;
    }

    public int getPosts() {
        return posts;
    }

    @Override
    public String toString() {
        return "ForumUser{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", sex=" + sex +
                ", birthDay=" + birthDay +
                ", posts=" + posts +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ForumUser forumUser = (ForumUser) o;

        return id == forumUser.id;
    }

    @Override
    public int hashCode() {
        return id;
    }
}
