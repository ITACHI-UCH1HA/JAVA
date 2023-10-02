//https://leetcode.com/problems/valid-perfect-square/?envType=study-plan&id=binary-search-i
package Year_2023.M01_January_2023.Date_01_23_2023;

public class Valid_Perfect_Square {
    public static void main(String[] args) {
        System.out.println(isPerfectSquare(26));
    }
    public static boolean isPerfectSquare(int num){
        if(num==0 || num==1) return true;
        int start=2,end=num;
        while (start<=end){
            int mid=start+(end-start)/2;
            if(mid==num/mid) return true;
            else if(mid<num/mid) start=mid+1;
            else end=mid-1;
        }
        return false;
    }
}
