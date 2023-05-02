class LinkQueue {

	private class Node { //Node class is encapsulated
			int data;
			Node next;

			public Node(int data) {
					this.data = data;
					this.next = null;
			}
	}
	private Node front;
	private Node rear;

	public LinkQueue() { //constructor
			this.front = null;
			this.rear = null;
	}

	public boolean isEmpty() {
			return (front == null);
	}

	public void enQueue(int data) {
			Node newNode = new Node(data);

			if (front == null) {
					front = rear = newNode;
					return;
			}

			rear.next = newNode;
			rear = newNode;
	}

	public int deQueue() {
			if (isEmpty())
					System.out.println("Queue is empty.");

			int data = front.data;
			front = front.next;

			if (front == null)
					rear = null;

			return data;
	}

	public int peek() {
			if (isEmpty())
					System.out.println("Queue is empty.");

			return front.data;
	}

	public void display() {
			Node current = front;

			if (current == null) {
					System.out.println("Queue is empty.");
					return;
			}

			while (current != null) {
					System.out.print(current.data + " ");
					current = current.next;
			}
	}
}

class LinkQueueApp {
	public static void main(String[] args) {
			LinkQueue queue = new LinkQueue();

			// Enqueue elements into the queue
			queue.enQueue(10);
			queue.enQueue(20);
			queue.enQueue(30);
			queue.enQueue(40);
			queue.enQueue(50);
			queue.enQueue(60);

			// Print the front element
			System.out.println("\nFront element: " + queue.peek());

			// Print all elements in the queue
			System.out.println("\nElements in queue: ");
			queue.display();

			// Dequeue elements from the queue
			queue.deQueue();
			queue.deQueue();

			// Print the front element
			System.out.println("\n\nFront element: " + queue.peek());

			// Print all elements in the queue
			System.out.println("\nElements in queue: ");
			queue.display();


	}
}
