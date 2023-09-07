package Date_09_06_2023;

import java.util.Arrays;

public class Plus_One {
    public static void main(String[] args) {
        int[] digits={9,9,9,8};
        System.out.println(Arrays.toString(plusOne(digits)));
    }
    public static int[] plusOne(int[] digits) {
        if(digits[digits.length-1]<9){
            digits[digits.length-1]++;
            return digits;
        }
        int carry=1;
        for (int i = digits.length-1; i >=0; i--) {
            int val=digits[i]+carry;
            digits[i]=(val)%10;
            carry=val/10;
        }
        if(carry==1){
            int arr[]=new int[digits.length+1];
            arr[0]=1;
            System.arraycopy(digits,0,arr,1,digits.length);
            return arr;
        }
        return digits;
    }
}
