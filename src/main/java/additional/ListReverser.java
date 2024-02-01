package additional;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ListReverser {

    public static List<String> reverseList(List<String> inputList) {
        List<String> reversed = new ArrayList<>(inputList);
        Collections.reverse(reversed);
        return reversed;
    }

    public static void main(String[] args) {
        List<String> original = new ArrayList<>();
        original.add("Java");
        original.add("is");
        original.add("fun");
        original.add("!");

        System.out.println("Original List: " + original);

        List<String> reversed = reverseList(original);

        System.out.println("Reversed List: " + reversed);
    }
}
