class Solution{
    ArrayList<Integer> subsetSums(ArrayList<Integer> arr, int N){
        ArrayList<Integer> ans= new ArrayList<>();
        helper(arr,ans,0,0,N);
        Collections.sort(ans);
        return ans;
    }
    
    void helper(ArrayList<Integer> arr, ArrayList<Integer> ans, int index, int sum, int length){
        if(index==length){
            ans.add(sum);
            return;
        }

        //pick the element
        helper(arr, ans, index+1, sum+arr.get(index), length);

        //not pick the element
        helper(arr, ans, index+1, sum, length);
    }
}