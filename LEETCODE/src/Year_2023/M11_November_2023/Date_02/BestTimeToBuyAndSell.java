package Year_2023.M11_November_2023.Date_02;

public class BestTimeToBuyAndSell {
    public static void main(String[] args) {
        int[] prices={7,6,4,3,1};
        System.out.println(maxProfit(prices));
    }
    public static int maxProfit(int[] prices) {
        if(prices.length<=1){
            return 0;
        }
        int buy=prices[0];
        int sell=prices[1];
        int profit=(sell-buy)>0?sell-buy:0;
        for (int i = 0; i < prices.length-1; i++) {
            buy=Math.min(buy,prices[i]);
            sell=prices[i+1];

            profit=Math.max(profit,(sell-buy));
        }
        return profit;
    }
    public static int maxProfit_2(int[] prices) {
        int minPrice=Integer.MAX_VALUE;
        int maxProfit=0;
        for (int i = 0; i < prices.length; i++) {
            if(prices[i]<minPrice){
                minPrice=prices[i];
            }else{
                maxProfit=Math.max(maxProfit,prices[i]-minPrice);
            }
        }
        return maxProfit;
    }
}
