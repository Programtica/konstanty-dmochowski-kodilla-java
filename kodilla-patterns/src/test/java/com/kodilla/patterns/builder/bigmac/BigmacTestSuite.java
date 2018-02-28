package com.kodilla.patterns.builder.bigmac;

import org.junit.Assert;
import org.junit.Test;

public class BigmacTestSuite {
    @Test
    public void testBigMacNew() {
        //Given
        Bigmac bigmac = new Bigmac.BigmacBuilder()
                .burgers(3)
                .sauce(Bigmac.SauceEnum.BARBECUE)
                .ingredients(Bigmac.IngredientsEnum.BACON)
                .ingredients(Bigmac.IngredientsEnum.MUSHROOMS)
                .ingredients(Bigmac.IngredientsEnum.PEPPERCHILLI)
                .ingredients(Bigmac.IngredientsEnum.SALAD)
                .roll("without sezam")
                .build();
        System.out.println(bigmac);
        //When
        int howManyIngredients = bigmac.getIngredients().size();
        //Then
        Assert.assertEquals(4, howManyIngredients);
    }
}
