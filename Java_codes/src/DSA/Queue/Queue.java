package DSA.Queue;

public class Queue {
    private int queue[];
    private int frontIndex, nextIndex, size, capacity;

    public Queue(int size) {
        this.size = 0;
        capacity = size;
        frontIndex = -1; // queue is empty
        nextIndex = 0;
        queue = new int[size];
    }

    public int getSize() {
        return size;
    }

    public boolean isFull() {
        return (size == capacity);
    }

    public boolean isEmpty() {
        return (size == 0);
    }

    public void enqueue(int val) {
        if (isFull()) {
            System.out.println("Queue is Full\n");
            return;
        }
        queue[nextIndex] = val;
        nextIndex = (nextIndex + 1) % capacity;
        if (frontIndex == -1)
            frontIndex = 0;
        size++;
    }

    public int dequeue() {
        if (isEmpty()) {
            System.out.println("Queue is Empty\n");
            return Integer.MIN_VALUE;
        }
        int val = queue[frontIndex];
        frontIndex = (frontIndex + 1) % capacity;
        size--;
        // code will work without this also
        if (size == 0) {
            frontIndex = -1;
            nextIndex = 0;
        }
        return val;
    }

    public int front() {
        if (isEmpty()) {
            System.out.println("Queue is Empty\n");
            return Integer.MIN_VALUE;
        }
        return queue[frontIndex];
    }

    public int rear() {
        if (isEmpty()) {
            System.out.println("Queue is Empty\n");
            return Integer.MIN_VALUE;
        }
        return queue[nextIndex];
    }

    public void display() {
        if (isEmpty()) {
            System.out.println("Queue is Empty");
            return;
        }
        for (int i = 0; i < size; i += 1) {
            System.out.println(queue[i]);
        }
    }

    public static void main(String[] args) {
        Queue q = new Queue(5);
        for (int i = 1; i <= 5; i += 1) {
            q.enqueue(i);
        }
        q.dequeue();
        q.enqueue(6);
        // q.display();
        // q.front();
        // q.rear();
        // q.dequeue();
        // System.out.println("After removing the first item from the queue");
        q.display();
        // System.out.println(q.countElements());
    }
}