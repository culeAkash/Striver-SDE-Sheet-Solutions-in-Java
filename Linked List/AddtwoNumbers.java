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
    public ListNode addTwoNumbers(ListNode head1, ListNode head2) {
        if(head1==null){
            return head2;
        }
        if(head2==null){
            return head1;
        }
        
        ListNode newhead=null,newtail=null;
        int carry=0;
        while(head1!=null && head2!=null){
            int sum;
            sum=head1.val+head2.val+carry;
            carry=sum/10;
            sum=sum%10;
            
            ListNode newnode= new ListNode(sum);
            if(newhead==null){
                newhead=newnode;
                newtail=newnode;
            }
            else{
                newtail.next=newnode;
                newtail=newtail.next;
            }
            head1=head1.next;
            head2=head2.next;
        }
        
        while(head1!=null){
            int sum;
            sum=head1.val+carry;
            carry=sum/10;
            sum=sum%10;
            head1=head1.next;
            
            ListNode newnode= new ListNode(sum);
            newtail.next=newnode;
                newtail=newtail.next; 
        }
        
        while(head2!=null){
            int sum;
            sum=head2.val+carry;
            carry=sum/10;
            sum=sum%10;
            head2=head2.next;
            
            ListNode newnode= new ListNode(sum);
            newtail.next=newnode;
                newtail=newtail.next; 
        }
        
        if(carry!=0){
            ListNode newnode= new ListNode(carry);
            newtail.next=newnode;
                newtail=newtail.next;
        }
        
        return newhead;
    }
}