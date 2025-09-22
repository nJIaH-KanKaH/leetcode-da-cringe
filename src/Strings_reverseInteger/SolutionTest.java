package Strings_reverseInteger;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    @DisplayName("test case 123 returns 321")
    void reverse_123_321() {
        Solution s = new Solution();
        assertEquals(321,s.reverse(123));
    }

    @Test
    @DisplayName("test case -123 returns -321")
    void reverse__123_321() {
        Solution s = new Solution();
        assertEquals(-321,s.reverse(-123));
    }

    @Test
    @DisplayName("test case -123 returns -321")
    void reverse_120_21() {
        Solution s = new Solution();
        assertEquals(21,s.reverse(120));
    }
}