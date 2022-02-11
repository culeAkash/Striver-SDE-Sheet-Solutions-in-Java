class Solution {
    public List<Integer> majorityElement(int[] nums) {
        List<Integer> ans= new ArrayList<>();
        int n=nums.length;
        if(nums.length==0){
            return ans;
        }
        if(nums.length==1)
        {
            ans.add(nums[0]);
            return ans;
        }
        
        int num1=Integer.MIN_VALUE;
        int num2=Integer.MIN_VALUE;
        int c1=0;
        int c2=0;
        
        for(int num:nums){
            if(num==num1){
                c1++;
            }
            else if(num==num2)
                c2++;
            else if(c1==0){
               num1=num;
                c1=1;  
            }
            else if(c2==0){
                num2=num;
                c2=1;
            }
            else{
                c1--;
                c2--;
            }
               
        }
        c1=0;
        c2=0;
        for(int num:nums){
            if(num==num1)
                c1++;
            if(num==num2)
                c2++;
        }
        
        if(c1>n/3)
            ans.add(num1);
        if(c2>n/3)
            ans.add(num2);
        return ans;
        
        
    }
}