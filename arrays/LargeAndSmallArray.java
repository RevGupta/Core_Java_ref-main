package arrays;

public class LargeAndSmallArray {
    public static void main(String[] args) {
        int[] numArray = {4, 9 , 3, 5, 1, 0, 8}; 

        int[] result = largeAndSmall(numArray);

        System.out.println("Largest number in Array: " + result[0]);
        System.out.println("Smallest number in Array: " + result[1]);
    }

    public static int[] largeAndSmall(int[] numbers) {
        if (numbers == null || numbers.length == 0) {
            return new int[] { 0, 0 };
        }

        int largest = numbers[0];
        int smallest = numbers[0];

        for (int num : numbers) {
            if (num > largest) {
                largest = num;
            } else if (num < smallest) {
                smallest = num;
            }
        }

        return new int[] { largest, smallest };
    }
}
