package additional;

public class PalindromeValidator {

    public static boolean validate(int num) {
        String numAsString = Integer.toString(num);
        int left = 0;
        int right = numAsString.length() - 1;

        while (left < right) {
            if (numAsString.charAt(left) != numAsString.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }

        return true;
    }
}
