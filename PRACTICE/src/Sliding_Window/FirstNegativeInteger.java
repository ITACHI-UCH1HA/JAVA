package Sliding_Window;

import java.util.*;

public class FirstNegativeInteger {
    public static void main(String[] args) {
        long[] A={-8, 2, 3, -6, 10};
        System.out.println(Arrays.toString(printFirstNegativeInteger(A,A.length,2)));
    }
    public static long[] printFirstNegativeInteger(long A[], int N, int K)
    {
        long[] result=new long[N-K+1];
        Deque<Integer> deque=new ArrayDeque<>();
        int resultIndex=0;

//        process the first window
        int i=0;
        for (; i < K; i++) {
            if(A[i]<0){
                deque.addLast(i);
            }
        }
//        traverse the second window
        for(; i< N; i++){
            if(!deque.isEmpty()){
                result[resultIndex++]=A[deque.peekFirst()];
            }else{
                result[resultIndex++]=0;
            }

            while (!deque.isEmpty() && deque.peekFirst()<=(i-K)){
                deque.removeFirst();
            }
            if(A[i]<0){
                deque.addLast(i);
            }
        }
//        store the last element of deque in result
        if(!deque.isEmpty()){
            result[resultIndex++]=A[deque.peekFirst()];
        }else{
            result[resultIndex++]=0;
        }
        return result;
    }
    public static long[] bruteForce(long A[],int N,int K){
        long[] ans=new long[N-K+1];
        for (int i = 0; i < N-K+1; i++) {
            for (int j = i; j < i+K; j++) {
                if(A[j]<0){
                    ans[i]=A[j];
                    break;
                }
            }
        }
        return ans;
    }
}
