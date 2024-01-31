package additional;

public class CharacterRepeater {

    public static void identifyAndPrintRepeated(String input) {
        if (input == null) {
            throw new IllegalArgumentException("Input string cannot be null.");
        }

        char[] chars = input.toCharArray();

        System.out.println("Repeated characters in the string:");

        for (int i = 0; i < chars.length; i++) {
            for (int j = i + 1; j < chars.length; j++) {
                if (chars[i] == chars[j]) {
                    System.out.print(chars[i] + " ");
                    break;
                }
            }
        }
    }
}
