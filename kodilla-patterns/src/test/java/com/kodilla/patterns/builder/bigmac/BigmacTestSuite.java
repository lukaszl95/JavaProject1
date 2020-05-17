package com.kodilla.patterns.builder.bigmac;

import org.junit.Assert;
import org.junit.Test;

public class BigmacTestSuite {
    @Test
    public void testBuildBigmac() {
        Bigmac bigmac = new Bigmac.BigmacBuilder()
                .setBun("sesame roll")
                .setBurgers(2)
                .setIngredients("onions")
                .setIngredients("bacon")
                .setSauces("space")
                .setIngredients("tomato")
                .setSauces("mild")
                .build();

        System.out.println(bigmac);

        int howManyIngredients = bigmac.getIngredients().size();
        Assert.assertEquals(3, howManyIngredients);

        int howManySauces = bigmac.getSauces().size();
        Assert.assertEquals(2, howManySauces);
    }
}