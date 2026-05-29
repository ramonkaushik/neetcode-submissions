class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        int[] result = new int[temperatures.length];

        Stack<Integer> stack = new Stack<>();

        for(int i = 0; i < result.length; i++) {
            while(!stack.empty() && temperatures[i] > temperatures[stack.peek()]) {
                result[stack.peek()] = i - stack.peek();
                stack.pop();
            }
            stack.push(i);
        }

        return result;
    }
}
