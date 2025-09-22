package N3355_zeroArrayTransformation1;

import org.junit.jupiter.api.*;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    @DisplayName("test case {4,3,2,1},{{1, 3}, {0, 2}} returns false")
    void isZeroArray_4321_1302_returnFalse() {
        Solution solution = new Solution();
        int[] nums = {4, 3, 2, 1};
        int[][] queries = {{1, 3}, {0, 2}};
        assertFalse(solution.isZeroArray(nums,queries));
    }
    @Test
    @DisplayName("test case {1,0,1},{{0, 2}} returns true")
    void isZeroArray_101_02_returnTrue(){
        Solution solution = new Solution();
        int[] nums = {1,0,1};
        int[][] queries = {{0, 2}};
        assertTrue(solution.isZeroArray(nums,queries));
    }

    @Test
    @DisplayName("test case {100000},{{0, 99999}} returns true")
    void isZeroArray_10000_099999_returnTrue(){
        Solution solution = new Solution();
        String[] inputData1 = null;
        String[] inputData2 = null;
        try {
            inputData1 = Files.readAllLines(Paths.get("./data/nums.txt")).get(0).split(",");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        int[] nums = new int[inputData1.length];
        for (int i = 0; i < inputData1.length; i++) {
            nums[i] = Integer.parseInt(inputData1[i]);
        }
        try {
            inputData2 = Files.readAllLines(Paths.get("./data/queries.txt")).get(0).split(";");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        int[][] queries = new int[inputData2.length][2];
        for (int i = 0; i < inputData2.length; i++) {
            queries[i] = Arrays.stream(inputData2[i].split(",")).mapToInt(Integer::parseInt).toArray();
        }
        assertTrue(solution.isZeroArray(nums,queries));
    }

}