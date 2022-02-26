public class Solution 
{

	public static TreeNode<Integer> LCAinaBST(TreeNode<Integer> root, TreeNode<Integer> p, TreeNode<Integer> q) 
    {		
        if(root==null)
            return null;
        int curr= root.data;
        if(q.data<curr && p.data<curr)
            return LCAinaBST(root.left,p,q);
        
        if(q.data>curr && p.data>curr)
            return LCAinaBST(root.right,p,q);
        
        return root;
	}
}