package Year_2023.M10_October_2023.Date_12;

public class Min_No_Of_Pages {
    public static void main(String[] args) {
//        int[] A= {12,34,67,90};
        int[] A= {13,31,37,45,46,54,55,63,73,84,85};
        int n= 11;
        int m= 9;
        System.out.println(findPages(A,n,m));
    }

    private static int findPages(int[] A, int N, int M) {
        if(A.length==1){
            return A[0];
        }
        int sum=0;
        int range=N%M+N/M+1;
        for (int i = 0; i < range; i++) {
            sum+=A[i];
        }
        return sum;
    }
}
