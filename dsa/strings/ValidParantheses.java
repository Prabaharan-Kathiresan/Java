import java.io.*;
import java.util.*;
public class ValidParantheses {

    public static void main(String args[]) {
        String input1 = "(())";
        System.out.println("Valid Parentheses="+validParantheses(input1));
        String input2 = "(([))";
        System.out.println("Valid Parentheses="+validParantheses(input2));

    }

    public static boolean validParantheses(String s) {
        Stack<Character> stack = new Stack<>();  
        int pos=0;
        while(pos<s.length()) {
            if(s.charAt(pos)=='(' || s.charAt(pos)=='[') {
                stack.push(s.charAt(pos));
            } else if(s.charAt(pos)==')' && stack.peek()=='(') {
                stack.pop();
            } else if(s.charAt(pos)==']' && stack.peek()=='[') {
                stack.pop();
            } 
            pos++;
        }
        return stack.isEmpty();
    }
}