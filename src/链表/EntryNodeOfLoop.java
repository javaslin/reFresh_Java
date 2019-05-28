package 链表;

public class EntryNodeOfLoop {
    public ListNode entryNodeOfLoop(ListNode pHead){
        if(pHead==null || pHead.next==null){
            return null;
        }

        ListNode slow=pHead,fast=pHead;
        do {
            slow=slow.next;
            fast=fast.next.next;
        }while (slow!=fast);

        fast=pHead;
        while (slow!=fast){
            slow=slow.next;
            fast=fast.next;
        }

        return slow;
    }
}
