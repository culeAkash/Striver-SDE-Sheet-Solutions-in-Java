public class Solution {

    public  static int findCeil(TreeNode<Integer> node, int x) {

        int ceil=-1;
        while(node!=null){
            if(node.data==x){
                ceil=x;
                return ceil;
            }
            
            if(node.data<x){
                node=node.right;
            }
            else{
                ceil=node.data;
                node=node.left;
            }
        }
	return ceil;
    }
}