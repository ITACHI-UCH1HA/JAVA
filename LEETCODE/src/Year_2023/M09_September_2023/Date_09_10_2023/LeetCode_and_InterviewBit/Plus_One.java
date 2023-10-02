package Year_2023.M09_September_2023.Date_09_10_2023.LeetCode_and_InterviewBit;

import java.util.Arrays;

public class Plus_One {
    public static void main(String[] args) {
        int[] A={0,0,9};
        System.out.println(Arrays.toString(plusOne(A)));
    }
    public static int[] plusOne(int[] A) {
        if(A[0]==0 && A.length==1) {
            return new int[]{1};
        }
        int count=0;
        for (int i = 0; i < A.length; i++) {
            if(A[i]!=0){
                break;
            }
            count++;
        }
        if(count>0){
            int[] arr=new int[A.length-count];
            System.arraycopy(A,count,arr,0,A.length-count);
            A=arr;
        }
        if(A[A.length-1]<9) {
            A[A.length-1]++;
            return A;
        }
        int carry=1;
        for (int i = A.length-1; i >=0 ; i--) {
            int sum=carry+A[i];
            A[i]=sum%10;
            carry=sum/10;
        }
        if(carry==1){
            int[] ans=new int[A.length+1];
            ans[0]=1;
            System.arraycopy(A,0,ans,1,A.length);
            return ans;
        }
        return A;
    }
}
