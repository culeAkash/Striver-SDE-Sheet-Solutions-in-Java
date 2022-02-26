class BSTIterator {

    Stack<TreeNode> st= new Stack<>();
    public BSTIterator(TreeNode root) {
        
        pushAll(root);
    }
    
    private void pushAll(TreeNode node){
        while(node!=null){
            st.push(node);
            node=node.left;
        }
    }
    
    public int next() {
        TreeNode top= st.pop();
        pushAll(top.right);
        return top.val;
    }
    
    public boolean hasNext() {
        return !st.empty();
    }
}