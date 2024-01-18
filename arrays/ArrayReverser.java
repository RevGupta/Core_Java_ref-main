package arrays;

public class ArrayReverser {
    public static void main(String[] args) {
        int[] original = { 1, 2, 3, 4, 5 };
        int[] reversed = reverse(original);

        System.out.print("Original Array: ");
        printArray(original);

        System.out.print("Reversed Array: ");
        printArray(reversed);
    }

    public static int[] reverse(int[] array) {
        int length = array.length;
        int[] reversed = new int[length];

        for (int i = 0; i < length; i++) {
            reversed[i] = array[length - 1 - i];
        }

        return reversed;
    }

    public static void printArray(int[] array) {
        for (int num : array) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}
