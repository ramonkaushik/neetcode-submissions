class MinStack {
    Stack<Integer> stack = new Stack<>();
    Stack<Integer> minStack = new Stack<>();

    public MinStack() {
        this.stack = stack;
        this.minStack = minStack;
    }
    
    public void push(int val) {
        stack.push(val);

        if(minStack.empty() || val <= minStack.peek()) {
            minStack.push(val);
        }
    }
    
    public void pop() {
        if(stack.empty()) {
            return;
        }

        if(stack.peek().equals(minStack.peek())) {
            minStack.pop();
        }
        stack.pop();
    }
    
    public int top() {
        return stack.peek();
    }
    
    public int getMin() {
        return minStack.peek();
    }
}
