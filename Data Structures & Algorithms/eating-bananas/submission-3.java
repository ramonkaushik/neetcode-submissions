class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int left = 1;
        int right = maxValue(piles);
        int minEatingSpeed = right;

        while(left <= right) {
            int eatingSpeed = (left + right) / 2; 

            int totalTime = 0;

            for(int pile : piles) {
                // banana / (bananas / time) = time
                totalTime += Math.ceil((double) pile / eatingSpeed);
            }

            // decrease the eating speed until we hit h exactly
            if(totalTime <= h) {
                right = eatingSpeed - 1;
                minEatingSpeed = eatingSpeed;
            } else {
                left = eatingSpeed + 1;
            }
        }
        return minEatingSpeed;
    }

    public int maxValue(int[] piles) {
        int max = 0;
        for(int pile : piles) {
            if(max < pile) {
                max = pile;
            }
        }
        return max;
    }
}
