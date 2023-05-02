class queueArray {
    private int maxSize;
    private int[] Array;
    private int front;
    private int rear;
    private int currentSize;

    public queueArray(int size)
    {
        this.maxSize = size;
        this.Array = new int[size];
        front = 0;
        rear = -1;
        currentSize = 0;
    }

    public boolean isFull()
    {
        return (maxSize == currentSize);
    }

    public boolean isEmpty()
    {
        return (currentSize == 0);
    }

    public void enqueue(int item)
    {
        if(isFull())
        {
            System.out.println("Queue is full!");
            return;
        }
        if(rear == maxSize - 1)
        {
            rear = -1;
        }
//        increment rear then insert element to queue
        Array[++rear] = item;
        currentSize++;
        System.out.println("Item added to queue: " + item);
    }

    public int dequeue() //the item which enters last will be removed
    {
        if(isEmpty())
        {
            throw new RuntimeException("Queue is empty");
        }
//        retrieve queue element then increment
        int item = Array[front++];
        if(front == maxSize)
        {
            front = 0;
        }
        currentSize--;
        return item;
    }

    public int peek()
    {
        return Array[front];
    }

    public int size() {
        return currentSize;
    }

    public void printQueue() {
        if (isEmpty()) {
            System.out.println("Queue is empty");
        } else {
            System.out.println("Queue contents:");
            for (int i = front; i >= 0; i--) {
                System.out.println(Array[i]);
            }
        }
    }

}
