package 贪心;
/*
股票的最大利润 一次买入和卖出
 */
public class MaxProfit {
    public int maxProfit(int[] prices){
        if(prices==null || prices.length<1){
            return 0;
        }
        int soFarMin=prices[0];
        int maxProfit=0;
        for (int i = 1; i <prices.length ; i++) {
            soFarMin=Math.min(soFarMin,prices[i]);
            maxProfit=Math.max(maxProfit,prices[i]-soFarMin);
        }
        return maxProfit;
    }
}
