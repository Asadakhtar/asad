import java.util.ArrayList;
import java.util.HashSet;
import java.util.Stack;
import java.util.TreeSet;

public class hash {

	public static void main(String[] args) {
		Stack stack=new Stack();
		stack.push(100);
		stack.push(900);
		stack.push("hyderabad");
		stack.push(true);
		System.out.println(stack);
		System.out.println(stack.peek());
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		System.out.println(stack);
		System.out.println(stack.contains(100));
	}

}
