package Date_09_22_2023.LeetCode;

import java.util.HashMap;
import java.util.Map;

public class Roman_To_Integer {
    public static void main(String[] args) {
        String s="IX";
        System.out.println(romanToInt_III(s));
    }

//    Symbol       Value
//    I             1
//    V             5
//    X             10
//    L             50
//    C             100
//    D             500
//    M             1000

    public static int romanToInt(String s) {
        int num=0;
        char[] c=s.toCharArray();
        for (int i = 0; i < c.length; i++) {
            switch (c[i]){
                case 'I':
                    if(i!= c.length-1 && (c[i+1]=='V' ||c[i+1]=='X') ){
                        num+=-1;
                    }else{
                        num+=1;
                    }
                    break;
                case 'V':
                    num+=5;
                    break;
                case 'X':
                    if(i!= c.length-1 && (c[i+1]=='L' ||c[i+1]=='C') ){
                        num+=-10;
                    }else{
                        num+=10;
                    }
                    break;
                case 'L':
                    num+=50;
                    break;
                case 'C':
                    if(i!= c.length-1 && (c[i+1]=='D' ||c[i+1]=='M') ){
                        num+=-100;
                    }else{
                        num+=100;
                    }
                    break;
                case 'D':
                    num+=500;
                    break;
                case 'M':
                    num+=1000;
                    break;
            }
        }
        return num;
    }
    private static int romanToInt_II(String s) {
        Map<Character,Integer> map=new HashMap<>();
        map.put('I',1);
        map.put('V',5);
        map.put('X',10);
        map.put('L',50);
        map.put('C',100);
        map.put('D',500);
        map.put('M',1000);

        int result=0;

        for (int i = 0; i < s.length(); i++) {
            char currCharacter=s.charAt(i);
            int currvalue= map.get(currCharacter);
            if(i<s.length()-1){
                char nextChar=s.charAt(i+1);
                int nextvalue=map.get(nextChar);
                if(currvalue<nextvalue){
                    result-=currvalue;
                }else{
                    result+=currvalue;
                }
            }
            else{
                result+=currvalue;
            }
        }
        return result;
    }
    private static int romanToInt_III(String s) {
        int[] values=new int[s.length()];
        int result=0;
        for (int i = 0; i < s.length(); i++) {
            switch (s.charAt(i)){
                case 'M':
                    values[i]=1000;
                    break;
                case 'D':
                    values[i]=500;
                    break;
                case 'C':
                    values[i]=100;
                    break;
                case 'L':
                    values[i]=50;
                    break;
                case 'X':
                    values[i]=10;
                    break;
                case 'V':
                    values[i]=5;
                    break;
                case 'I':
                    values[i]=1;
                    break;
            }
        }
        for (int i = 0; i < values.length-1; i++) {
            if(values[i]<values[i+1]){
                result-=values[i];
            }else{
                result+=values[i];
            }
        }
        return result+values[values.length-1];
    }
}
