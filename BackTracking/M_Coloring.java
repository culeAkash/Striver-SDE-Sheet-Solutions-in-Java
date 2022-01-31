class solve 
{
    //Function to determine if graph can be coloured with at most M colours such
    //that no two adjacent vertices of graph are coloured with same colour.
    public static boolean graphColoring(List<Integer>[] G, int[] color, int i, int m) 
    {
        int n= G.length;
        if(solve(G,color,n,i,m))return true;
        return false;
    }
    
    public static boolean solve(List<Integer>[] Graph,int[] color,int n,int node,int m){
        //if all nodes are colored
        if(n==node){
            return true;
        }
        
        //Checking all the colors for a node
        for(int i=1;i<=m;i++){
            if(isSafe(Graph,color,i,node)){
                //if safe color the node in that color
                color[node]=i;
                //call for the next node
                if(solve(Graph,color,n,node+1,m)){
                    return true;
                }//if solution is obtained we will not make further recursion calls and return true
                //backtrack
                color[node]=0;
            }
        }
        //if all the colors are tested and solution is not found
        return false;
    }
    
    public static boolean isSafe(List<Integer>[] G,int[] color,int col,int node){
        //checking if adjacent nodes have same color
        for(int it:G[node]){
            if(color[it]==col){
                return false;
            }
        }
        return true;
    }
}