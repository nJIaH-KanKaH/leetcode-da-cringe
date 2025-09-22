package N1298_maxCandiesCanGetFromBoxes;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    @DisplayName("test case status = [1,0,1,0], candies = [7,5,4,100], keys = [[],[],[1],[]], containedBoxes = [[1,2],[3],[],[]], initialBoxes = [0] returns 16")
    void maxCandies_test1_16() {
        Solution s = new Solution();
        int[] status = {1,0,1,0};
        int[] candies = {7,5,4,100};
        int[][] keys = {{},{},{1},{}};
        int[][] containedBoxes = {{1,2},{3},{},{}};
        int[] initialBoxes = {0};

        int maxCandies = s.maxCandies(status,candies,keys,containedBoxes,initialBoxes);
        assertEquals(16,maxCandies);
    }

    @Test
    @DisplayName("status = [1,0,0,0,0,0], candies = [1,1,1,1,1,1], keys = [[1,2,3,4,5],[],[],[],[],[]], containedBoxes = [[1,2,3,4,5],[],[],[],[],[]], initialBoxes = [0] return")
    void maxCandies_test2_6(){
        Solution s = new Solution();
        int[] status = {1,0,0,0,0,0};
        int[] candies = {1,1,1,1,1,1};
        int[][] keys = {{1,2,3,4,5},{},{},{},{},{}};
        int[][] containedBoxes = {{1,2,3,4,5},{},{},{},{},{}};
        int[] initialBoxes = {0};

        int maxCandies = s.maxCandies(status,candies,keys,containedBoxes,initialBoxes);
        assertEquals(6,maxCandies);
    }
    @Test
    @DisplayName("status = [1,1,0,1,1,0,0,1,0,0,1,1,0,0,0,0,1,0,1,1,0,0,0,0,1,0,0,0,1,0,0,1,1,1,1,1,0,1,1,0,1,1,1,1,0,0,1,0,0] return 23185")
    void maxCandies_test3_23185(){
        Solution s = new Solution();
        int[] status = {1,1,0,1,1,0,0,1,0,0,1,1,0,0,0,0,1,0,1,1,0,0,0,0,1,0,0,0,1,0,0,1,1,1,1,1,0,1,1,0,1,1,1,1,0,0,1,0,0};
        int[] candies = {732,320,543,300,814,568,947,685,142,111,805,233,813,306,55,1,290,944,36,592,150,596,372,299,644,
                445,605,202,64,807,753,731,552,766,119,862,453,136,43,572,801,518,936,408,515,215,492,738,154};
        String[] inputData2 = null;
        try {
            inputData2 = Files.readAllLines(Paths.get("./data/N1298_keys.txt")).get(0).split(";");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        int[][] keys = new int[inputData2.length][];
        for (int i = 0; i < inputData2.length; i++) {
            if(inputData2[i].length()==0){
                keys[i]=new int[]{};
                continue;
            }
            keys[i] = Arrays.stream(inputData2[i].split(",")).mapToInt(Integer::parseInt).toArray();
        }
        int[][] containedBoxes = {{14},{},{26},{4,47},{},{6},{39,43,46},{30},{},{},{0,3},{},{},{},{},{27},{},{},{},{},{12},{},{},{41},{},{31},{20,29},{13,35},{18},{10,40},{},{38},{},{},{19},{5},{},{},{11},{1},{15},{},{},{},{24},{},{},{},{}};
        int[] initialBoxes = {2,7,8,9,16,17,21,22,23,25,28,32,33,34,36,37,42,44,45,48};

        int maxCandies = s.maxCandies(status,candies,keys,containedBoxes,initialBoxes);
        assertEquals(23185,maxCandies);
    }
}
