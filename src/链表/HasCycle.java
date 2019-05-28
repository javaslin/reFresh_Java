package 链表;

public class HasCycle {
    public boolean hasCycle(ListNode head){
        if(head==null||head.next==null){
            return false;
        }
        ListNode fast=head.next;
        ListNode slow=head;
        while(fast!=slow){
            if(fast==null||slow==null){
                return false;
            }
            fast=fast.next.next;
            slow=slow.next;
        }
        return true;
    }


}
