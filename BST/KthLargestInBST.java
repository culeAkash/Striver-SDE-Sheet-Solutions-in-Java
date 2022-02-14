class Solution
{
    // return the Kth largest element in the given BST rooted at 'root'
    public int kthLargest(Node root,int K)
    {
        int[] t= new int[1];
        t[0]=K;
        return helper(root,t).data;
    }
    
    public Node helper(Node root,int[] k){
        if(root==null)
        {
            return null;
        }
        Node right= helper(root.right,k);
        if(right!=null){
            return right;
        }
        k[0]--;
        if(k[0]==0)
            return root;
        
        return helper(root.left,k);
    }
    
    
}