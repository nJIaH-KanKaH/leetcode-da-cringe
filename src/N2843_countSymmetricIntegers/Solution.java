package N2843_countSymmetricIntegers;

import java.util.Arrays;

public class Solution {
    public int countSymmetricIntegers(int low, int high) {
        int count = 0;
        if (low > high) return 0;
        for (int num = low; num <= high; num++) {
            if(num<100 &&num%11==0) count++;
            if(num<1001)continue;
            int left = (num/1000 + ((num/100)%10));
            int right = (num%10 + (num/10)%10);
            if(left==right)count++;
        }
        return count;
    }
}
