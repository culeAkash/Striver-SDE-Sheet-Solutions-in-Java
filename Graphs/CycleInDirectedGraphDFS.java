class Solution {
    // Function to detect cycle in a directed graph.
    public boolean isCyclic(int V, ArrayList<ArrayList<Integer>> adj) {
        //cycle is present only and only if a node repeats itself in a particular dfs call
        boolean[] visited = new boolean[V];
        boolean[] dfVisited = new boolean[V];//for one function call visited elements
        
        for(int i=0;i<V;i++){
            if(!visited[i]){
                if(helper(adj,i,visited,dfVisited))
                    return true;
            }
        }
        return false;
    }
    
    public boolean helper(ArrayList<ArrayList<Integer>> adj,int node,boolean[] visited,boolean[] dfVisited){
        visited[node] = true;
        dfVisited[node] = true;
        
        for(int i:adj.get(node)){
            if(!visited[i]){//if not visited check for next nodes
                if(helper(adj,i,visited,dfVisited))
                    return true;
            }
            else if(dfVisited[i])//if the node is already visited in this recursion stack then cycle is present
                return true;
        }
        //if no node is repeated twice in this cycle, put it to false so that it can participate in any other cycle
        dfVisited[node] = false;
        return false;
    }
}