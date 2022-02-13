public class Solution {

    public static int floorInBST(TreeNode<Integer> root, int x) {
        int floor=-1;
        while(root!=null){
            if(root.data==x){
                return x;
            }
            
            if(root.data>x){
                root=root.left;
            }
            else{
                floor=root.data;
                root=root.right;
            }
        }
        return floor;
    }
}