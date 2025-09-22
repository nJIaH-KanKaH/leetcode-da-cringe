package Arrays_RotateImage;

public class Solution {
    public void rotate(int[][] matrix) {
        int n =matrix.length;
        for (int i = 0; i < n/2; i++) {
            swapLines(matrix,i,n-i-1);
        }
        for (int i = 0; i<n;i++){
            swapRowAndColumn(matrix,i,i);
        }
    }
    public void swapLines(int[][]matrix,int row1,int row2){
        int swap;
        for (int i = 0; i < matrix.length; i++) {
            swap = matrix[row1][i];
            matrix[row1][i]=matrix[row2][i];
            matrix[row2][i]=swap;
        }
    }
    public void swapRowAndColumn(int[][]matrix,int row,int column){
        int swap;
        for (int i = 0; i < matrix.length; i++) {
            if(i>row)continue;
            swap = matrix[i][column];
            matrix[i][column]=matrix[row][i];
            matrix[row][i]=swap;
        }
    }
}