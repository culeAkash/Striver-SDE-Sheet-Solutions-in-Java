//HashMap method

public class Solution {
    public ListNode detectCycle(ListNode head) {
        if(head==null)
            return head;
        
        HashMap<ListNode,Boolean> map= new HashMap<>();
        
        while(head!=null)
        {
            if(map.containsKey(head))
                return head;
            map.put(head,true);
            head=head.next;
        }
        return null;
    }
}

//Linked List cycle method using slow and fast pointers

public class Solution 
{
    public static Node firstNode(Node head) 
    {
        if(head==null)
            return null;
        
        Node fast= head;
        Node slow=head;
        int flag=0;
        
        while(fast!=null && fast.next!=null){
            fast=fast.next.next;
            slow=slow.next;
            
            if(fast==slow){
                flag=1;
                break;
            }
        }
        if(flag==1){
            fast=head;
            while(fast!=slow){
                fast=fast.next;
                slow=slow.next;
            }
            return fast;
        }
        return null;
    }
}