import java.util.Stack;

public class java5_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack<Integer> stack = new Stack<>();
		stack.push(5);
		stack.push(2);
		stack.push(3);
		stack.push(7);
		stack.pop();
		stack.push(1);
		stack.push(4);
		stack.pop();
		
		System.out.println(stack);
		
	}

}
