package additional;

public class IntegerValueExchanger {

    public static void exchangeValues(int x, int y) {
        System.out.println("Before exchanging: x = " + x + ", y = " + y);

        x = x + y;
        y = x - y;
        x = x - y;

        System.out.println("After exchanging: x = " + x + ", y = " + y);
    }
}

