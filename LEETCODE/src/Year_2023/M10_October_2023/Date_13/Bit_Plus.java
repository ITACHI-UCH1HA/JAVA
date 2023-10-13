package Year_2023.M10_October_2023.Date_13;

import java.util.Scanner;
public class Bit_Plus {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        int count=0;
        sc.nextLine();
        while(t>0){
            String s= sc.nextLine();
            switch (s.charAt(0)){
                case '-':--count;
                          break;
                case '+':++count;
                          break;
                case 'X':if(s.charAt(1)=='+'){
                             count++;
                         }else{
                             count--;
                         }
                         break;
            }
            t--;
        }
        System.out.println(count);
    }
}
