package N838_pushDominoes_Unsolved;

/*
* Input: dominoes = ".L.R...LR..L.."
* Output: "LL.RR.LLRRLL.."
* */
public class Solution {
    public String pushDominoes(String dominoes) {
        int left=0,right=0;
        while(left<dominoes.length()&&right<dominoes.length()) {
            if(dominoes.charAt(right) !='L'){
                right++;
                continue;
            }
            if(dominoes.charAt(left) != 'R'){
                left++;continue;
            }
        }
        return dominoes;
    }
}
