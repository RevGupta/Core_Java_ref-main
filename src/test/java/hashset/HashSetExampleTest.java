package hashset;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class HashSetExampleTest {
    private HashSetExample example;

    @BeforeEach
    public void setUp() {
        example = new HashSetExample();
    }

    // Positive test cases
    @Test
    public void testIteratorPositive() {
        Assertions.assertDoesNotThrow(() -> example.iterateUsingIterator());
    }

    @Test
    public void testForLoopPositive() {
        Assertions.assertDoesNotThrow(() -> example.iterateUsingForLoop());
    }

    @Test
    public void testEnhancedForLoopPositive() {
        Assertions.assertDoesNotThrow(() -> example.iterateUsingEnhancedForLoop());
    }

    // Negative test cases
    @Test
    public void testIteratorNegative() {
        Assertions.assertThrows(NullPointerException.class, () -> {
            HashSetExample nullExample = null;
            nullExample.iterateUsingIterator();
        });
    }

    @Test
    public void testForLoopNegative() {
        Assertions.assertThrows(NullPointerException.class, () -> {
            HashSetExample nullExample = null;
            nullExample.iterateUsingForLoop();
        });
    }

    @Test
    public void testEnhancedForLoopNegative() {
        Assertions.assertThrows(NullPointerException.class, () -> {
            HashSetExample nullExample = null;
            nullExample.iterateUsingEnhancedForLoop();
        });
    }

    // Null test cases
    @Test
    public void testIteratorNull() {
        Assertions.assertThrows(NullPointerException.class, () -> {
            example = null;
            example.iterateUsingIterator();
        });
    }

    @Test
    public void testForLoopNull() {
        Assertions.assertThrows(NullPointerException.class, () -> {
            example = null;
            example.iterateUsingForLoop();
        });
    }

    @Test
    public void testEnhancedForLoopNull() {
        Assertions.assertThrows(NullPointerException.class, () -> {
            example = null;
            example.iterateUsingEnhancedForLoop();
        });
    }
}
