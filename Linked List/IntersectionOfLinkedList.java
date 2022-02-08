public class Solution {

	public static int findIntersection(LinkedListNode<Integer> firstHead, LinkedListNode<Integer> secondHead) {
		if(firstHead==null || secondHead==null)
            return -1;
        
        LinkedListNode<Integer> temp1= firstHead;
        LinkedListNode<Integer> temp2= secondHead;
        
        while(temp1!=temp2){
            temp1=temp1==null ? secondHead : temp1.next;
            temp2=temp2==null ? firstHead : temp2.next;
        }
        return temp1==null ? -1 : temp1.data;
        
	}
}