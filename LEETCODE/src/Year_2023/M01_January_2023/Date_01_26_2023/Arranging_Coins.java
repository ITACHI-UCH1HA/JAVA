package Year_2023.M01_January_2023.Date_01_26_2023;

public class Arranging_Coins {
    public static void main(String[] args) {
        System.out.println(arrangeCoins(1804289383));
    }


    public static int arrangeCoins(int n) {
        long start=1,end=n;
        while(start<end){
            long mid=start+(end-start)/2;
            long sum=mid*(mid+1)/2;
            if(sum<=n) start= mid;
            else end=mid-1;
        }
        return (int)start;
    }
}
