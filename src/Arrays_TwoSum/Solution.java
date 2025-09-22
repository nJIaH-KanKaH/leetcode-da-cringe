package Arrays_TwoSum;

import java.util.Arrays;
import java.util.HashMap;
import static adz.Utils.*;

public class Solution {

    public int[] twoSum(int[] nums, int target) {
        HashMap<Object, Object> reversedNums = new HashMap<>(nums.length);
        for (int i=0;i<nums.length;i++) {
            int curr = target - nums[i];
            if(reversedNums.containsKey(nums[i])){
                return new int[]{(int) reversedNums.get(nums[i]),i};
            }

            reversedNums.put(curr,i);
        }
        return new int[]{};
    }
}
