    public int[] twoSum(int[] nums, int target) {
        int[] ans= new int[2];
        if(nums.length==0){
            return ans;
        }
        for(int i=0;i<nums.length;i++){
            int t= target-nums[i];
            for(int j=i+1;j<nums.length;j++){
                if(t-nums[j]==0){
                    ans[0]=i;
                    ans[1]=j;
                    break;
                }
            }
        }
        return ans;
    }
}