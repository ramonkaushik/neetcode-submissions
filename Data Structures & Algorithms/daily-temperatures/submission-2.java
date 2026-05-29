class Solution {
    public int[] dailyTemperatures(int[] temps) {
        Stack<Integer> stack = new Stack<>();

        int[] output = new int[temps.length];

        for(int i = 0; i < temps.length; i++) {
            while(!stack.empty() && temps[i] > temps[stack.peek()]) {
                int prevIndex = stack.pop();
                output[prevIndex] = i - prevIndex;
            }
            stack.push(i);
        }

        return output;
    }
}
