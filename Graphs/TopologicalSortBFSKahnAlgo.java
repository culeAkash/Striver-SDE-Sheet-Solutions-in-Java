class Solution
{
    //Function to return list containing vertices in Topological order. 
    static int[] topoSort(int V, ArrayList<ArrayList<Integer>> adj) 
    {
        int[] indegree = new int[V];
        
        
        //find indegree of all nodes
        for(int i=0;i<V;i++){
            for(int it:adj.get(i))
                indegree[it]+=1;
        }
        
        int[] topo = getTopoSort(adj,indegree);
        return topo;
    }
    
    static int[] getTopoSort(ArrayList<ArrayList<Integer>> adj,int[] indegree){
        int[] topo = new int[indegree.length];
        
        Queue<Integer> pendingNodes = new LinkedList<>();
        for(int i=0;i<indegree.length;i++){
            if(indegree[i]==0)
                pendingNodes.add(i);
        }
        int index=0;
        while(!pendingNodes.isEmpty()){
            int head = pendingNodes.poll();
            topo[index++] = head;
            for(int it:adj.get(head)){
                indegree[it]--;
                if(indegree[it]==0)
                    pendingNodes.add(it);
            }
        }
        return topo;
    }
}