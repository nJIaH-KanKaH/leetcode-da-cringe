package N3355_zeroArrayTransformation1;

import java.util.Arrays;

public class Solution {
    public boolean isZeroArray(int[] nums, int[][] queries) {
        int[] num1 = new int[nums.length + 1];
        for (int[] query : queries) {
            num1[query[0]]++;
            num1[query[1] + 1]--;
        }
        int operationCount = 0;
        for (int i = 0; i < num1.length; i++) {
            operationCount += num1[i];
            if(i<nums.length && nums[i]>operationCount){
                return  false;
            }
        }
        return true;
    }
}
