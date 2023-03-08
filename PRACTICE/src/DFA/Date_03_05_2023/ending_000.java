package DFA.Date_03_05_2023;

import java.util.Scanner;

public class ending_000 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        String var=input.next();
        char state='A';
        for (int i = 0; i < arr.length; i++) {
            switch (state){
                case 'A':
                    if(arr[i]=='0'){
                        state='B';
                    }else{
                        state='A';
                    }
                case 'B':
                    if(arr[i]==0){
                        state='C';
                    }else{
                        state='A';
                    }
                case 'C':
                    if(arr[i]=='0'){
                        state='D';
                    }else{
                        state='A';
                    }
                case 'D':
                    if(arr[i]=='0'){
                        state='D';
                    }else{
                        state='A';
                    }
            }
        }
        if(state=='D'){
            System.out.println("accepted");
        }else System.out.println("rejected");
    }
}
