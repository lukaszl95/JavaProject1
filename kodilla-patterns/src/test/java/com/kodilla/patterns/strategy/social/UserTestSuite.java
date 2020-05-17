package com.kodilla.patterns.strategy.social;

import org.junit.Assert;
import org.junit.Test;

public class UserTestSuite {
    @Test
    public void testDefaultSharingStrategies() {
        User user1 = new Millenials("User1");
        User user2 = new YGeneration("User2");
        User user3 = new ZGeneration("User3");

        String user1Post = user1.sharePost();
        String user2Post = user2.sharePost();
        String user3Post = user3.sharePost();

        System.out.println(user1.getUserName() + ", " + user1Post);
        System.out.println(user2.getUserName() + ", " + user2Post);
        System.out.println(user3.getUserName() + ", " + user3Post);

        Assert.assertEquals("Facebook", user1Post);
        Assert.assertEquals("Twitter", user2Post);
        Assert.assertEquals("Snapchat", user3Post);
    }

    @Test
    public void testIndividualSharingStrategy() {
        User user1 = new Millenials("User1");

        String user1Post = user1.sharePost();
        System.out.println("Old: " + user1Post);

        user1.setSocialPublisher(new TwitterPublisher());
        String user1NewPublisher = user1.sharePost();
        System.out.println("New: " + user1NewPublisher);

        Assert.assertEquals("Twitter", user1NewPublisher);
    }
}