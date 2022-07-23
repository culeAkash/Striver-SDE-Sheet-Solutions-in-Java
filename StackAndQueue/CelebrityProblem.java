

class Solution
{ 
    
    int celebrity(int arr[][],int n){
        int celeb = 0;
        for(int i=1;i<n;i++){
            if(arr[celeb][i]==1)
                celeb = i;
        }
        
        //now celeb is potential candidate for celeb
        for(int i=0;i<n;i++){
            if(i==celeb)
                continue;
                
            if(arr[celeb][i]==1 || arr[i][celeb]==0)
                return -1;
        }
        
        return celeb;
    }
    
    
    
    //Function to find if there is a celebrity in the party or not.
    int celebrityON(int M[][], int n)
    {
        int[] in = new int[n];
        int[] out = new int[n];
        
        for(int i=0;i<M.length;i++){
            for(int j=0;j<M.length;j++){
                if(M[i][j]==1)
                {
                    out[i]++;
                    in[j]++;
                }
            }
        }
        
        for(int i=0;i<n;i++){
            if(in[i]==n-1 && out[i]==0)
                return i;
        }
        
        return -1;
    }
}