package patterns;

public class pattern1 {
    public static void main(String[] args) {
        pattern_1_recursion(5,0);
    }

    private static void pattern_1_recursion(int r,int c) {
        if(r==0) return;
        if(c<r){
            System.out.print("* ");
            pattern_1_recursion(r,c+1);
        }else{
            System.out.println();
            pattern_1_recursion(r-1,0);
        }
    }

    private static void pattern_1(int n) {
        for (int i = n; i>0; i--) {
            for (int j = 0; j < i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
