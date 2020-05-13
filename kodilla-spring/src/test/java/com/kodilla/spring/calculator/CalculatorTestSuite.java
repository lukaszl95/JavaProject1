package com.kodilla.spring.calculator;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class CalculatorTestSuite {

    @Test
    public void testAdd() {

        ApplicationContext context =
                new AnnotationConfigApplicationContext("com.kodilla.spring");
        Calculator calculator = context.getBean(Calculator.class);

        double result = calculator.add(1, 1);

        Assert.assertEquals(2, result, 0);

    }

    @Test
    public void testSub() {

        ApplicationContext context =
                new AnnotationConfigApplicationContext("com.kodilla.spring");
        Calculator calculator = context.getBean(Calculator.class);

        double result = calculator.sub(1, 1);

        Assert.assertEquals(0, result, 0);

    }

    @Test
    public void testMul() {

        ApplicationContext context =
                new AnnotationConfigApplicationContext("com.kodilla.spring");
        Calculator calculator = context.getBean(Calculator.class);

        double result = calculator.mul(1, 10);

        Assert.assertEquals(10, result, 0);

    }

    @Test
    public void testDiv() {

        ApplicationContext context =
                new AnnotationConfigApplicationContext("com.kodilla.spring");
        Calculator calculator = context.getBean(Calculator.class);

        double result = calculator.div(10, 10);

        Assert.assertEquals(1, result, 0);
    }

}