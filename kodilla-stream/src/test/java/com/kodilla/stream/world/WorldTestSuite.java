package com.kodilla.stream.world;

import org.junit.Assert;
import org.junit.Test;

import java.math.BigDecimal;

public class WorldTestSuite {
    @Test
    public void testGetPeopleQuantity() {
        Continent europe = new Continent("Europe");
        Continent africa = new Continent("Africa");
        Continent asia = new Continent("Asia");

        Country polska = new Country("Polska", BigDecimal.valueOf(1111111));
        Country andora = new Country("Andora", BigDecimal.valueOf(1111111));
        Country austria = new Country("Austria", BigDecimal.valueOf(1111111));

        Country algieria = new Country("Algieria", BigDecimal.valueOf(1111111));
        Country angola = new Country("Angola", BigDecimal.valueOf(1111111));
        Country benin = new Country("Benin", BigDecimal.valueOf(1111111));

        Country afganistan = new Country("Afganistan", BigDecimal.valueOf(1111111));
        Country armenia = new Country("Armenia", BigDecimal.valueOf(1111111));
        Country chiny = new Country("Chiny", BigDecimal.valueOf(1111111));

        europe.addCountry(polska);
        europe.addCountry(andora);
        europe.addCountry(austria);

        africa.addCountry(algieria);
        africa.addCountry(angola);
        africa.addCountry(benin);

        asia.addCountry(afganistan);
        asia.addCountry(armenia);
        asia.addCountry(chiny);

        World world = new World();

        world.addContinent(europe);
        world.addContinent(asia);
        world.addContinent(africa);

        BigDecimal result = world.getPeopleQuantity();

        Assert.assertEquals(BigDecimal.valueOf(9999999), result);
    }
}