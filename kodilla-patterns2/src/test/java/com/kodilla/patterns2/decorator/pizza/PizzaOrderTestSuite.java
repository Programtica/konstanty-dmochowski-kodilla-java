package com.kodilla.patterns2.decorator.pizza;
import com.kodilla.patterns2.decorator.taxiportal.SmallPizzaDecorator;
import org.junit.Test;
import java.math.BigDecimal;

import static org.junit.Assert.assertEquals;

public class PizzaOrderTestSuite {
    @Test
    public void testBasicPizzaOrderGetCost() {
        //Given
        PizzaOrder pizzaOrder = new BasicPizzaOrder();
        //When
        BigDecimal calculatedCost = pizzaOrder.getCost();
        //Then
        assertEquals(new BigDecimal(15), calculatedCost);
    }
    @Test
    public void testBasicTaxiOrderGetDescription() {
        //Given
        PizzaOrder pizzaOrder = new BasicPizzaOrder();
        //When
        String description = pizzaOrder.getDescription();
        //Then
        assertEquals("Your pizza is made with: \ncheese + tomato sauce", description);
    }

    @Test
    public void testSmallPizzaOrderGetCost() {
        //Given
        PizzaOrder pizzaOrder = new BasicPizzaOrder();
        pizzaOrder = new SmallPizzaDecorator(pizzaOrder);
        //When
        BigDecimal calculatedCost = pizzaOrder.getCost();
        //Then
        assertEquals(new BigDecimal(19.00), calculatedCost);
    }
    @Test
    public void testSmallPizzaOrderGetDescription() {
        //Given
        PizzaOrder pizzaOrder = new BasicPizzaOrder();
        pizzaOrder = new SmallPizzaDecorator(pizzaOrder);
        //When
        String description = pizzaOrder.getDescription();
        //Then
        assertEquals("Your pizza is made with: \ncheese + tomato sauce + onion + ham", description);
    }

    @Test
    public void testMediumPizzaOrderGetCost() {
        //Given
        PizzaOrder pizzaOrder = new BasicPizzaOrder();
        pizzaOrder = new SmallPizzaDecorator(pizzaOrder);
        pizzaOrder = new MediumPizzaDecorator(pizzaOrder);
        //When
        BigDecimal calculatedCost = pizzaOrder.getCost();
        //Then
        assertEquals(new BigDecimal(24.00), calculatedCost);
    }

    @Test
    public void testMediumPizzaOrderGetDescription() {
        //Given
        PizzaOrder pizzaOrder = new BasicPizzaOrder();
        pizzaOrder = new SmallPizzaDecorator(pizzaOrder);
        pizzaOrder = new MediumPizzaDecorator(pizzaOrder);
        //When
        String description = pizzaOrder.getDescription();
        //Then
        assertEquals("Your pizza is made with: \ncheese + tomato sauce + onion + ham + pineapple + another cheese", description);
    }

    @Test
    public void testPizzaGetFinalCost() {
        //Given
        PizzaOrder theOrder = new BasicPizzaOrder();
        theOrder = new SmallPizzaDecorator(theOrder);
        theOrder = new MediumPizzaDecorator(theOrder);
        System.out.println(theOrder.getCost());
        //When
        BigDecimal theCost = theOrder.getCost();
        //Then
        assertEquals(new BigDecimal(24.00), theCost);
    }

    @Test
    public void testPizzaGetFinalDescription() {
        //Given
        PizzaOrder theOrder = new BasicPizzaOrder();
        theOrder = new SmallPizzaDecorator(theOrder);
        theOrder = new MediumPizzaDecorator(theOrder);
        System.out.println(theOrder.getDescription());
        //When
        String description = theOrder.getDescription();
        //Then
        assertEquals("Your pizza is made with: \ncheese + tomato sauce + onion + ham + pineapple + another cheese", description);
    }
}
