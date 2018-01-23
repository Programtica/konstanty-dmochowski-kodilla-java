package com.kodilla.stream.world;

import org.junit.Assert;
import org.junit.Test;

import java.math.BigDecimal;

public class WorldTestSuite
{
    @Test
    public void testGetPeopleQuantity()
    {
        //Given

        //Europe
        Country poland = new Country("POLSKA", new BigDecimal("38422346"));
        Country germany = new Country("NIEMCY", new BigDecimal("82349400"));
        Country spain = new Country("HISZPANIA", new BigDecimal("48563476"));

        Continent europe = new Continent("EUROPA");

        //North America
        Country usa = new Country("STANY ZJEDNOCZONE", new BigDecimal("326079000"));
        Country canada = new Country("KANADA", new BigDecimal("36708083"));
        Country mexico = new Country("MEKSYK", new BigDecimal("124574795"));

        Continent northAmerica = new Continent("AMERYKA PÓŁNOCNA");

        //Asia
        Country russia = new Country("ROSJA", new BigDecimal("144463451"));
        Country china = new Country("CHINY", new BigDecimal("1379302771"));
        Country india = new Country("INDIE", new BigDecimal("1281935"));

        Continent asia = new Continent("ASIA");

        //World
        World world = new World();

        //When

        //Adding countries to continents
        europe.addCountry(poland);
        europe.addCountry(germany);
        europe.addCountry(spain);

        northAmerica.addCountry(usa);
        northAmerica.addCountry(canada);
        northAmerica.addCountry(mexico);

        asia.addCountry(russia);
        asia.addCountry(china);
        asia.addCountry(india);

        //Adding continents to the world
        world.addContinent(europe);
        world.addContinent(northAmerica);
        world.addContinent(asia);

        //Then
        BigDecimal totalQuantityOfPeople = new BigDecimal("2181745257");
        Assert.assertEquals(totalQuantityOfPeople, world.getPeopleQuantity());
    }
}
