import static org.junit.Assert.assertEquals;
import org.junit.Test;

class CircleTest {

    // variables for test cases
    @Test
    public void CptS132CircleConstructor() {
        new CptS132Circle(5);
    }

    @Test
    public void testConstructor0() {
        new CptS132Circle(0);
    }

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

    /**
     * Error case constructor test. <br/>
     * Parameter value: 20000, 5
     */
    @Test(expected = IllegalArgumentException.class)
    public void testConstructor20000() {
        new CptS132Circle(20000);
    }

    /**
     * Error case constructor test. <br/>
     * Parameter value: 2, 50000
     */
    @Test(expected = IllegalArgumentException.class)
    public void testConstructor50000() {
        new CptS132Circle(50000);
    }

    /**
     * Set up code to instantiate the shared variables
     * for testing. Yes, this routine would be problematic
     * if the constructor tests fail.
     */
    @Before
    public void setup() {
        circle1 = new CptS132Circle(1);
        circle2 = new CptS132Circle(5);
        circle3 = new CptS132Circle(0);
    }

    /**
     * Testing getWidth, case 2x1
     */
    @Test
    public void testDiameter() {
        double expected = 1;
        assertEquals("Width 2x1", expected, rect2x1.getWidth(), 1e-9);
    }

    /**
     * Testing getWidth, case 5x5
     */
    @Test
    public void testDiameter2x3() {
        double expected = 5;
        assertEquals("Width 5x5", expected, rect5x5.getWidth(), 1e-8);
    }

    /**
     * Testing getArea, case 2x1
     */
    @Test
    public void testArea2x1() {
        double expected = 2;
        assertEquals("Area 2x1", expected, rect2x1.getArea(), 1e-9);
    }

    /**
     * Testing getArea, case 5x5
     */
    @Test
    public void testArea5x5() {
        double expected = 25;
        assertEquals("Area 5x5", expected, rect5x5.getArea(), 1e-8);
    }

    /**
     * Testing getArea, case 0x3
     */
    @Test
    public void testArea0x3() {
        double expected = 0;
        assertEquals("Area 0x3", expected, rect0x3.getArea(), 1e-9);
    }

}
