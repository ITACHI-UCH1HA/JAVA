package Date_08_29_2023;

import java.util.Stack;

public class valid_parenthesis {
    public static boolean isValid(String s) {
        Stack<Character> staack=new Stack<>();
        for (char c:s.toCharArray()) {
            if(c == '(' || c == '[' || c == '{'){
                staack.push(c);
            }
            else{
                if(staack.isEmpty()) return false;
                char top=staack.pop();
                if((c == ')' && top != '(') || (c == ']' && top != '[') || (c == '}' && top != '{')){
                    return false;
                }
            }
        }
        return staack.isEmpty();
    }
    public static void main(String[] args) {
        String s="(]";
        Stack<Character> set=new Stack<>();
        set.push('a');
        set.push('b');
        set.push('c');
        System.out.println(set.pop()=='c');
        System.out.println(set.pop());
    }
}
