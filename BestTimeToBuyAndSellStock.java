class BestTimeToBuyAndSellStock {
    public int maxProfit(int[] prices) {
        int buyPrice = prices[0];
        int profit = 0;
        
        for(int i = 0 ; i<prices.length; i++) {
            buyPrice = Math.min(prices[i], buyPrice);
            profit = Math.max(prices[i] - buyPrice, profit);
        }
        
        return profit;
    }
}
