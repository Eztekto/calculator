package test;

import Calculator.Calculator;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import org.testng.Assert;

public class CalcTest {
    @DataProvider
    public Object[][] testEqualsSum() {
        return new Object[][]{
                {4, 2, 2},
                {0, -1, 1},
                {-1, 0, -1},
                {2147483647, 0, 2147483647},
                {5,2,3},
        };
    }
    @DataProvider
    public Object[][] testEqualsMinus() {
        return new Object[][]{
                {0, 2, 2},
                {2, 1, -1},
                {9990, 10000, 10},
                {0, 1, 1}
        };
    }
    @DataProvider
    public Object[][] testEqualsDivide() {
        return new Object[][]{
                {1, 2, 2},
                {0, 1, 0},
                {10000, 100000, 10},
                {0, 0, 2},
        };
    }
    @DataProvider
    public Object[][] testEqualsMultiply() {
        return new Object[][]{
                {4, 2, 2},
                {6, 2, 3},
                {0, 1, 0},
                {-1, 1, -1},
                {10000, -100, -100}

        };
    }

    @Test(dataProvider = "testEqualsSum")
    public void sumTest(int one, int two, int three) {
        Assert.assertEquals(one, Calculator.sumTesting(two, three), "Значения не равны!");
        Assert.assertFalse(false);

    }

    @Test(dataProvider = "testEqualsMinus")
    public void minusTest(int four, int five, int six) {
        Assert.assertEquals(four, Calculator.minusTesting(five, six), "Значения не равны!");
        Assert.assertFalse(false);

    }

    @Test(dataProvider = "testEqualsDivide")
    public void divideTest(int seven, int eight, int nine) {
        Assert.assertEquals(seven, Calculator.divideTesting(eight, nine), "Значения не равны!");
        Assert.assertFalse(false);
    }

    @Test(dataProvider = "testEqualsMultiply")
    public void multiplyTest(int ten, int eleven, int twelve) {
        Assert.assertEquals(ten, Calculator.multiplyTesting(eleven, twelve), "Значения не равны!");
        Assert.assertFalse(false);
    }
}



