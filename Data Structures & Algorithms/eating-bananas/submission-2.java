class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int l = 1;
        int r = maxValue(piles);
        int minEatingSpeed = r; 

        while(l <= r) {
            int eatingSpeed = (l + r) / 2;

            int totalTime = 0;
            for(int pile : piles) {
                // bananas * (hours / bananas) == hours
                totalTime += Math.ceil((double) pile / eatingSpeed);
            }

            if(totalTime <= h) {
                // try something lower but we've found am minEatingSpeed
                r = eatingSpeed - 1;
                minEatingSpeed = eatingSpeed;
            } else {
                l = eatingSpeed + 1;
            }
        }
        return minEatingSpeed;
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
