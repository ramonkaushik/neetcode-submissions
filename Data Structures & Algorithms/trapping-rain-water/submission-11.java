class Solution {
    public int trap(int[] heights) {
        int left = 0;
        int right = heights.length - 1;

        int maxLeft = heights[left];
        int maxRight = heights[right];

        int water = 0;

        while(left < right) {
            if(maxLeft < maxRight) {
                left++;
                maxLeft = Math.max(maxLeft, heights[left]);
                water += maxLeft - heights[left];
            } else {
                right--;
                maxRight = Math.max(maxRight, heights[right]);
                water += maxRight - heights[right];
            }
        }

        return water;
    }
}
