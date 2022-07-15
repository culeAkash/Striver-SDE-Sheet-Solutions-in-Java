class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
       List<List<Integer>> ans = new ArrayList<>();
        
        Arrays.sort(nums);
        
        for(int i=0;i<nums.length-2;i++){
            if(i==0 || nums[i]!=nums[i-1]){
                int low = i+1,
                high = nums.length-1,
                target = 0 - nums[i];
                
                while(low<high){
                    if(nums[low]+nums[high]==target){
                        List<Integer> sm = new ArrayList<>();
                        sm.add(nums[i]);
                        sm.add(nums[low]);
                        sm.add(nums[high]);
                        ans.add(sm);
                        
                        //Ignore duplicates
                        while(low<high && nums[low]==nums[low+1])low++;
                        while(low<high && nums[high]==nums[high-1])high--;
                        
                        low++;
                        high--;
                    }
                    else if(nums[low]+nums[high]<target)
                        low++;
                    else
                        high--;
                }
            }
            
        }
        return ans;
    }
}