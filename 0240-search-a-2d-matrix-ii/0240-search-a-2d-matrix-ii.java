class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int rows=matrix.length;
        int columns=matrix[0].length;
        
        int row=0;
        int col=columns-1;
        while(row<rows && col>=0) {   // row indexing 0 1 2 3     rows=length
        if(matrix[row][col]==target) return true;
        else if(matrix[row][col]>target) col=col-1;
        else row=row+1;  }
        return false;                     
    }
}