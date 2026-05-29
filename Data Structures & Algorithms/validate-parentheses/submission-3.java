class Solution {
    public boolean isValid(String s) {
        if(s.length() % 2 != 0) return false;

        Stack<Character> openingBraceStack = new Stack<>();
        
        for(int i = 0; i < s.length(); i++) {
            if(openingBraceStack.empty() && (s.charAt(i) == '}' || s.charAt(i) == ')' || s.charAt(i) == ']')) {
                return false;
            }
            else {
                if(s.charAt(i) == '}' && openingBraceStack.peek() == '{') {
                    openingBraceStack.pop();
                }
                else if(s.charAt(i) == ']' && openingBraceStack.peek() == '[') {
                    openingBraceStack.pop();
                }
                else if(s.charAt(i) == ')' && openingBraceStack.peek() == '(') {
                    openingBraceStack.pop();
                }
                else {
                    openingBraceStack.push(s.charAt(i));
                }
            }
        }
        return openingBraceStack.empty();
    }
}
