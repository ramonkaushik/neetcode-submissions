class Solution {
    public boolean isValid(String s) {
        // Put opening parenthesis in the stack. If we see the closing brace down the line, pop it off stack
        if(s.length() % 2 != 0) {
            return false;
        }

        Stack<Character> stack = new Stack<>();

        for(int i = 0; i < s.length(); i++) {
            // if the stack is empty and there is a closing brace in the string -> return false
            if(stack.empty() && (s.charAt(i) == ')' || s.charAt(i) == ']' || s.charAt(i) == '}')) {
                return false;
            }
            else {
                if(s.charAt(i) == '}' && stack.peek() == '{') {
                    stack.pop();
                }
                else if(s.charAt(i) == ']' && stack.peek() == '[') {
                    stack.pop();
                }
                else if(s.charAt(i) == ')' && stack.peek() == '(') {
                    stack.pop();
                }
                else {
                    stack.push(s.charAt(i));
                }
            }
        }
        return stack.empty();
    }
}
