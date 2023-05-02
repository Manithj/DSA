class LinkStack {

	private class Node { //Node class is encapsulated
			int data;
			Node next;

			public Node(int data) {
					this.data = data;
					this.next = null;
			}
	}
	private Node top;

	public LinkStack() { //constructor
			this.top = null;
	}

	public boolean isEmpty() {
			return (top == null);
	}

	public void push(int data) {
			Node newNode = new Node(data);
			if (top == null) {
					newNode.next = null;
			} else {
					newNode.next = top;
			}
			top = newNode;
	}

	public int pop() {
			if (top == null) {
					System.out.println("Stack is Empty! Deletion is not possible!");
					return -1;
			}
			int data = top.data;
			top = top.next;
			return data;
	}

	public int peek() {
			if (top == null) {
					System.out.println("Stack is Empty!");
					return -1;
			}
			return top.data;
	}

	public void display() {
			if (top == null) {
					System.out.println("Stack is Empty!!!");
					return;
			}
			Node temp = top;
			while (temp != null) {
					System.out.print(temp.data + " ");
					temp = temp.next;
			}
			System.out.println();
	}
}

class LinkStackTest {
	public static void main(String[] args) {
			LinkStack stack = new LinkStack();

			// Push elements onto the stack
			stack.push(10);
			stack.push(20);
			stack.push(30);
			stack.push(40);
			stack.push(50);
			stack.push(60);

			// Print the top element
			System.out.println("Top element: " + stack.peek());

			// Pop elements from the stack
			stack.pop();
			stack.pop();

			// Print all elements in the stack
			System.out.println("Elements in stack: ");
			stack.display();
	}
}
