package Strings_firstUniqueCharInString;

import static adz.Utils.print;

public class Solution {
    public int firstUniqChar(String s) {
        int[]isuniq = new int[123];
        int i=1;
        for(char c:s.toCharArray()){
            isuniq[(int)c]=isuniq[(int)c]==0?i:-1;
            i++;
        }
        int min = -1;
        for(int j=97;j<123;j++){
            if(isuniq[j]>0 && (isuniq[j]<min||min<0)){
                min=isuniq[j];
            }
        }
        return min>=0?min-1:min;
    }
}
