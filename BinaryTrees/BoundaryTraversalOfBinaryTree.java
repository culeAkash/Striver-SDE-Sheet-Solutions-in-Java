// class Node  
// { 
//     int data; 
//     Node left, right; 
   
//     public Node(int d)  
//     { 
//         data = d; 
//         left = right = null; 
//     } 
// }

class Solution
{
	ArrayList <Integer> boundary(Node node)
	{
	    ArrayList < Integer > ans = new ArrayList <Integer>();
        if (!isLeaf(node)) 
        ans.add(node.data);
        addLeftBoundary(node, ans);
        addLeaves(node, ans);
        addRightBoundary(node, ans);
        return ans;
	    
	}
	
	 Boolean isLeaf(Node root) {
        return (root.left == null) && (root.right == null);
    }

     void addLeftBoundary(Node root, ArrayList < Integer > res) {
        Node cur = root.left;
        while (cur != null) {
            if (!isLeaf(cur)) 
            res.add(cur.data);
            if (cur.left != null) 
            cur = cur.left;
            else cur = cur.right;
        }
    }
     void addRightBoundary(Node root, ArrayList < Integer > res) {
        Node cur = root.right;
        Stack<Integer> st= new Stack<>();
        while (cur != null) {
            if (!isLeaf(cur)) 
            st.push(cur.data);
            if (cur.right != null) 
            cur = cur.right;
            else cur = cur.left;
        }
        while (!st.isEmpty()) {
            res.add(st.pop());
        }
    }

     void addLeaves(Node root, ArrayList < Integer > res) {
        if (isLeaf(root)) {
            res.add(root.data);
            return;
        }
        if (root.left != null)
        addLeaves(root.left, res);
        if (root.right != null) 
        addLeaves(root.right, res);
    }
}
