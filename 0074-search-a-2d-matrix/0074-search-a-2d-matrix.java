class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int rows=matrix.length;
        int column=matrix[0].length;
        int l=0;
        int r=rows*column-1;
        while(l<=r){
            int mid=l+(r-l)/2;
            int row=mid/column;
            int col=mid%column;
            if(matrix[row][col]==target) return true;
            else if(matrix[row][col]>target){
                r=mid-1;
            }
            else{
                l=mid+1;
            }
        }
return false;
    }
}