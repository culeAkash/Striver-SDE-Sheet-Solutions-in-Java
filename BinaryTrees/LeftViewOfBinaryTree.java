//User function Template for Java

/* A Binary Tree node
class Node
{
    int data;
    Node left, right;

    Node(int item)
    {
        data = item;
        left = right = null;
    }
}*/
class Tree
{
    //Function to return list containing elements of left view of binary tree.
    ArrayList<Integer> leftView(Node root)
    {
      // Your code here
      ArrayList<Integer> ans= new ArrayList<>();
        helper(root,0,ans);
        return ans;
    }
    
    public void helper(Node root,int level,ArrayList<Integer> ans){
        //if root is null
        if(root==null){
            return;
        }
        
        //If the ans is of same length of the level insert the node
        if(ans.size()==level){
            ans.add(root.data);
        }
        
        //As we are finding left view we move to left then right
        helper(root.left,level+1,ans);
        helper(root.right,level+1,ans);
    }
}