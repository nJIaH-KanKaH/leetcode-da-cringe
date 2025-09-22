package N2434_usingRobotToPrintSmallestString;

import java.util.*;

public class Solution {
    public String robotWithString(String s) {
        Stack<Character>t = new Stack<>();
        Queue<Character> d = new PriorityQueue<>();
        char[]finalS = new char[s.length()];
        int finalI = 0;
        for(char i:s.toCharArray()){
            d.add(i);
        }
        for (char i:s.toCharArray()) {
            if(t.isEmpty()||t.peek() >= i){
                t.push(i);
                continue;
            }
            while(!t.isEmpty()&&t.peek() < i){
                finalS[finalI++] = t.pop();
            }
            t.push(i);
        }
        while(!t.isEmpty()){
            finalS[finalI++] = t.pop();
        }
        return String.valueOf(finalS);
    }
}
