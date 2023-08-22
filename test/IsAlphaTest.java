import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

import src.strings.IsAlpha;

public class IsAlphaTest {

    @Test
    public void test_isAlphabetical() {
        // expected to be true
        String input1 = "abcdefghijklmno";
        String input2 = "abcdxxxyzzzz";
        String input3 = "fpw";

        // expected to be false
        String input4 = "123a";
        String input5 = "abcABC";
        String input6 = "abcdefghikjlmno";

        assertTrue(IsAlpha.ft_isalpha(input1));
        assertTrue(IsAlpha.ft_isalpha(input2));
        assertTrue(IsAlpha.ft_isalpha(input3));

        assertFalse(IsAlpha.ft_isalpha(input4));
        assertFalse(IsAlpha.ft_isalpha(input5));
        assertFalse(IsAlpha.ft_isalpha(input6));
    }
}