package TestClases;

import Clases.Calculator;
import org.junit.Assert;
import org.junit.Test;

public class TestCalculator {
    private int result;
    Calculator yf = new Calculator();

    @Test
    public void calculatorNotNull(){
        Assert.assertNotNull(yf);
    }


    @Test
    public void testAdd(){
        result =yf.add(1,2);
        Assert.assertSame(3,result);
    }

    @Test
    public void testSubtract(){
        result = yf.subtract(10, 4);
        Assert.assertSame(6, result);
    }

    @Test
    public void testMultiply(){
        result = yf.multiply(10, 4);
        Assert.assertSame(40, result);
    }

    @Test
    public void testDivisionCero(){
        try{
            result = yf.division(10,0);
        }catch(ArithmeticException e){
            System.out.println("Error: Don't divide a number by zero");
        }
    }

    @Test
    public void testDivision(){
        result = yf.division(10,2);
        Assert.assertSame(5, result);
    }
}
