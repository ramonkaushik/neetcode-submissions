class Solution {
    public int maxProfit(int[] prices) {
        // declare sliding window pointers and maxProfit
        int leftWindow = 0;
        int rightWindow = 1; 
        int maxProfit = 0;

        // loop through prices and subtract each element from the smallest number in the left window
        while(rightWindow < prices.length) {
            // buy low sell high
            if(prices[rightWindow] > prices[leftWindow]) {
                maxProfit = Math.max(maxProfit, prices[rightWindow] - prices[leftWindow]);
            }
            else {
                // this is finding the smallest number and ensure we are subtracting it.
                leftWindow = rightWindow;
            }
            rightWindow++;
        }

        return maxProfit;

        // return max profit
    }
}
