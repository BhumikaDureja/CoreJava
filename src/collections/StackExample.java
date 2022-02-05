package collections;

import java.util.Stack;

public class StackExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Stack<Integer> stack1 = new Stack<Integer>();
		
		stack1.push(4);
		stack1.push(8);
		stack1.push(12);
		stack1.pop();  // pops a value out of the stack
		stack1.push(3);
		
		System.out.println(stack1);
		System.out.println(stack1.peek()); // It will alwyas pick the value which is there on the top of the tack or came last at the stack
		
		

	}

}
