class Solution
{
    //Function to find sum of weights of edges of the Minimum Spanning Tree.
    static int spanningTree(int V, ArrayList<ArrayList<ArrayList<Integer>>> adj) 
    {
        int[] key = new int[V];
        boolean[] mst = new boolean[V];
        int[] parent = new int[V];
        
        for(int i=0;i<V;i++){
            key[i] = Integer.MAX_VALUE;
            parent[i] = -1;
        }
        
        key[0] = 0;
        
        for(int i=0;i<V-1;i++){
            int mini = Integer.MAX_VALUE;
            int u = 0;
            
            for(int j=0;j<V;j++){
                if(!mst[j] && mini>key[j]){
                    mini = key[j];
                    u = j;
                }
            }
            
            mst[u] = true;
            ArrayList<ArrayList<Integer>> adjList = adj.get(u);
            for(ArrayList<Integer> it: adjList){
                if(!mst[it.get(0)] && it.get(1) < key[it.get(0)]){
                    parent[it.get(0)] = u;
                    key[it.get(0)] = it.get(1);
                }
            }
        }
        
        int sum = 0;
        for(int i:key)
            sum+= i;
        return sum;
    }
}