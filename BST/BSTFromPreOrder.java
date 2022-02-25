public class Solution {
 
    
	public static TreeNode<Integer> preOrderTree(int[] pre) {
        if(pre.length==0)
            return null;
 		return helper(pre,Integer.MAX_VALUE,new int[]{0});
	}
    
    public static TreeNode<Integer> helper(int[] pre,int bound,int i[]){
        if(i[0]==pre.length || pre[i[0]]>bound)
            return null;
        
        TreeNode<Integer> root= new TreeNode<>(pre[i[0]++]);
        root.left= helper(pre,root.data,i);
        root.right= helper(pre,bound,i);
        return root;
    }

}
