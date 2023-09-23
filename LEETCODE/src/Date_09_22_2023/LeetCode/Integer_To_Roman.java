package Date_09_22_2023.LeetCode;

import java.util.HashMap;
import java.util.Map;

public class Integer_To_Roman {
    public static void main(String[] args) {
        int num=1994;
        System.out.println(intToRoman(num));
    }

    private static String intToRoman(int num) {

        String[] symbols={"M","CM","D","CD","C","XC","L","XL","X","IX","V","IV","I"};
        int[] values={1000,900,500,400,100,90,50,40,10,9,5,4,1};

        StringBuilder result=new StringBuilder();

        for (int i = 0; i < values.length; i++) {
            while (num>=values[i]){
                result.append(symbols[i]);
                num-=values[i];
            }
        }
        return result.toString();
    }
//    public static String intToRoman(int num) {
//        Map<Integer,Character> map=new HashMap<>();
//        map.put(1,'I');
//        map.put(5,'V');
//        map.put(10,'X');
//        map.put(50,'L');
//        map.put(100,'C');
//        map.put(500,'D');
//        map.put(1000,'M');
//
//        String result="";
//        int[] values=new int[(int)Math.log10(num)+1];
//        while(num!=0){
//            int digit=0;
//            switch (num) {
//                case num > 1000:
//                    digit=num/1000;
//                    while(digit!=0){
//                        result+="M";
//                    }
//                    break;
//                case num>500:
//                    digit=num/500;
//
//                    break;
//                case 'C':
//                    values[i] = 100;
//                    break;
//                case 'L':
//                    values[i] = 50;
//                    break;
//                case 'X':
//                    values[i] = 10;
//                    break;
//                case 'V':
//                    values[i] = 5;
//                    break;
//                case 'I':
//                    values[i] = 1;
//                    break;
//            }
//        }
//
//        return result;
//    }
}
