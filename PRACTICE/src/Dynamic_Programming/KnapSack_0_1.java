package Dynamic_Programming;

import java.lang.reflect.Array;
import java.util.Arrays;

public class KnapSack_0_1 {
    public static void main(String[] args) {
        int n=3;
        int w=4;
        int[] values={1,2,3};
        int[] weight={4,5,1};
        System.out.println(knapSack(w,weight,values,n));
    }
    public static int knapSack(int W, int wt[], int val[], int n)
    {
        int sum=0;
        int[] pf=new int[n];
        for (int i = 0; i < n; i++) {
            pf[i]=val[i]/wt[i];
        }
        for (int i = 0; i < pf.length-1; i++) {
            int maxIndex=i;
            for (int j = i+1; j < pf.length; j++) {
                if(pf[j]>pf[maxIndex]){
                    maxIndex=j;
                }
            }
            int temp=pf[maxIndex];
            pf[maxIndex]=pf[i];
            pf[i]=temp;
            
            temp=wt[maxIndex];
            wt[maxIndex]=wt[i];
            wt[i]=temp;

            temp=val[maxIndex];
            val[maxIndex]=val[i];
            val[i]=temp;
        }
//        for (int i = 0; i < 3; i++) {
//            System.out.println(pf[i]);
//        }
        int index = 0;
        while(W-wt[index]>=0 && index < n){
            sum+=val[index];
            W-= wt[index];
            index++;
        }
        return sum;
    }
}
