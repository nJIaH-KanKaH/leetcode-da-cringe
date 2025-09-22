package N2894_diffDivisibleAndNonDivisible;

public class Solution {
    public int differenceOfSums(int n, int m) {
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += (i%m==0?-i:i);
        }
        return sum;
    }
}
