
import java.util.ArrayList;

public class Solution {
	public static ArrayList<Integer> predecessorSuccessor(BinaryTreeNode<Integer> root, int key) {
		BinaryTreeNode<Integer> s=null;
        BinaryTreeNode<Integer> p=null;
        
        BinaryTreeNode<Integer> node=root;
        
        while(node!=null){
            if(node.data<=key)
                node=node.right;
            else if(node.data>key){
                s=node;
                node=node.left;
            }
        }
        
        node=root;
        while(node!=null){
            if(node.data>=key)
                node=node.left;
            else if(node.data<key){
                p=node;
                node=node.right;
            }
        }
        
        ArrayList<Integer> ans= new ArrayList<>();
        if(p!=null)
            ans.add(p.data);
        else
            ans.add(-1);
        
        if(s!=null)
            ans.add(s.data);
        else
            ans.add(-1);
        
        return ans;
        
	}
}