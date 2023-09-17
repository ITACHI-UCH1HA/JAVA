package Date_09_17_2023.NeetCode.Stack;

import java.util.Stack;

public class Valid_Parentheses {
    public static void main(String[] args) {
        String s="()[]{}";
        System.out.println(isValid(s));
    }
    public static boolean isValid(String s) {
        Stack<Character> stack=new Stack<>();
        for (Character c:s.toCharArray()) {
            if(c=='(' || c=='[' || c=='{' ){
                stack.push(c);
            }else{
                if(stack.isEmpty()){
                    return false;
                }
                char top=stack.pop();
                if(c==')' && top!='(' ||
                        c=='}'&& top!='{' ||
                        c==']' && top!='['
                ){
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }
}
