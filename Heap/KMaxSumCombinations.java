public class Solution{
	public static ArrayList<Integer> kMaxSumCombination(ArrayList<Integer> a, ArrayList<Integer> b, int n, int k){
		PriorityQueue<Integer> pq = new PriorityQueue<>();
        
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                pq.offer(a.get(i)+b.get(j));
                if(pq.size()>k)
                    pq.poll();
            }
        }
        
        ArrayList<Integer> ans = new ArrayList<>();
        while(!pq.isEmpty())
            ans.add(pq.poll());
        
        return ans;
	}
}