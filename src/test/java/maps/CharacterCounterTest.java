package maps;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class CharacterCounterTest {

    @Test
    public void testPositiveResponse() {
        String input = "test string";
        String output = getOutput(input);
        assertTrue(output.contains("t-3"));
        assertTrue(output.contains("e-1"));
        assertTrue(output.contains("s-2"));
        assertTrue(output.contains("r-1"));
        assertTrue(output.contains("i-1"));
        assertTrue(output.contains("n-1"));
        assertTrue(output.contains("g-1"));
    }

    @Test
    public void testNegativeResponse() {
        String input = "";
        assertEquals("Input string is null or empty", getOutput(input).trim());
    }

    @Test
    public void testNullResponse() {
        String input = null;
        assertEquals("Input string is null or empty", getOutput(input).trim());
    }

    private String getOutput(String input) {
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        PrintStream printStream = new PrintStream(outputStream);
        PrintStream oldOut = System.out;

        // Redirect System.out to printStream
        System.setOut(printStream);

        // Capture the output
        CharacterCounter.countCharacters(input);

        // Reset System.out
        System.out.flush();
        System.setOut(oldOut);

        // Return the captured output
        return outputStream.toString().replaceAll("\\s+", " ").trim();
    }
}