package hashset;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetExample {
    private HashSet<String> stringSet;

    public HashSetExample() {
        stringSet = new HashSet<>();

        stringSet.add("Apple");
        stringSet.add("Banana");
        stringSet.add("Orange");
        stringSet.add("Grapes");
        stringSet.add("Mango");
        stringSet.add("Pineapple");
        stringSet.add("Strawberry");
        stringSet.add("Watermelon");
        stringSet.add("Kiwi");
        stringSet.add("Peach");
    }

    // Iterator method
    public void iterateUsingIterator() {
        Iterator<String> iterator = stringSet.iterator();
        while (iterator.hasNext()) {
            String element = iterator.next();
            System.out.println(element);
        }
    }

    // For loop method
    public void iterateUsingForLoop() {
        for (String element : stringSet) {
            System.out.println(element);
        }
    }

    // Enhanced for loop method
    public void iterateUsingEnhancedForLoop() {
        stringSet.forEach(System.out::println);
    }
}
