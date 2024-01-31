package additional;

import org.junit.Test;
import static org.junit.Assert.*;

public class FactorialFinderTest {

    @Test
    public void testFindFactorial() {
        assertEquals(1, FactorialFinder.findFactorial(0));
        assertEquals(1, FactorialFinder.findFactorial(1));
        assertEquals(2, FactorialFinder.findFactorial(2));
        assertEquals(6, FactorialFinder.findFactorial(3));
        assertEquals(24, FactorialFinder.findFactorial(4));
        assertEquals(120, FactorialFinder.findFactorial(5));
        assertEquals(720, FactorialFinder.findFactorial(6));

        // Testing exception for negative input
        try {
            FactorialFinder.findFactorial(-1);
            fail("Expected IllegalArgumentException for negative input.");
        } catch (IllegalArgumentException e) {
            // Expected exception
        }
    }
}
