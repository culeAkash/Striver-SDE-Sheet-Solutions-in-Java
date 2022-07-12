class Solution
{
    //Function to return list containing vertices in Topological order. 
    static int[] topoSort(int V, ArrayList<ArrayList<Integer>> adj) 
    {
        Stack<Integer> stack = new Stack<>();
        boolean[] visited = new boolean[V];
        
        int[] ans = new int[V];
        
        for(int i=0;i<V;i++){
            if(!visited[i])
                helper(adj,stack,visited,i);
        }
        
        int i=0;
        while(!stack.empty())
        ans[i++] = stack.pop();
        
        return ans;
    }
    
    static void helper(ArrayList<ArrayList<Integer>> adj,Stack<Integer> stack,boolean[] visited,int node){
        visited[node] = true;
        
        for(int i:adj.get(node)){
            if(!visited[i])
                helper(adj,stack,visited,i);
        }
        stack.push(node);//first child nodes are added then parent
    }
}
