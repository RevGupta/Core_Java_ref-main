package maps;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class TwoSumFinderTest {

    @Test
    public void testPositiveResponse() {
        int[] nums = {10, 20, 30, 40, 50, 60};
        int target = 100;
        int[] expected = {3, 5};
        assertArrayEquals(expected, TwoSumFinder.findTwoSumIndices(nums, target));
    }

    @Test
    public void testNegativeResponse() {
        int[] nums = {1, 2, 3, 4, 5};
        int target = 20;
        int[] expected = {};
        assertArrayEquals(expected, TwoSumFinder.findTwoSumIndices(nums, target));
    }

    @Test
    public void testZeroResponse() {
        int[] nums = {0, 0, 0, 0};
        int target = 0;
        int[] expected = {0, 1};
        assertArrayEquals(expected, TwoSumFinder.findTwoSumIndices(nums, target));
    }

    @Test
    public void testNullResponse() {
        int[] nums = null;
        int target = 10;
        int[] expected = {};
        assertArrayEquals(expected, TwoSumFinder.findTwoSumIndices(nums, target));
    }
}