class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        if(matrix.length==0){
            return false;
        }
        int m= matrix.length;
        int n= matrix[0].length;
        
        for(int i=0;i<m;i++){
            if(target<=matrix[i][n-1]){
                for(int j=n-1;j>=0;j--){
                    if(matrix[i][j]==target)
                        return true;
                }
                return false;
            }
        }
        return false;
    }
}