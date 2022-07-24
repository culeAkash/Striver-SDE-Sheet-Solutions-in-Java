class GfG
{
    int maxLen(int arr[], int n)
    {
        Map<Integer,Integer> map = new HashMap<>();
        int sum = 0;
        int max = 0;
        for(int i=0;i<n;i++){
            sum+= arr[i];
            
            if(sum==0)//array upto that point sums to zero
                max = Math.max(max,i+1);
                
            if(map.containsKey(sum)){//sum between indices where sum is same is zero
                max = Math.max(max,i-map.get(sum));
            }
            else{
                map.put(sum,i);
            }
        }
        
        return max;
    }
}