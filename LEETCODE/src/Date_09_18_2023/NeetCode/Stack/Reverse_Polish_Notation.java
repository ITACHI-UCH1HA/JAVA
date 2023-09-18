package Date_09_18_2023.NeetCode.Stack;

import java.util.Stack;

public class Reverse_Polish_Notation {
    public static void main(String[] args) {
        String[] tokens={"2","1","+","3","*"};
        System.out.println(evalRPN(tokens));
    }
    public static   int evalRPN(String[] tokens) {
        Stack<Integer> stack=new Stack<>();
        for (int i = 0; i < tokens.length; i++) {
            if("+/*-".contains(tokens[i])){
                int p=stack.pop();
                int q=stack.pop();
                switch (tokens[i]){
                    case "+":stack.push(p+q);
                              break;
                    case "-":stack.push(p-q);
                              break;
                    case "/":stack.push(p/q);
                              break;
                    case "*":stack.push(p*q);
                              break;
                }
            }else {
                stack.push(Integer.parseInt(tokens[i]));
            }
        }
        return stack.pop();
    }
}
