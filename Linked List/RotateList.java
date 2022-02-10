//Not best approach
class Solution {
    public ListNode rotateRight(ListNode head, int k) {
        if(head==null || head.next==null)
            return head;
        int count=0;
        ListNode t= head;
        while(t!=null){
            count++;
            t=t.next;
        }
        k=k%count;
        
        while(k>0){
            ListNode temp= deleteFromEnd(head);
            temp.next=head;
            head=temp;
            k--;
        }
        return head;
    }
    
    ListNode deleteFromEnd(ListNode head){
        if(head==null || head.next==null)
            return null;
        
        ListNode prev=null;
        
        while(head.next!=null){
            prev=head;
            head=head.next;
        }
        prev.next=null;
        return head;
    }
}

//Optimal

public class Solution {
    public static Node rotate(Node head, int k) {
        if(head==null || head.next==null)
            return head;
        
        int count=0;
        Node t= head;
        while(t!=null){
            count++;
            t=t.next;
        }
        
        k=k%count;
        
        Node fast=head,slow=null;
        while(k>0){
            fast=fast.next;
            k--;
        }
        
        slow=head;
        while(fast.next!=null){
            slow=slow.next;
            fast=fast.next;
        }
        
        fast.next=head;
        head=slow.next;
        slow.next=null;
        return head;
    }
}