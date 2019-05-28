package 链表;

public class SortList {

    public ListNode sortList(ListNode head){
        return mergeSort(head);
    }

    private ListNode mergeSort(ListNode head){
        if(head==null || head.next==null) return head;
        ListNode slow=head,fast=head,breakNode=head;
        while (fast!=null && fast.next!=null){
            breakNode=slow;
            slow=slow.next;
            fast=fast.next.next;
        }
        breakNode.next=null;

        ListNode l=mergeSort(head);
        ListNode r=mergeSort(slow);
        return merge(l,r);


    }
    private ListNode merge(ListNode l1,ListNode l2){
        if (l1 == null || l2 == null) {
            return l1==null?l2:l1;
        }
        if (l1.val < l2.val) {
            l1.next=merge(l1.next,l2);
            return l1;
        }else {
            l2.next=merge(l1,l2.next);
            return l2;
        }

    }
}
