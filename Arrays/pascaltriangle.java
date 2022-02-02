class Solution {
    public List<List<Integer>> generate(int n) {
        List<List<Integer>> ans= new ArrayList<>();
        if(n==0){
            return ans;
        }
        for(int i=0;i<n;i++){
            ans.add(new ArrayList<>());
            for(int j=0;j<=i;j++){
                if(j==0 || j==i){
                    ans.get(i).add(1);
                }
                else{
                    ans.get(i).add(ans.get(i-1).get(j-1)+ans.get(i-1).get(j));
                }
            }
        }
        return ans;
        
    }
}