package Year_2023.M02_Febrauary_2023.Date_02_06_2023;
//https://leetcode.com/problems/sqrtx/description/?envType=study-plan&id=binary-search-i

public class Sqrt_x {
    public static void main(String[] args) {
        System.out.println(mySqrt(29));
    }

    private static int mySqrt(int num) {
        if(num==0||num==1) return num;
        int start=1,end=num;
        while(start<=end){
            int mid=start+(end-start)/2;
            if(mid==num/mid) return mid;
            else if(mid<num/mid) start=mid+1;
            else end=mid-1;
        }
        return end;
    }
}
