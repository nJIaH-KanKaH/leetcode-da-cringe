package N2182_ConstructStringWithRepeatLimit;

public class Solution {
    public String repeatLimitedString(String s, int repeatLimit) {
        int[] usages = new int[26];
        char[] chars = new char[s.length()];
        for (int i = 0; i < s.length(); i++) {
            usages[s.charAt(i) - 'a']++;
        }
        int j = 0, k = 0;
        for (int i = usages.length-1; i >= 0;) {
            if (usages[i] == 0) {
                i--;
                continue;
            }
            k = i;
            if (usages[i] > repeatLimit) {
                while (k >= 0) {
                    if (usages[k] == 0) k--;
                    else break;
                }
                for (int l = 0; l < repeatLimit; l++) {
                    chars[j++] = (char) ('a' + i);
                }
                chars[j++] = (char) ('a'+ k);
                usages[i]-=repeatLimit;usages[k]--;
            } else {
                for (int l = 0; l < usages[i]; l++) {
                    chars[j++] = (char) ('a' + i);
                }
                i--;
            }
        }
        return new String(chars);
    }
}