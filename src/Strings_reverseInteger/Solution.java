package Strings_reverseInteger;

import java.util.Arrays;

import static adz.Utils.print;

public class Solution {
    public int reverse(int x) {
        char[]a = new char[11];
        int i=0;
        boolean neg=false;
        for(char c:String.valueOf(x).toCharArray()){
            if(c=='-') {
                neg=true;
                continue;
            }
            a[i++]=c;
        }
        char[]n=new char[i];
        for (int j = i-1; j >=0; j--) {
            n[i-j-1] = a[j];
        }
        try{
            return Integer.parseInt(neg?"-"+String.valueOf(n):String.valueOf(n));
        } catch (NumberFormatException e){
            return  0;
        }
    }
}
