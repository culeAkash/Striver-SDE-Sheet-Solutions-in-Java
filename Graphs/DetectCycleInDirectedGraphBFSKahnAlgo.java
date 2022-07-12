class Solution {
    // Function to detect cycle in a directed graph.
    public boolean isCyclic(int V, ArrayList<ArrayList<Integer>> adj) {
        int[] indegree = new int[V];
        
        
        //find indegree of all nodes
        for(int i=0;i<V;i++){
            for(int it:adj.get(i))
                indegree[it]+=1;
        }
        
        return helper(adj,indegree);
        
    }
    
    public boolean helper(ArrayList<ArrayList<Integer>> adj,int[] indegree){
        Queue<Integer> pendingNodes = new LinkedList<>();
        for(int i=0;i<indegree.length;i++){
            if(indegree[i]==0)
                pendingNodes.add(i);
        }
        int index=0;
        int count=0;
        while(!pendingNodes.isEmpty()){
            int head = pendingNodes.poll();
            // topo[index++] = head;
            count++;
            for(int it:adj.get(head)){
                indegree[it]--;
                if(indegree[it]==0)
                    pendingNodes.add(it);
            }
        }
        return count==indegree.length?false:true;//if whole topo sort is feasible no cycle
    }
}