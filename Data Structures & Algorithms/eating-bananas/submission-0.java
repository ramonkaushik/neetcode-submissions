class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int l = 1;
        int r = maxValue(piles);
        int min = r;

        while(l <= r) {
            int mid = (l + r) / 2;

            int totalTime = 0;
            for(int pile : piles) {
                totalTime += Math.ceil((double) pile / mid);
            }

            if(totalTime <= h) {
                min = mid;
                r = mid - 1;
            } else {
                l = mid + 1;
            }
        }
        return min;
    }

    public int maxValue(int[] piles) {
        int max = 0;
        for(int pile : piles) {
            max = Math.max(max, pile);
        }

        return max;
    }
}
