//https://leetcode.com/problems/guess-number-higher-or-lower/?envType=study-plan&id=binary-search-i
package Date_01_21_2023;
public class Guess_Number_Higher_or_Lower {
    public static void main(String[] args) {
        System.out.println(guessNumber(16));
    }

    private static int guessNumber(int n) {

        int start=1,end=n;
        while(start<=end){
            int mid=start+(end-start)/2;
            if(guess(mid)==0) return mid;
            else if(guess(mid)==1) start=mid+1;
            else end=mid-1;
        }
        return -1;

    }

    private static int guess(int n) {
        if(n==15) return 0;
        else if(n>15) return -1;
        else return 1;
    }
}
