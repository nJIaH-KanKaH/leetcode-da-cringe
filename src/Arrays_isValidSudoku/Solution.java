package Arrays_isValidSudoku;

import java.util.HashMap;
import java.util.Map;

import static adz.Utils.print;

public class Solution {
    public boolean isValidSudoku(char[][] board) {
        boolean[][][] squarechecks = new boolean[3][3][58];
        boolean[][] rowchecks = new boolean[9][58];
        boolean[][] columnchecks = new boolean[9][58];
        for (int i = 0; i < 9; i++) {
            int squarenum = i/3;
            char[] boardline = board[i];
            for (int j = 0; j < 9; j++) {
                if(boardline[j]==46){
                    continue;
                }
                if(squarechecks[squarenum][j/3][boardline[j]]){
                    return false;
                } else {
                    squarechecks[i/3][j/3][boardline[j]] = true;
                }
                if(rowchecks[i][boardline[j]]){
                    return false;
                } else {
                    rowchecks[i][boardline[j]] = true;
                }
                if(columnchecks[j][boardline[j]]){
                    return  false;
                }else{
                    columnchecks[j][boardline[j]]=true;
                }
            }
        }
        return true;
    }
}