package Year_2023.M10_October_2023.Date_06;

import java.util.Stack;

public class ValidParentheses {
    public static void main(String[] args) {

    }
    public boolean isValid(String s) {
        if(s.length()%2!=0){
            return false;
        }

        Stack<Character> staack=new Stack<>();

        for (int i = 0; i < s.length(); i++) {
            char currChar=s.charAt(i);
            if("}])".contains(String.valueOf(currChar))){
                switch (currChar){
                    char prev= staack.pop();
                    case '}': if(prev!=currChar){
                                 return false;
                             }
                             break;
                    case ']':prev=staack.pop();
                             if(prev!=currChar){
                             return false;
                             }
                             break;
                    case ')':prev=staack.pop();
                             if(prev!=currChar){
                             return false;
                             }
                        break;
                }
            }else{
                staack.push(currChar);
            }
        }
        return staack.isEmpty();
    }
}
