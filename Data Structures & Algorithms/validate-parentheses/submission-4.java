class Solution {
    public boolean isValid(String s) {
        // check to see if even or odd length
        if(s.length() % 2 != 0) {
            return false;
        }

        Stack<Character> stack = new Stack<>();

        for(int i = 0; i < s.length(); i++) {
            //if the stack is empty and we see a closing brace
            if(stack.empty() && (s.charAt(i) == ')' || s.charAt(i) == ']' || s.charAt(i) == '}')) {
                return false;
            }

            else {
                if(s.charAt(i) == '}' && stack.peek() == '{') stack.pop();
                else if(s.charAt(i) == ']' && stack.peek() == '[') stack.pop();
                else if(s.charAt(i) == ')' && stack.peek() == '(') stack.pop();
                else stack.push(s.charAt(i));
            }
        }
        return stack.empty();
    }
}
