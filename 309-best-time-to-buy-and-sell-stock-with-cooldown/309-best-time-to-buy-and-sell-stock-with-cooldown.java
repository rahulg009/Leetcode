class Solution {
    public int maxProfit(int[] prices) {
		int[][] dp = new int[prices.length][3];
        return calculateProfit(prices, dp, 0, 0); 
    }
	
	private int calculateProfit(int[] prices, int[][] dp, int index, int state) {
		if(index >= prices.length) return 0;
		
		if(dp[index][state] != 0) 
			return dp[index][state];
			
		int profit = 0;
		
		if(state == 0) { 
			int buyNow = calculateProfit(prices, dp, index + 1, 1) - prices[index];
			int buyLater = calculateProfit(prices, dp, index + 1, state); 
			
			profit = Math.max(buyNow, buyLater);	
		}
		else if(state == 1) { 
			int sellNow = prices[index] + calculateProfit(prices, dp, index + 1, 2);
			int sellLater = calculateProfit(prices, dp, index + 1, state);
			
			profit = Math.max(sellNow, sellLater);
		}
		else if(state == 2) { 
			profit = calculateProfit(prices, dp, index + 1, 0);
		}
				
		return dp[index][state] = profit;
	}
}