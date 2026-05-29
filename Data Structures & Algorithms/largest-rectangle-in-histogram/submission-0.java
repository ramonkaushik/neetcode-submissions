class Solution {
    public int largestRectangleArea(int[] heights) {
        // declare max area output 
        int maxArea = 0;

        Stack<Integer> stack = new Stack<>();

        for(int i = 0; i <= heights.length; i++) {
            while(!stack.empty() && (i == heights.length || heights[stack.peek()] >= heights[i])) {
                int height = heights[stack.pop()];

                int width; 

                if(stack.empty()) {
                    width = i;
                } else {
                    width = i - stack.peek() - 1;
                }

                maxArea = Math.max(maxArea, height * width);
            }

            stack.push(i);
        }

        return maxArea;
    }
}
