package Year_2023.M08_August_2023.Date_08_29_2023;

import java.util.Stack;

public class Reverse_Polish_Notation {
    public static int evalRPN(String[] tokens) {
        Stack<Integer> stack=new Stack<>();
        for (String s:tokens) {
            if(s.length()==1 && "*+/-".contains(s)){
                int p= stack.pop();
                int q= stack.pop();
                switch (s.charAt(0)) {
                    case '+' -> stack.push(p + q);
                    case '-' -> stack.push(p - q);
                    case '*' -> stack.push(p * q);
                    case '/' -> stack.push(p / q);
                }
            }
            else{
                stack.push(Integer.parseInt(s));
            }
        }
        return stack.pop();
    }
    public static void main(String[] args) {
        String[] tokens = {"2","1","+","3","*"};
        System.out.println(evalRPN(tokens));
    }
}
