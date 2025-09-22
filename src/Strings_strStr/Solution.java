package Strings_strStr;

public class Solution {
    public int strStr(String haystack, String needle) {
        char[]h=haystack.toCharArray();
        char[]n=needle.toCharArray();
        if(n.length>h.length) return -1;
        for (int i = 0; i < h.length; i++) {
            if(h[i]!=n[0]) {
                continue;
            }
            int j=0;
            while(j<n.length && i+j<h.length){
                if(h[i+j]!=n[j]){
                    break;
                }
                j++;
            }
            if(j==n.length){
                return i;
            }
        }

        return -1;
    }
}
