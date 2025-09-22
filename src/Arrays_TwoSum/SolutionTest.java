package Arrays_TwoSum;

import Arrays_TwoSum.Solution;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    @DisplayName("test case 2 7 9 11 returns 0 1")
    void twoSum() {
        Solution solution = new Solution();
        int[] a = new int[]{2,7,9,11};
        int t = 9;
        assertArrayEquals(new int[]{0,1},solution.twoSum(a,t));
    }
}