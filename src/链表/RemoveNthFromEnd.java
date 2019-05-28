package 链表;

public class RemoveNthFromEnd {
    public ListNode removeNthFromEnd(ListNode head,int n){
        ListNode fast=head;
        while (n-->0){
            fast=fast.next;
        }
        if(fast==null) return head;

        ListNode slow=head;

        while(fast.next!=null){
            fast=fast.next;
            slow=slow.next;
        }
        slow.next=slow.next.next;
        return head;
    }
}
