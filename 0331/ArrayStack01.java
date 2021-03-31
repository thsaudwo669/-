import java.util.EmptyStackException;

public class ArrayStack01<E> {
	private E s[]; // 스택을 위한 배열
	private int top; // 스택의 top 항목의 배열 원소 인덱스

	public ArrayStack01() { // 스택 생성자
		s = (E[]) new Object[1]; // 초기에 크기가 1인 배열 생성
		top = -1;
	}

	public int size() {
		return top + 1;
	} // 스택에 있는 항목의 수를 리턴

	public boolean isEmpty() {
		return (top == -1);
	} // 스택이empty면 true리턴

	public E peek() {
		if (isEmpty())
			throw new EmptyStackException();
		return s[top];
	}

	public void push(E newItem) {
		if (size() == s.length)
			resize(2 * s.length);
		s[++top] = newItem;
	}

	public E pop() {
		if (isEmpty())
			throw new EmptyStackException();
		E item = s[top];
		s[top--] = null;
		if (size() > 0 && size() == s.length / 4)
			resize(s.length / 2);
		return item;
	}
	private void resize(int newSize) {
		Object[] t = new Object[newSize];
		for (int i = 0; i < size(); i++)
			t[i] = s[i];
		s = (E[]) t;
	}
	public void print() {
		if(isEmpty()) System.out.print("스택이 비어있음");
		else
			for (int i = 0; i < size(); i++)
				System.out.print(s[i]+"\t");
		System.out.println();
	}
}
