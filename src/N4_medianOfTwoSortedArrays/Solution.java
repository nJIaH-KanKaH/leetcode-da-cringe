package N4_medianOfTwoSortedArrays;

import java.util.Arrays;

public class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int len = nums1.length+nums2.length;
        int midElement = len/2;
        boolean isEvenLen = len%2==0;
        int[] nums = new int[len];
        int i=0,j=0,k=0;
        for(;i<nums1.length&&j<nums2.length;){
            if(nums1[i] <= nums2[j]){
                nums[k++] = nums1[i++];
            } else {
                nums[k++] = nums2[j++];
            }
        }
        if(i<nums1.length){
            while(i<nums1.length){
                nums[k++]=nums1[i++];
            }
        }
        if(j<nums2.length){
            while(j<nums2.length){
                nums[k++]=nums2[j++];
            }
        }
        if(!isEvenLen){
            return nums[midElement];
        }
        return ((double)(nums[midElement]+nums[midElement-1]))/2;
    }
}
