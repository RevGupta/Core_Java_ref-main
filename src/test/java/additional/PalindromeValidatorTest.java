package additional;

import org.junit.Test;
import static org.junit.Assert.*;

public class PalindromeValidatorTest {

    @Test
    public void testValidate() {
        assertTrue(PalindromeValidator.validate(121));
        assertTrue(PalindromeValidator.validate(1221));
        assertTrue(PalindromeValidator.validate(12321));
        assertFalse(PalindromeValidator.validate(12345));
        assertFalse(PalindromeValidator.validate(123));
        assertFalse(PalindromeValidator.validate(-121));
    }
}
