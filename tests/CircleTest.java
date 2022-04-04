import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class CircleTest {

    // /**
    // * Set up code to instantiate the shared variables
    // * for testing. Yes, this routine would be problematic
    // * if the constructor tests fail.
    // */
    public CptS132Circle unitUnderTest;
    public int diameter = 5;

    @Before
    public void setup() {
        unitUnderTest = new CptS132Circle(diameter);

    }

    @Test
    public void test_getDiameter() {
        assertEquals(diameter, unitUnderTest.getDiameter());

    }

    @Test
    public void test_getArea_upToTwoDecPrecision() {
        double area = unitUnderTest.getArea();
        assertEquals(19.63, area, 0.005);
    }

    // variables for test cases
    // @Test
    // public void CptS132CircleConstructor() {
    // new CptS132Circle(5);
    // }

    // @Test
    // public void testConstructor0() {
    // new CptS132Circle(0);
    // }

    /**
     * Error case constructor test. <br/>
     * Parameter value: -2, 5
     */
    @Test(expected = IllegalArgumentException.class)
    public void testConstructor_2() {
        new CptS132Circle(-2);
    }

    /**
     * Error case constructor test. <br/>
     * Parameter value: 2, -5
     */
    @Test(expected = IllegalArgumentException.class)
    public void testConstructor_5() {
        new CptS132Circle(-5);
    }

}
