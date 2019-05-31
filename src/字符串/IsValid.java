package 字符串;

import java.util.Stack;

public class IsValid {
    public boolean isValid(String str) {
        if (str.length() == 1 || str == null) {
            return false;
        }
        Stack<Character> stack = new Stack<>();
        for (char c : str.toCharArray()) {
            if (c == '(' || c == '{' || c == '[') {
                stack.push(c);
            } else {
                if (stack.isEmpty()) {
                    return false;
                }
                char c1 = stack.pop();
                boolean b1 = c == '}' && c1 != '{';
                boolean b2 = c == ']' && c1 != '[';
                boolean b3 = c == ')' && c1 != '(';
                if (b1 || b2 || b3) {
                    return false;
                }
            }
        }
        return stack.isEmpty();

    }
}
