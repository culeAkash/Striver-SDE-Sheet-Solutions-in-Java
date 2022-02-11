//Hashmap solution
class Solution {
    public int majorityElement(int[] nums) {
        if(nums.length==1){
            return nums[0];
        }   
        
        HashMap<Integer,Integer> map= new HashMap<>();
        int n=nums.length;
        for(int i=0;i<n;i++){
            if(map.containsKey(nums[i])){
                // map.replace(nums[i],map.get(nums[i])+1);
                int val= map.get(nums[i])+1;
                if(val>n/2){
                    return nums[i];
                }
                map.replace(nums[i],val);
                
            }
            else{
                map.put(nums[i],1);
            }
        }
        return -1;
    }
}


//Moore's Voting Algo Solution
public class Solution {
	public static int findMajority(int[] arr, int n) {
		int count=0;
        int max=0;
        for(int i=0;i<n;i++){
            if(count==0){
                max=arr[i];
            }
            if(max==arr[i]){
                count++;
            }
            else{
                count--;
            }
        }
        count=0;
        for(int i=0;i<n;i++){
            if(max==arr[i])
                count++;
        }
        if(count>n/2)
            return max;
        return -1;
	}
}