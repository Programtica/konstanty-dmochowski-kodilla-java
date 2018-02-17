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
    public void testCalculations() {
        //Given
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring");
        Calculator calculator = context.getBean(Calculator.class);
        //When
        double testAdd = calculator.add(5,3.5);
        double testSub = calculator.sub(6,2);
        double testMul = calculator.mul(4,5.25);
        double testDiv = calculator.div(5,2);
        //Then
        Assert.assertEquals(8.5, testAdd, 0.0);
        Assert.assertEquals(4, testSub, 0.0);
        Assert.assertEquals(21, testMul, 0.0);
        Assert.assertEquals(2.5, testDiv, 0.0);

    }
}
