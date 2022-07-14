class Solution
{
    //Function to find the shortest distance of all the vertices
    //from the source vertex S.
    static int[] dijkstra(int V, ArrayList<ArrayList<ArrayList<Integer>>> adj, int S)
    {
        int[] distance = new int[V];
        boolean[] visited = new boolean[V];
        
        Arrays.fill(distance,Integer.MAX_VALUE);
        distance[S] = 0;
        
        PriorityQueue<Pair> pq = new PriorityQueue<>(new Comp());
        
        pq.offer(new Pair(S,0));
        
        while(!pq.isEmpty()){
            Pair top = pq.poll();
            visited[top.node] = true;
            
            ArrayList<ArrayList<Integer>> adjList = adj.get(top.node);
            for(ArrayList<Integer> adjLink: adjList){
                if(!visited[adjLink.get(0)]){
                    if(distance[adjLink.get(0)] > distance[top.node] + adjLink.get(1)){
                        distance[adjLink.get(0)] = distance[top.node] + adjLink.get(1);
                        pq.offer(new Pair(adjLink.get(0),distance[adjLink.get(0)]));
                    }
                }
            }
        }
        return distance;
    }
}


class Comp implements Comparator<Pair>{
    public int compare(Pair p1,Pair p2){
        return p1.d-p2.d;}
}

class Pair{
    int node;
    int d;
    
    public Pair(int n,int d){
        node = n;
        this.d = d;
    }
}