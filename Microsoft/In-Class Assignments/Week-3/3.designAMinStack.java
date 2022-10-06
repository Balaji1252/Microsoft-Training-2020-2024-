import java.util.Stack;

class MinStack {
    Stack<Integer> stk = new Stack<Integer>(); 
    Stack<Integer> stk2 = new Stack<Integer>();
    
    public void push(int val) {
        if(stk2.isEmpty() || val<=stk2.peek())
            stk2.push(val);
        stk.push(val);
    }
    
    public void pop() {
        if(stk.peek().equals(stk2.peek()))
            stk2.pop();
        stk.pop(); 
    }
    
    public int top() {
        return stk.peek();
    }
    
    public int getMin() {
        return stk2.peek();
    }
}
