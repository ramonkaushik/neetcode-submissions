class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int l = 1;
        int r = maxValue(piles);
        int min = r; 

        while(l <= r) {
            int k = (l + r) / 2;

            int totalTime = 0;
            for(int pile : piles) {
                // bananas * (hours / bananas) == hours
                totalTime += Math.ceil((double) pile / k);
            }

            if(totalTime <= h) {
                r = k - 1;
                min = k;
            } else {
                l = k + 1;
            }
        }
        return min;
    }

    public int maxValue(int[] nums) {
        int max = 0;
        for(int num : nums) {
            if(num > max) {
                max = num;
            }
        }
        return max;
    }
}
