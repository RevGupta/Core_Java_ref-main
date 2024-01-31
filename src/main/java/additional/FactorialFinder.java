package additional;

public class FactorialFinder {

    public static int findFactorial(int num) {
        if (num < 0) {
            throw new IllegalArgumentException("Input should be a non-negative integer.");
        }

        if (num == 0 || num == 1) {
            return 1;
        }

        int result = 1;
        for (int i = 2; i <= num; i++) {
            result *= i;
        }

        return result;
    }
}
