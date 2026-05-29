class Solution {
    // check if stack is empty and there is a closing bracket in string
    // if the current char is a closing bracket and the peek is opening bracket pop
    // else push the char

    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();

        for(int i = 0; i < s.length(); i++) {
            // if opening bracket, add
            char c = s.charAt(i);
            
            if(stack.empty() && (c == '}' || c == ']' || c == ')')) {
                return false;
            } else {
                if(c == '}' && stack.peek() == '{') {
                    stack.pop();
                } else if(c == ']' && stack.peek() == '['){
                    stack.pop();
                } else if(c == ')' && stack.peek() == '(') {
                    stack.pop();
                } else {
                    stack.push(c);
                }
            }
        }

        return stack.empty();
    }
}
