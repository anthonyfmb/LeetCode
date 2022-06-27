class Solution {
    public int maxProfit(int[] prices) {
        int smallestPrice = 10*10*10*10*10 + 1;
        int largestDiff = 0;
        for (int i = 0; i < prices.length; i++) {
            if (prices[i] < smallestPrice) {
                smallestPrice = prices[i];
            }
            else if (prices[i] - smallestPrice > largestDiff) {
                largestDiff = prices[i] - smallestPrice;
            }
        }
        
        return largestDiff;
    }
}