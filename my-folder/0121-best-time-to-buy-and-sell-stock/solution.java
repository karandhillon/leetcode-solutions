class Solution {
    public int maxProfit(int[] prices) {
      int buyP = prices[0];
      int maxProfit = 0;
      
      for (int i = 1; i < prices.length; i++) {
        if (prices[i] < buyP) {
          buyP = prices[i];
        } else {
          maxProfit = Math.max(maxProfit, prices[i] - buyP);
        }
      }
      
      return maxProfit;
    }
}  
