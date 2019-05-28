package 链表;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class PrintListFromTailToHead {


    public ArrayList<Integer> printListFromTailToHead(ListNode head){
        if(head==null) return null;

        ArrayList<Integer> res=new ArrayList<>();

        Stack<Integer> stack=new Stack<>();

        while(head!=null){
            stack.add(head.val);
            head=head.next;
        }

        while(!stack.isEmpty()){
            res.add(stack.pop());
        }
        return res;
    }
}
