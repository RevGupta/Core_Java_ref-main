package additional;

import org.junit.Test;
import static org.junit.Assert.*;

public class CharacterRepeaterTest {

    @Test
    public void testIdentifyAndPrintRepeated() {
        System.out.println("Test Case 1:");
        CharacterRepeater.identifyAndPrintRepeated("programming");

        System.out.println("\nTest Case 2:");
        CharacterRepeater.identifyAndPrintRepeated("java");

        System.out.println("\nTest Case 3:");
        CharacterRepeater.identifyAndPrintRepeated("hello");

        // Testing exception for null input
        try {
            CharacterRepeater.identifyAndPrintRepeated(null);
            fail("Expected IllegalArgumentException for null input.");
        } catch (IllegalArgumentException e) {
            // Expected exception
        }
    }
}

