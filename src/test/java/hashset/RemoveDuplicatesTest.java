package hashset;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class RemoveDuplicatesTest {
    private RemoveDuplicates removeDuplicates;

    @BeforeEach
    public void setUp() {
        removeDuplicates = new RemoveDuplicates();
    }

    // Positive test cases
    @Test
    public void testRemoveDuplicatesPositive() {
        String input = "banana";
        String expectedOutput = "ban";
        Assertions.assertEquals(expectedOutput, removeDuplicates.removeDuplicates(input));
    }

    // Negative test cases
    @Test
    public void testRemoveDuplicatesNegative() {
        String input = "";
        String expectedOutput = "";
        Assertions.assertEquals(expectedOutput, removeDuplicates.removeDuplicates(input));
    }

    // Zero test cases
    @Test
    public void testRemoveDuplicatesZero() {
        String input = "aaa";
        String expectedOutput = "a";
        Assertions.assertEquals(expectedOutput, removeDuplicates.removeDuplicates(input));
    }

    // Null test cases
    @Test
    public void testRemoveDuplicatesNull() {
        Assertions.assertNull(removeDuplicates.removeDuplicates(null));
    }
}