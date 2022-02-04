/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        if(head==null){
            return head;
        }
        
        ListNode temp=head;
        ListNode curr=head;
        ListNode prev=null;
        
        while(n>0 && temp!=null){
            temp=temp.next;
            n--;
        }
        
        while(temp!=null){
            if(curr==head)
                prev=head;
            else
                prev=curr;
            curr=curr.next;
            temp=temp.next;
        }
        
        if(curr==head)
            return head.next;
        prev.next=curr.next;
        return head;
    }
}