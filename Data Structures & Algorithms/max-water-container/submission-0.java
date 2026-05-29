class Solution {
    public int maxArea(int[] heights) {
        int left = 0;
        int right = heights.length - 1;
        int maxArea = 0;
        

        while(left < right) {
            int width = right - left;
            int localArea = Math.min(width * heights[left], width * heights[right]);

            maxArea = Math.max(localArea, maxArea);

            if(heights[left] >= heights[right]) {
                right--;
            } else {
                left++;
            }
        }

        return maxArea;
    }
}
