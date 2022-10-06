class Solution {
    public ListNode swapPairs(ListNode head) {
        if(head==null||head.next==null){
            return head;
        }
        ListNode newhead=head.next;
        ListNode curr=head;
        head=newhead.next;
        curr.next=null;
        newhead.next=curr;
        curr.next = swapPairs(head);
        return newhead;
    }
}
