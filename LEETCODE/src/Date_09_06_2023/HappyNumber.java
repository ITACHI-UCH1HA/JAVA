package Date_09_06_2023;

public class HappyNumber {
    public static void main(String[] args) {
        System.out.println(isHappy(19));
    }
    public static boolean isHappy(int n) {
        int slow = n;
        int fast = n;
        do {
            slow = getNextNum(slow);
            fast = getNextNum(getNextNum(fast));
            if (slow == 1 || fast == 1) return true;
        } while (slow != fast);
        return false;
    }
    public static int getNextNum(int num){
        int sum=0;
        while(num!=0){
            int rem=num%10;
            sum+=rem*rem;
            num/=10;
        }
        return sum;
    }
}
