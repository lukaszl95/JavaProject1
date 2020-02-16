package com.kodilla.testing.forum.statistics;

public class StatisticsCalculation {
    private int users;
    private int posts;
    private int comments;
    private double usersPosts;
    private double usersComments;
    private double postsComments;

    public void calculateAdvStatistics(Statistics statistics) {
        users = statistics.usersNames().size();
        posts = statistics.postsCount();
        comments = statistics.commentsCount();
        if (users > 0) {
            usersPosts = (double) posts / users;
            usersComments = (double) comments/users;
        } else {
            usersPosts = 0;
            postsComments = 0;
        }
        if (posts > 0) {
            postsComments = (double) comments / posts;
        } else {
            postsComments = 0;
        }
    }

    public void showStatistics() {
        System.out.println(users);
        System.out.println(posts);
        System.out.println(comments);
        System.out.println(usersPosts);
        System.out.println(usersComments);
        System.out.println(postsComments);
    }

    public double getUsersPosts() {
        return usersPosts;
    }

    public double getUsersComments() {
        return usersComments;
    }

    public double getPostsComments() {
        return postsComments;
    }
}
