package Year_2023.M10_October_2023.Date_14;

import java.util.Scanner;

public class Erase_1D {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t>0){
            int n= sc.nextInt();
            int k= sc.nextInt();
            int count=0;
            sc.nextLine();
            String s=sc.nextLine();
            for (int i = 0; i <=n-k; i++) {
                if(s.charAt(i)=='W'){
                    continue;
                }
                if(i==n-k && s.substring(i,i+k).contains("B")){
                    count++;
                    continue;
                }
                if(s.substring(i,i+k).contains("B")){
                    count++;
                    if(i+k>n-k){
                        if(i==n-k && s.substring(i,i+k).contains("B")){
                            count++;
                            break;
                        }
                    }else{
                        i=i+k-1;
                    }
                }
            }
            System.out.println(count);
            t--;
        }
    }
}
