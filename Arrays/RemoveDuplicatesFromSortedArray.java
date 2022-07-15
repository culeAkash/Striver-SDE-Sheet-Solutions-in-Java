class Solution {
    public int removeDuplicates(int[] nums) {
        int i = 0,j = i+1;
        int k = 1;
        
        while(j<nums.length){
            while(j<nums.length && nums[j]==nums[i])
                j++;
            if(j==nums.length)
                return k;
            k++;
            nums[i+1] = nums[j];
            i++;
            j++;
        }
        return k;
    }
}