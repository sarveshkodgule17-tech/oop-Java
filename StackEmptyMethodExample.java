import java.util.Stack;

class StackEmptyMethodExample {
    public static void main(String[] args) {
     Stack<Integer> stk = new Stack<>(); // Correct type: Integer

  // Check if the stack is empty
  Boolean result = stk.empty();
   System.out.println("Is the Stack empty? " + result);

      // Push elements onto the stack
        stk.push(10);
        stk.push(20);
        stk.push(30);
        stk.push(40);

  System.out.println("Elements in stack: " + stk);
      
// Check if the stack is empty after pushing elements
  result = stk.empty();
  System.out.println("Is the Stack empty? " + result);
    }
}
