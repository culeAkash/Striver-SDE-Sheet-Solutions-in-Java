//Hashing Solution

public class Solution {
    public boolean hasCycle(ListNode head) {
        if(head==null)
            return false;
        
        HashMap<ListNode,Boolean> map= new HashMap<>();
        
        while(head!=null){
            if(map.containsKey(head))
                return true;
            map.put(head,true);
            head=head.next;
        }
        return false;
    }
}

//Linked List Cycle Detection using fast and slow pointers

public class Solution {
    
    public static boolean detectCycle(Node<Integer> head) {
        if(head==null)
            return false;
        
        Node<Integer> fast=head,slow=head;
        
        while(fast!=null && fast.next!=null){
            fast=fast.next.next;
            slow=slow.next;
            
            if(fast==slow)
                return true;
        }
        return false;
    }
}