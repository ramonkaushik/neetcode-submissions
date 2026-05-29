class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        int[] outputTemps = new int[temperatures.length];
        Stack<Integer> stack = new Stack<>();

        for(int i = 0; i < temperatures.length; i++) {
            while(!stack.empty() && temperatures[i] > temperatures[stack.peek()]) {
                int prevIndex = stack.pop();
                outputTemps[prevIndex] = i - prevIndex;
            }

            stack.push(i);
        }

        return outputTemps;
    } 
}
