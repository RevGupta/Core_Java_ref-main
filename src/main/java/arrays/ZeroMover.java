package arrays;

public class ZeroMover {
    public static void main(String[] args) {
        int[] nums = { 0, 3, 0, 2, 8, 4, 0, 1 };

        moveZeros(nums);

        System.out.print("Modified Array: ");
        printArray(nums);
    }

    public static void moveZeros(int[] array) {
        int nonZeroIndex = 0;

        for (int num : array) {
            if (num != 0) {
                array[nonZeroIndex++] = num;
            }
        }

        while (nonZeroIndex < array.length) {
            array[nonZeroIndex++] = 0;
        }
    }

    public static void printArray(int[] array) {
        for (int num : array) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}
