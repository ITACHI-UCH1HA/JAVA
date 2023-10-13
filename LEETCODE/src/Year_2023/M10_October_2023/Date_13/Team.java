package Year_2023.M10_October_2023.Date_13;

import java.util.Scanner;
public class Team {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        int count=0;
        while(t>0){
            int a= sc.nextInt();
            int b= sc.nextInt();
            int c= sc.nextInt();
            if((a&b)==1||(c&b)==1||(a&c)==1){
                count++;
            }
            t--;
        }
        System.out.println(count);
    }
}
