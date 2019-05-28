package 栈和队列;

import java.util.Stack;

public class MyQueue {
    private Stack<Integer> in=new Stack<>();
    private Stack<Integer> out=new Stack<>();


    public void push(int a){
        in.push(a);
    }
    public int pop(){
        in2out();
        return out.pop();
    }
    public int peek(){
        in2out();
        return out.peek();
    }
    public void in2out(){
        if(out.isEmpty()){
            while(!in.isEmpty()){
                out.push(in.pop());
            }
        }
    }
    public boolean isEmpty(){
        return in.isEmpty()&&out.isEmpty();
    }
}
