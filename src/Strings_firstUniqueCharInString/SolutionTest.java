package Strings_firstUniqueCharInString;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    @DisplayName("test case leetcode returns 0")
    void firstUniqChar_leetcode_0() {
        Solution s = new Solution();
        assertEquals(0,s.firstUniqChar("leetcode"));
    }
    @Test
    @DisplayName("test case loveleetcode returns 2")
    void firstUniqChar_loveleetcode_0() {
        Solution s = new Solution();
        assertEquals(2,s.firstUniqChar("loveleetcode"));
    }
    @Test
    @DisplayName("test case aabb returns -1")
    void firstUniqChar_aabb__1() {
        Solution s = new Solution();
        assertEquals(-1,s.firstUniqChar("aabb"));
    }
    @Test
    @DisplayName("test case z returns 0")
    void firstUniqChar_z_0() {
        Solution s = new Solution();
        assertEquals(0,s.firstUniqChar("z"));
    }
}