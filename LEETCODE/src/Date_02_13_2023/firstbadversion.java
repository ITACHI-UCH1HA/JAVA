package Date_02_13_2023;

public class firstbadversion {
    public static void main(String[] args) {
        System.out.println(firstBadVersion(24));
    }
    public static int firstBadVersion(int n){
        if(n==1 || isBadVersion(1)) return 1;
        if(isBadVersion(n) && !isBadVersion(n-1)) return n;
        int start=1,end=n;
        while(start<end){
            int mid=start+(end-start)/2;
            if(isBadVersion(mid)) end=mid;
            else start=mid+1;
        }
        return end;
    }
    public static boolean isBadVersion(int num){
        if(num>4) return true;
        else return false;
    }
}
