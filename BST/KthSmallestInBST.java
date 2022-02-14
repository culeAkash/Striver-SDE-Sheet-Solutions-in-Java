class Solution {
    public int kthSmallest(TreeNode root, int k) {
        int[] t= new int[1];
        t[0]=k;
        return helper(root,t).val;
    }
    
    public TreeNode helper(TreeNode root,int[] k){
        if(root==null)
        {
            return null;
        }
        TreeNode left= helper(root.left,k);
        if(left!=null){
            return left;
        }
        k[0]--;
        if(k[0]==0)
            return root;
        
        return helper(root.right,k);
    }
}