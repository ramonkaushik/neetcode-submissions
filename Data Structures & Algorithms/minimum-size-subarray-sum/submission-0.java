class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int left = 0;
        int minSubarrayLength = Integer.MAX_VALUE;

        int runningCount = 0;

        for(int right = 0; right < nums.length; right++) {
            runningCount += nums[right];

            while(runningCount >= target) {                
                minSubarrayLength = Math.min(right - left + 1, minSubarrayLength);
                
                runningCount -= nums[left];

                left++;
            }
        }

        if(minSubarrayLength == Integer.MAX_VALUE) {
            return 0;
        } else {
            return minSubarrayLength; 
        }

    

    }
}