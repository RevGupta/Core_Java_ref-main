package additional;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;
import java.util.List;

public class ListReverserTest {

    @Test
    public void testReverseList() {
        List<String> original = new ArrayList<>();
        original.add("Hello");
        original.add("World");
        original.add("!");

        List<String> reversed = ListReverser.reverseList(original);

        assertEquals(3, reversed.size());
        assertEquals("!", reversed.get(0));
        assertEquals("World", reversed.get(1));
        assertEquals("Hello", reversed.get(2));
    }
}
