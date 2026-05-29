class Solution {
    public int maxProfit(int[] prices) {
        int maxProfit = 0;
        int leftWindow = 0;
        int rightWindow = 1;

        // iterate through array and grab the most profit one can make
        while(rightWindow < prices.length) {
            // buy low sell high
            if(prices[rightWindow] > prices[leftWindow]) {
                maxProfit = Math.max(maxProfit, prices[rightWindow] - prices[leftWindow]);
            }
            else {
                leftWindow = rightWindow;
            }
            rightWindow++;
        }

        return maxProfit;
    }
}
