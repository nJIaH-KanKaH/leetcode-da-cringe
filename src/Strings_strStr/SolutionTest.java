package Strings_strStr;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    @DisplayName("test case sadbutsad returns sad")
    void strStr_sadbutsad_sad() {
        Solution s = new Solution();
        assertEquals(0,s.strStr("sadbutsad","sad"));
    }
    @Test
    @DisplayName("test case leetcode returns leeto")
    void strStr_leetcode_leeto() {
        Solution s = new Solution();
        assertEquals(-1,s.strStr("leetcode","leeto"));
    }
}