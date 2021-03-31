
public class ASmain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayStack01<String> stack = new ArrayStack01<String>();
		
		stack.push("apple");
		stack.push("orange");
		stack.push("cherry");
		System.out.println(stack.peek());
		stack.push("pead");
		stack.print();
		stack.pop();
		System.out.println(stack.peek());
		stack.push("grape");
		stack.print();
				
	}

}
