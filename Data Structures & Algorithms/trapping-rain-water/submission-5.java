class Solution {
    public int trap(int[] height) {
        int[] leftMax = new int[height.length];
        int[] rightMax = new int[height.length];
        
        for(int i = 1; i < height.length; i++) {
            leftMax[i] = Math.max(leftMax[i - 1], height[i - 1]);
        }

        for(int i = rightMax.length - 2; i >= 0; i--) {
            rightMax[i] = Math.max(rightMax[i + 1], height[i + 1]);
        }

        int trappedWater = 0;

        for(int i = 0; i < height.length; i++) {
            int potentialWater = Math.min(leftMax[i], rightMax[i]) - height[i];

            if(potentialWater > 0) {
                trappedWater += potentialWater;
            }
        }

        return trappedWater;
    }
}
