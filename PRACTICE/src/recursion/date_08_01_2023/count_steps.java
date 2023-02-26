//https://leetcode.com/problems/number-of-steps-to-reduce-a-number-to-zero/submissions/799703192/

package recursion.date_08_01_2023;

public class count_steps {
    public static void main(String[] args) {
        System.out.println(numberOfSteps(21));
    }
    public static int numberOfSteps(int num) {
       return helper(num,0);
    }
    public static int helper(int num,int step){
        if(num==0 ) return step;
        if(num%2==0) return helper(num/2,step+1);
        else return helper(num-1,step+1);
    }
}
