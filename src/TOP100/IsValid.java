package TOP100;

import java.util.Stack;

public class IsValid {
    public boolean isValid(String s) {
        Stack<Character> stack=new Stack<>();
        for (char c:
             s.toCharArray()) {
            if(c=='('||c=='{'||c=='['){
                stack.push(c);
            }else {
                if (stack.isEmpty()) {
                    return false;
                }
                char cStack=stack.pop();
                boolean a=c==')'&&cStack!='(';
                boolean b=c=='}'&&cStack!='{';
                boolean v=c==']'&&cStack!='[';
                if(a||b||v){
                    return false;
                }
            }
        }
        return stack.isEmpty();

    }
}
