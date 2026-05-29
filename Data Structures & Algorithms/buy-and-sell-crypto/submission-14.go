func maxProfit(prices []int) int {
    // declare maxprofit
    maxProfit := 0

    left := 0
    right := 1

    // iterate prices
    for right < len(prices) {
        // finding min
        if prices[left] > prices[right] {
           left = right 
        } else if maxProfit < prices[right] - prices[left] {
            maxProfit = prices[right] - prices[left]
        }
        right++
    }
    return maxProfit
        
}
