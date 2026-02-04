package LeetCode.TopInterviewQuestions.Stack;

import java.util.Stack;

public class ValidParentheses {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();

        // iterate through each character in string
        for (char c: s.toCharArray()) {

            //if opening bracket, push to sthe stack
            if (c == '(' || c == '{' || c == '[') {
                stack.push(c);
            } else {
                if (stack.isEmpty()) { //checking edge case
                    return false;
                }
                char top = stack.pop(); //return the pushed bracket for matching
                //check for matching pair
                if ((c == ')' && top != '(') || (c == '}' && top != '{') || (c == ']' && top != '[')) {
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }

    public static void main(String[] args) {
        String s = "({[]})";
        //String s = "{]})(]";
        //String s = " ";

        ValidParentheses vp= new ValidParentheses();
        boolean result = vp.isValid(s);

        System.out.println(result);

    }
}
