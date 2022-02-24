class Solution {
    public boolean findTarget(TreeNode root, int k) {
        if(root==null)
            return false;
        
        ArrayList<Integer> nodes= new ArrayList<>();
        getSortedArr(root,nodes);
        
        int length= nodes.size();
        
        int i=0,j=length-1;
        
        while(i<j){
            int sum= nodes.get(i)+nodes.get(j);
            
            if(sum==k)
                return true;
            else if(sum>k){
                j--;
            }
            else{
                i++;
            }
        }
        return false;
        
        
    }
    
    public void getSortedArr(TreeNode root,ArrayList<Integer> nodes){
        if(root==null)
            return;
        
        getSortedArr(root.left,nodes);
        nodes.add(root.val);
        getSortedArr(root.right,nodes);
    }
}