class Solution {
    // Function to return Breadth First Traversal of given graph.
    public ArrayList<Integer> bfsOfGraph(int V, ArrayList<ArrayList<Integer>> adj) {
        boolean[] visited = new boolean[V];
        ArrayList<Integer> ans = new ArrayList<>();
        
                ans.addAll(bfsHelper(adj,visited,0));
        
        return ans;
    }
    
    public ArrayList<Integer> bfsHelper(ArrayList<ArrayList<Integer>> graph,boolean[] visited,int i){
        visited[i] = true;
        
        Queue<Integer> pendingNodes = new LinkedList<>();
        
        pendingNodes.add(i);
        ArrayList<Integer> ans = new ArrayList<>();

        while(!pendingNodes.isEmpty()){
            int top = pendingNodes.poll();
            ans.add(top);
            for(int elem:graph.get(top)){
                if(!visited[elem]){
                    pendingNodes.add(elem);
                    visited[elem] = true;
                }
            }
        }
        return ans;
    }
}