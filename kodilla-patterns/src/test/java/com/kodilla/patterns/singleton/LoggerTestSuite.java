package com.kodilla.patterns.singleton;

import org.junit.Assert;
import org.junit.Test;

public class LoggerTestSuite {
    @Test
    public void testGetLastLog() {
        Logger.getInstance().log("Log 1");
        Logger.getInstance().log("Log 2");

        String result = Logger.getInstance().getLastLog();

        Assert.assertEquals("Log 2", result);
    }
}