package Arrays_RotateImage;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static adz.Utils.*;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    @DisplayName("test case 123 456 789 returns 741 852 963")
    void rotate123() {
        Solution s = new Solution();
        int[][]matrix = new int[][]{{1,2,3},{4,5,6},{7,8,9}};
        int[][]matrixold = matrix;
        print(Arrays.deepToString(matrix));
        s.rotate(matrix);
        print(Arrays.deepToString(matrix));
        assertArrayEquals(new int[][]{{7,4,1},{8,5,2},{9,6,3}},matrix);
    }
}