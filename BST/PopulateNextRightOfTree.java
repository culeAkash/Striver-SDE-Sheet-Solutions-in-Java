class Solution {
    public Node connect(Node root) {
        if(root==null)
            return root;
        
        Queue<Node> q= new LinkedList<>();
        q.add(root);
        while(!q.isEmpty()){
            int size=q.size();
            while(size>0){
                Node front= q.poll();
                if(size!=1){
                    front.next=q.peek();
                }
                if(front.left!=null){
                    q.add(front.left);
                }
                if(front.right!=null){
                    q.add(front.right);
                }
                size--;
            }
        }
        return root;
    }
}