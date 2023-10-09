package Year_2023.Month_10.Date_09;
import java.util.Scanner;
public class Restoring_Three_Numbers {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

//        int a= sc.nextInt();
//        int b= sc.nextInt();
//        int c= sc.nextInt();
//        int d= sc.nextInt();
//
//        int max=Math.max(a,Math.max(b,Math.max(c,d)));
//        a=max-a;
//        b=max-b;
//        c=max-c;
//        d=max-d;
//
//        if(a!=0){
//            System.out.println(a+" ");
//        }
//        if(b!=0){
//            System.out.println(a+" ");
//        }
//        if(c!=0){
//            System.out.println(a+" ");
//        }
//        if(d!=0){
//            System.out.println(a+" ");
//        }

        int[] nums=new int[4];
        int max=-1;
        for (int i = 0; i < 4; i++) {
            nums[i]= sc.nextInt();
            if(nums[i]>max){
                max=nums[i];
            }
        }
        for (int num:nums) {
            int a=max-num;
            if(a!=0){
                System.out.print(a+" ");
            }
        }
    }
}
