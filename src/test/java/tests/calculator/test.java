package tests.calculator;

import april25.Calculator;
import org.testng.Assert;
import org.testng.annotations.Test;

public class test {
    @Test
    public void test_byte() {
        Calculator calculator = new Calculator();
        Assert.assertEquals(calculator.squareRoot(100000000), 10000);
    }
}
