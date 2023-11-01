package Year_2023.M11_November_2023.Date_02;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;

public class FirstNegativeOccurence {
    public static void main(String[] args) {
        long[] A={-8, 2, 3, -6, 10};
        System.out.println(Arrays.toString(printFirstNegativeInteger(A,A.length,2)));
    }
    public static long[] printFirstNegativeInteger(long A[], int N, int K)
    {
        long[] result=new long[N-K+1];
        Deque<Integer> deque=new ArrayDeque<>();
        int resultIndex=0;
        for (int i = 0; i < K; i++) {
            if(A[i]<0){
                deque.addLast(i);
            }
        }

        for (int i = K; i < N; i++) {
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

        if(!deque.isEmpty()){
            result[resultIndex]=A[deque.peekFirst()];
        }else{
            result[resultIndex]=0L;
        }

        return result;
    }
}
