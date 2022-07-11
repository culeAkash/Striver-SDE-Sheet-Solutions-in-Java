class Solution {
    // Function to detect cycle in an undirected graph.
    public boolean isCycle(int V, ArrayList<ArrayList<Integer>> adj) {
        //durinng dfs call always pass the parent with the node if any node other than parent is already visited then ethere is a cycle
        
        boolean[] visited = new boolean[V];
        
        for(int i=0;i<V;i++){
            if(!visited[i]){
                if(helper(adj,visited,i,-1))// -1 is the parent of 0
                    return true;
            }
        }
        return false;
    }
    
    public boolean helper(ArrayList<ArrayList<Integer>> adj,boolean[] visited,int node,int parent){
        visited[node] = true;
        
        for(int i:adj.get(node)){
            if(!visited[i]){//if not already visited check for cyle in other nodes
                 if(helper(adj,visited,i,node))return true;
            }
            else if(i!=parent)//if the elem already visited is not parent
                return true;
    }
    return false;
}
}