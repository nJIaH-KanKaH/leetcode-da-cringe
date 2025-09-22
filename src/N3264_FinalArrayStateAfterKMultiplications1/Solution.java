package N3264_FinalArrayStateAfterKMultiplications1;

import java.util.Comparator;
import java.util.PriorityQueue;

public class Solution {
    public int[] getFinalState(int[] nums, int k, int multiplier) {
        PriorityQueue<Integer>q = new PriorityQueue<>(nums.length, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return nums[o1]<nums[o2] ? -1 : (nums[o1]>nums[o2]?1:(o1.compareTo(o2)));
            }
        });
        for (int i = 0; i < nums.length; i++) {
            q.add(i);
        }
        for (int i = 0; i < k; i++) {
            int ind = q.poll();
            nums[ind] *=multiplier;
            q.add(ind);
        }
        return nums;
    }
}
