class Solution {
    // Map
    HashMap<Integer, Integer> memo = new HashMap<>();

    public int coinChange(int[] coins, int amount) {
        int minCoins = dfs(amount, coins);
        if(minCoins == Integer.MAX_VALUE) {
            return -1;
        } else {
            return minCoins;
        }
    }

    private int dfs(int amount, int[] coins) {
        if(amount == 0) {
            return 0;
        }

        if(memo.containsKey(amount)) {
            return memo.get(amount);
        }

        int res = Integer.MAX_VALUE;
        for(int i = 0; i < coins.length; i++) {
            // if there are more coins to add, recurse with new amount
            if(amount - coins[i] >= 0) {
                int result = dfs(amount - coins[i], coins);
                // 
                if(result != Integer.MAX_VALUE) {
                    res = Math.min(res, 1 + result);
                }
            }
        }

        memo.put(amount, res);
        return res;
    }
}
