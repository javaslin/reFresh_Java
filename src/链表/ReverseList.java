package 链表;

public class ReverseList {


    public ListNode reverseList(ListNode listNode){
        if (listNode == null || listNode.next == null) {
            return listNode;
        }
        ListNode next=listNode.next;
        listNode.next=null;
        ListNode newHead=reverseList(next);
        next.next=listNode;
        return newHead;
    }
}
