class Solution {
    public int maxProfit(int[] prices) {
        int left = 0;
        int right = 1;

        int maxProfit = 0;

        while(right < prices.length) {
            if(prices[right] > prices[left]) {
                maxProfit = Math.max(prices[right] - prices[left], maxProfit);
            } else {
                left = right;
            }
            right++;
        }
        return maxProfit;
    }
}
