//  Best Time to Buy and Sell Stock





class Solution {
    public int maxProfit(int[] prices) {
        int buyPrice = Integer.MAX_VALUE;
        int mProfit=0;
        for(int i=0;i<prices.length;i++)
        {
            if(prices[i]>buyPrice)
            {
                int profit = (prices[i]-buyPrice);
                mProfit = Math.max(mProfit,profit);
            }
            else
            {
                buyPrice=prices[i];
            }
        }
        return mProfit;
    }
}