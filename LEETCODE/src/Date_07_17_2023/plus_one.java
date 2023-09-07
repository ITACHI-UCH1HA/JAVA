package Date_07_17_2023;

import java.util.Arrays;

//https://leetcode.com/problems/plus-one/description/
public class plus_one {
    public static void main(String[] args) {
        int[] digits={9};
        System.out.println(Arrays.toString(plus_one_int(digits)));
    }

    private static int[] plus_one_int(int[] digits) {
//        if(digits.length==1) return new int[]{1,0};
        int last_dig= digits.length-1;
        digits[last_dig]++;
        while(last_dig>0 && digits[last_dig]==10){
            digits[last_dig]=0;
            digits[last_dig-1]++;
            last_dig--;
        }
        if(digits[last_dig]==10){
            digits[last_dig]=0;
            int[] arr=new int[digits.length+1];
            arr[0]=1;
            for (int i = 1; i < arr.length; i++) {
                arr[i]=digits[i-1];
            }
            return arr;
        }
        return digits;
    }
}
