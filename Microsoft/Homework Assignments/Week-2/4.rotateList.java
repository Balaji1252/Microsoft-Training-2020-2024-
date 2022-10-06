class Solution {
    public ListNode rotateRight(ListNode head, int k) {
        if(head==null){
            return head;
        }
        int len=1;
        ListNode temp=head;
        ListNode curr=head;
        ListNode newHead=null;
        while(temp.next!=null){
            temp=temp.next;
            len+=1;
        }
        if(k>len){
            k=k%len;
        }
        if(k==0 || k==len){
            return head;
        }
        int diff=len-k-1;
        while(curr.next!=null && diff!=0){
            curr=curr.next;
            diff-=1;
        }
        newHead=curr.next;
        curr.next=null;
        temp.next=head;
        return newHead;
    }
}