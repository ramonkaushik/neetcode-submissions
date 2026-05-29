class Solution {
    public int largestRectangleArea(int[] heights) {
        // declare max area output 
        int maxArea = 0;

        // stack to keep track of taller bars
        Stack<Integer> stack = new Stack<>();

        // go through bars
        for(int i = 0; i <= heights.length; i++) {            
            // while something on the stack && (end of array || we've seen a taller bar)
            while(!stack.empty() && (i == heights.length || heights[stack.peek()] >= heights[i])) {
                // get most recent taller bar's height
                int height = heights[stack.pop()];

                int width; 

                // either start the width from 0 or return the width between bars
                if(stack.empty()) {
                    width = i;
                } else {
                    width = i - stack.peek() - 1;
                }

                // output calculation
                maxArea = Math.max(maxArea, height * width);
            }

            // push every elem.
            stack.push(i);
        }

        return maxArea;
    }
}
