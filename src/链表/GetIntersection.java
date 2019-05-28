package 链表;

class ListNode{
    int val;
    ListNode next;
    ListNode(int x){
        val=x;
        next=null;
    }
}
public class GetIntersection {
    public static ListNode getIntersection(ListNode headA,ListNode headB){
        ListNode list1=headA,list2=headB;
        while(list1!=list2){
            list1=(list1==null)?headB:list1.next;
            list2=(list2==null)?headA:list2.next;
        }
        return list1;

    }
}
