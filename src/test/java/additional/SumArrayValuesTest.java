package additional;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class SumArrayValuesTest {

    @Test
    public void testCalculateSum() {
        int[] values = {2, 4, 6, 8, 10};
        int sum = SumArrayValues.calculateSum(values);
        assertEquals(30, sum);
    }
}
