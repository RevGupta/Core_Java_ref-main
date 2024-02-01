package additional;

public class SumArrayValues {

    public static int calculateSum(int[] array) {
        int sum = 0;
        for (int value : array) {
            sum += value;
        }
        return sum;
    }

    public static void main(String[] args) {
        int[] values = {2, 4, 6, 8, 10};

        System.out.println("Array: " + java.util.Arrays.toString(values));

        int sum = calculateSum(values);

        System.out.println("Sum of Array: " + sum);
    }
}

