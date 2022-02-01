//Brute Force Approach
class Solution {
    public void setZeroes(int[][] matrix) {
        if(matrix.length==0){
            return;
        }
        HashMap<Pair,Boolean> hm= new HashMap<>();
        
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                if(matrix[i][j]==0){
                    hm.put(new Pair(i,j),true);
                }
            }
        }
        for(Map.Entry<Pair,Boolean> e:hm.entrySet()){
            Pair temp= e.getKey();
            int r= temp.row;
            int c=temp.col;
            for(int i=0;i<matrix[0].length;i++){
                matrix[r][i]=0;
            }
            for(int i=0;i<matrix.length;i++){
                matrix[i][c]=0;
            }
            
            
        }
    }
}

class Pair{
    int row;
    int col;
    
    Pair(int r,int c){
        row=r;
        col=c;
    }
}

//Optimal Solution

class Solution {
    public void setZeroes(int[][] matrix) {
        if(matrix.length==0){
            return;
        }
        boolean col0=false;//To take care of the 1st column which we will use as dummy array and if we make its 
        //elements zero straight away it will affect the remaining matrix
        //
        
        //first iteration
        for(int i=0;i<matrix.length;i++){
            if(matrix[i][0]==0)col0=true;
            for(int j=1;j<matrix[0].length;j++){
                if(matrix[i][j]==0){
                    matrix[i][0]=matrix[0][j]=0;
                }
            }
        }
        
        //second iteration
        for(int i=matrix.length-1;i>=0;i--){
            for(int j=matrix[0].length-1;j>=1;j--){
                if(matrix[i][0]==0 || matrix[0][j]==0){
                    matrix[i][j]=0;
                }
            }
            if(col0){
                matrix[i][0]=0;
            }
        }
    }
}