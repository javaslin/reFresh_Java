package 链表;

public class Deleteduplicates {
    public ListNode deleteDuplicates(ListNode head){
        if(head==null){
            return null;
        }
        if(head.next==null){
            return head;
        }
        ListNode node=head;
        while(node.next!=null){
            if (node.val == node.next.val) {
                node.next=node.next.next;
            }else {
                node=node.next;
            }
        }
        return head;
    }
}
