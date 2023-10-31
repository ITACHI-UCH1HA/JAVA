package Dynamic_Programming;

public class count_steps {
    public static void main(String[] args) {
        System.out.println(climbStairs(2));
    }
    public static int climbStairs(int n) {
        return climbStairs(n,0);
    }
    public static int climbStairs(int n,int count) {
       if(n<0){
           return 0;
       } else if (n==0) {
           return 1;
       }
       return climbStairs(n-1,count)+climbStairs(n-2,count);
    }
}
