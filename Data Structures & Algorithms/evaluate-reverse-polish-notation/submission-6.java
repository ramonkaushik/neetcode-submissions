class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> stack = new Stack<>();

        for(String token : tokens) {
            if(token.equals("+")) {
                int number1 = stack.pop();
                int number2 = stack.pop();
                stack.push(number1 + number2);

            } else if(token.equals("-")) {
                int number1 = stack.pop();
                int number2 = stack.pop();
                stack.push(number2 - number1);

            } else if(token.equals("*")) {
                int number1 = stack.pop();
                int number2 = stack.pop();
                stack.push(number2 * number1);

            } else if(token.equals("/")) {
                int number1 = stack.pop();
                int number2 = stack.pop();

                if(number1 == 0) {
                    return 0;
                }

                stack.push(number2 / number1);

            } else {
                stack.push(Integer.parseInt(token));
            }
        }

        return stack.peek();
    }
}
