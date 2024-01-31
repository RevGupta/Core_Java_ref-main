package additional;

import org.junit.Test;

public class IntegerValueExchangerTest {

    @Test
    public void testExchangeValues() {
        System.out.println("Test Case 1:");
        IntegerValueExchanger.exchangeValues(5, 10);

        System.out.println("\nTest Case 2:");
        IntegerValueExchanger.exchangeValues(-3, 7);

        System.out.println("\nTest Case 3:");
        IntegerValueExchanger.exchangeValues(0, 0);
    }
}

