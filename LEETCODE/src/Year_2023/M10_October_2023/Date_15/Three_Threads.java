package Year_2023.M10_October_2023.Date_15;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Three_Threads {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();
        sc.nextLine();

        while (t > 0) {

            int a= sc.nextInt();
            int b= sc.nextInt();
            int c= sc.nextInt();

            List<Integer> list = new ArrayList<>();

            list.add(a);
            list.add(b);
            list.add(c);

            int min = Math.min(a,Math.min(b,c));

//            for (int i = 0; i < 3; i++) {
//                list.add(sc.nextInt());
//                if (list.get(i) < min) {
//                    min = list.get(i);
//                }
//            }

            for (int i = 0; i < 3; i++) {
                while(!list.isEmpty()){
                    if (list.get(0) == min) {
                        list.remove(0);
                    } else {
                        list.set(0, list.get(0) - min);
                        break;
                    }
                }
            }
//            if (list.get(i) == min) {
//                list.remove(i);
//            } else {
//                list.set(i, list.get(i) - min);
//            }
            boolean checked=check(list,min);
            if(checked){
                System.out.println("YES");
            }else{
                System.out.println("NO");
            }
            t--;
        }
    }
    public static boolean check(List<Integer> list,int min){
        for (int i = 0; i < list.size(); i++) {
            if(list.get(i)!=min){
                return false;
            }
        }
        return true;
    }
}
