class Solution {
    // Function to return a list containing the DFS traversal of the graph.
    public ArrayList<Integer> dfsOfGraph(int V, ArrayList<ArrayList<Integer>> adj) {
        boolean[] visited = new boolean[V];
        
        ArrayList<Integer> storeDfs = new ArrayList<>();
        for(int i=0;i<V;i++){
            if(!visited[i])
                dfsHelper(adj,visited,i,storeDfs);
        }
        return storeDfs;
    }
    
    private void dfsHelper(ArrayList<ArrayList<Integer>> graph, boolean[] visited, int i, ArrayList<Integer> storeDfs) {
        storeDfs.add(i);
        visited[i] = true;

        for(int elem:graph.get(i)){
            if(!visited[elem])
                dfsHelper(graph, visited, elem, storeDfs);
        }
    }
}