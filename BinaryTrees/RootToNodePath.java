public class Solution {
    public ArrayList<Integer> solve(TreeNode root, int target) {
        ArrayList<Integer> ans= new ArrayList<>();
        helper(ans,root,target);
        return ans;
    }
    public boolean helper(ArrayList<Integer> ans,TreeNode root,int target){
        if(root==null){
            return false;
        }

        ans.add(root.val);//we put to the ans gambling and if really present it will get returend in next conditions
        if(root.val==target){
            // ans.add(0,root.val);
            return true;
        }

        if(helper(ans,root.left,target) || helper(ans,root.right,target)){
            // ans.add(0,root.val);
            return true;
        }

        //If the flow reaches here then the node is not definitely in the path so we remove it
        ans.remove(ans.size()-1);
        return false;
    }
}
