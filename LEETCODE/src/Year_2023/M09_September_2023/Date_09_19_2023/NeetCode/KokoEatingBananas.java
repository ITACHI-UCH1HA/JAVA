package Year_2023.M09_September_2023.Date_09_19_2023.NeetCode;

public class KokoEatingBananas {
    public static void main(String[] args) {
        int[] piles={3,6,7,11};
        System.out.println(minEatingSpeed(piles,8));
    }
    public static int minEatingSpeed(int[] piles, int h) {
        if(h==piles.length){
            return getMax(piles);
        }
        int left=1;
        int right=getMax(piles);
        while (left<right){
            int mid=left+(right-left)/2;
            int hours_needed=timeneeded(piles,mid);
            if(hours_needed>h){
                left=mid+1;
            }else{
                right=mid;
            }
        }
        return left;
    }
    public static int getMax(int[] piles){
//        int max=piles[0];
//        for (int i = 0; i < piles.length; i++) {
//            if(piles[i]>max){
//                max=piles[i];
//            }
//        }
//        return max;
        int max=piles[0];
        for (int i:piles) {
            max=Math.max(i,max);
        }
        return max;
    }
    public static int timeneeded(int[] piles,int speed){
//        int hours=0;
//        for (int i = 0; i < piles.length; i++) {
//            if(piles[i]%speed==0){
//                hours+=piles[i]/speed;
//            }else{
//                hours+=piles[i]/speed+1;
//            }
//        }
//        return hours;
        int hours = 0;
        for (int pile : piles) {
            hours += (pile + speed - 1) / speed;
        }
        return hours;
    }
}
