class Solution {
    public void rotate(int[][] matrix) {
        if(matrix.length==0){
            return;
        }
        
        //Transpose the Matrix
        for(int i=0;i<matrix.length;i++){
            for(int j=i;j<matrix[0].length;j++){
                int temp=matrix[i][j];
                matrix[i][j]=matrix[j][i];
                matrix[j][i]=temp;
            }
        }
        
        //reverse each column to rotate clockwise
        for(int j=0;j<matrix.length/2;j++){
            for(int i=0;i<matrix.length;i++){
                int temp=matrix[i][j];
                matrix[i][j]=matrix[i][matrix.length-1-j];
                matrix[i][matrix.length-1-j]=temp;
            }
        }
    }
}