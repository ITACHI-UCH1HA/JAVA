package Date_02_08_2023;
//https://leetcode.com/problems/arranging-coins/?envType=study-plan&id=binary-search-i
public class Arranging_Coins {
    public static void main(String[] args) {
        System.out.println(arrangeCoins3(1804289383));
    }
    public static int arrangeCoins(int n){
        long start=1,end=n;
        while (start<=end){
            long mid=start+(end-start)/2;
            if(mid*(mid+1)/2==n) return (int)mid;
            else if(mid*(mid+1)/2<n) start=mid+1;
            else end=mid-1;
        }
        return (int)end;
    }
    public static int arrangeCoins2(int n){
        return (int) Math.floor(Math.sqrt(2 * n + 0.25) - 0.5);
    }
    public static int arrangeCoins3(int n){
        int left = 1, right = (int) Math.sqrt(n * 2);
        while (left <= right) {
            int mid = left + (right - left) / 2;
            int sum = mid * (mid + 1) / 2;
            if (sum == n) {
                return mid;
            } else if (sum < n) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return Math.min(right, n);
    }
}
