package com.kodilla.testing.forum.statistics;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class StatisticsCalculationTestSuite {
    @Test
    public void testZeroPosts() {
        Statistics statisticsMock = mock(Statistics.class);
        List<String> usersList = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            usersList.add("User" + i);
        }

        when(statisticsMock.usersNames()).thenReturn(usersList);
        when(statisticsMock.postsCount()).thenReturn(0);
        when(statisticsMock.commentsCount()).thenReturn(10);

        StatisticsCalculation statistics = new StatisticsCalculation();
        statistics.calculateAdvStatistics(statisticsMock);

        Assert.assertEquals(0, statistics.getUsersPosts(), 0.01);
        Assert.assertEquals(1, statistics.getUsersComments(), 0.01);
        Assert.assertEquals(0, statistics.getPostsComments(), 0.01);
    }

    @Test
    public void testThousandPosts() {
        Statistics statisticsMock = mock(Statistics.class);
        List<String> usersList = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            usersList.add("user" + i);
        }

        when(statisticsMock.usersNames()).thenReturn(usersList);
        when(statisticsMock.postsCount()).thenReturn(1000);
        when(statisticsMock.commentsCount()).thenReturn(10);

        StatisticsCalculation statistics = new StatisticsCalculation();
        statistics.calculateAdvStatistics(statisticsMock);

        Assert.assertEquals(100, statistics.getUsersPosts(), 0.01);
        Assert.assertEquals(1, statistics.getUsersComments(), 0.01);
        Assert.assertEquals(0.01, statistics.getPostsComments(), 0.01);
    }

    @Test
    public void testZeroComments() {
        Statistics statisticsMock = mock(Statistics.class);
        List<String> usersList = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            usersList.add("user" + i);
        }

        when(statisticsMock.usersNames()).thenReturn(usersList);
        when(statisticsMock.postsCount()).thenReturn(10);
        when(statisticsMock.commentsCount()).thenReturn(0);

        StatisticsCalculation statistics = new StatisticsCalculation();
        statistics.calculateAdvStatistics(statisticsMock);

        Assert.assertEquals(1, statistics.getUsersPosts(), 0.01);
        Assert.assertEquals(0, statistics.getUsersComments(), 0.01);
        Assert.assertEquals(0, statistics.getPostsComments(), 0.01);
    }

    @Test
    public void testMorePostsThanComments() {
        Statistics statisticsMock = mock(Statistics.class);
        List<String> usersList = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            usersList.add("user" + i);
        }

        when(statisticsMock.usersNames()).thenReturn(usersList);
        when(statisticsMock.postsCount()).thenReturn(1000);
        when(statisticsMock.commentsCount()).thenReturn(10);

        StatisticsCalculation statistics = new StatisticsCalculation();
        statistics.calculateAdvStatistics(statisticsMock);

        Assert.assertEquals(100, statistics.getUsersPosts(), 0.01);
        Assert.assertEquals(1, statistics.getUsersComments(), 0.01);
        Assert.assertEquals(0.01, statistics.getPostsComments(), 0.01);
    }

    @Test
    public void testMoreCommentsThanPosts() {
        Statistics statisticsMock = mock(Statistics.class);
        List<String> usersList = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            usersList.add("user" + i);
        }

        when(statisticsMock.usersNames()).thenReturn(usersList);
        when(statisticsMock.postsCount()).thenReturn(10);
        when(statisticsMock.commentsCount()).thenReturn(1000);

        StatisticsCalculation statistics = new StatisticsCalculation();
        statistics.calculateAdvStatistics(statisticsMock);

        Assert.assertEquals(1, statistics.getUsersPosts(), 0.01);
        Assert.assertEquals(100, statistics.getUsersComments(), 0.01);
        Assert.assertEquals(100, statistics.getPostsComments(), 0.01);
    }

    @Test
    public void testZeroUsers() {
        Statistics statisticsMock = mock(Statistics.class);
        List<String> usersList = new ArrayList<>();

        when(statisticsMock.usersNames()).thenReturn(usersList);
        when(statisticsMock.postsCount()).thenReturn(1000);
        when(statisticsMock.commentsCount()).thenReturn(10);

        StatisticsCalculation statistics = new StatisticsCalculation();
        statistics.calculateAdvStatistics(statisticsMock);

        Assert.assertEquals(0, statistics.getUsersPosts(), 0.01);
        Assert.assertEquals(0, statistics.getUsersComments(), 0.01);
        Assert.assertEquals(0.01, statistics.getPostsComments(), 0.01);
    }

    @Test
    public void testHundredUsers() {
        Statistics statisticsMock = mock(Statistics.class);
        List<String> usersList = new ArrayList<>();
        for (int i = 0; i < 100; i++) {
            usersList.add("user" + i);
        }
        when(statisticsMock.usersNames()).thenReturn(usersList);
        when(statisticsMock.postsCount()).thenReturn(1000);
        when(statisticsMock.commentsCount()).thenReturn(10);

        StatisticsCalculation statistics = new StatisticsCalculation();
        statistics.calculateAdvStatistics(statisticsMock);

        Assert.assertEquals(10, statistics.getUsersPosts(), 0.01);
        Assert.assertEquals(0.1, statistics.getUsersComments(), 0.01);
        Assert.assertEquals(0.01, statistics.getPostsComments(), 0.01);
    }
}
