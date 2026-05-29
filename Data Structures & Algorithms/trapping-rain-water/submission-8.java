class Solution {
    public int trap(int[] height) {
        int left = 0;
        int right = height.length - 1;
        
        int leftMax = height[0];
        int rightMax = height[height.length - 1];

        int trappedRainWater = 0;

        while(left < right) {
            if(leftMax < rightMax) {
                left++;
                leftMax = Math.max(height[left], leftMax);
                trappedRainWater += leftMax - height[left];
            } else {
                right--;
                rightMax = Math.max(rightMax, height[right]);
                trappedRainWater += rightMax - height[right];
            }
        }

        return trappedRainWater;
    }
}
