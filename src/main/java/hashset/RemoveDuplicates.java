package hashset;


import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicates {

    public String removeDuplicates(String input) {
        if (input == null) {
            return null;
        }

        Set<Character> charSet = new HashSet<>();
        StringBuilder result = new StringBuilder();

        for (char c : input.toCharArray()) {
            if (charSet.add(c)) {
                result.append(c);
            }
        }

        return result.toString();
    }
}
