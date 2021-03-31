interface Stack01{
	boolean isEmpty();
	void push(char item);
	char pop();
	void delete();
	char peek();
}

class ArrayStack implements Stack01{
	private int top;
	private int stackSize;
	private char itemArray[];
	
	public ArrayStack(int stackSize) {
		top = -1;
		this.stackSize = stackSize;
		itemArray = new char[this.stackSize];
	}
	public boolean isEmpty() {
		return(top == -1);
	}
	
	public boolean isFull() {
		return (top == this.stackSize-1);
	}
	
	public void puch(char item) {
		if(isFull()) {
			System.out.println("Stack is Full");
		}
		else {
			itemArray[++top] = item;
			System.out.println("Inserted Item" + item);
		}
	}
	public char pop() {
		if(isEmpty()) {
			System.out.println("Stack is empty");
			return 0;
		}
		else {
			return itemArray[top--];
		}
	}
	public void delete() {
		if(isEmpty()) {
			System.out.println("Stack is empty");
		}
		else {
			top--;
		}
	}
	public char peek() {
		if(isEmpty()) {
			System.out.println("Stack is empty");
			return 0;
		}
		else
			return itemArray[top];
	}
	
	public void printStack() {
		if(isEmpty())
			System.out.printf("Stack is empty %n %n");
		else {
			System.out.printf("Stack");
			for(int i=0; i<=top; i++)
				System.out.printf("%c", itemArray[i]);
			System.out.println(); System.out.println();
		}
	}
	@Override
	public void push(char item) {
		// TODO Auto-generated method stub
		
	}
}
class Array_Stack{
	public static void main(String args[]) {
		int stackSize = 5;
		char deletedItem;
		ArrayStack S = new ArrayStack(stackSize);
		
		S.push('A');
		S.printStack();
		
		S.push('B');
		S.printStack();
		
		S.push('C');
		S.printStack();
		
		deletedItem = S.pop();
		if(deletedItem != 0)
			System.out.println("deleted Item" + deletedItem);
		S.printStack();
	}
}


