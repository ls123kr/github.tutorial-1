import junit.framework.TestCase;

public class CalculatorTest extends TestCase {

    public void testSum() throws Exception {
        Calculator c = new Calculator();
        assertEquals(60, c.sum(10, 50));
        assertEquals(70, c.sum(20, 50));
        assertEquals(-50, c.sum(0, -50));
        assertEquals(-10, c.sum(-5, -5));
        assertEquals(40, c.sum(10, 30));
        assertEquals(66, c.sum(16, 50));
        assertEquals(2, c.sum(1,1));
    }

    public void testMultiply() throws Exception {
        Calculator c = new Calculator();
        assertEquals(60.0, c.multiply(2.0, 30.0),0);
        assertEquals(45.0, c.multiply(3.0, 15.0),0);
        assertEquals(90.0, c.multiply(3.0, 30.0),0);
        assertEquals(108, c.multiply(9.0, 12.0),0);
    }

}