class Solution {
    public ListNode reverseList(ListNode head) {
        if(head==null || head.next==null){
            return head;
        }
        ListNode prev= null;
        ListNode temp=head.next;
        head.next=null;
        while(temp.next!=null){
            prev=head;
            head=temp;
            temp=temp.next;
            head.next=prev;
        }
        temp.next=head;
        return temp;
}
}