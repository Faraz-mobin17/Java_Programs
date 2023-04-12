package DSA.Queue;

public class QueueTwo {
    private  int queue[];
    private static int nextIndex,firstIndex,length,capacity;
    public QueueTwo(int size)
    {
        queue = new int[size];
        nextIndex = 0;
        firstIndex = -1;
        this.length = 0;
        capacity = size;
    }
    public int getSize() {return length;}
    public boolean isEmpty() {return length == 0;}
    public boolean isFull() {return length == capacity;}
    public void enqueue(int element) 
    {
        if (isFull()) 
        {
            System.out.println("Queue is full");
            return;
        }
        queue[nextIndex] = element;
        nextIndex = (nextIndex + 1) % capacity;
        if (firstIndex == -1) firstIndex = 0;
        length++;
    }
    public int dequeue() 
    {
        if (isEmpty()) 
        {
            System.out.println("Queue is Empty");
            return Integer.MIN_VALUE;
        }
        int itemAtFirstIndex = queue[firstIndex];
        firstIndex = (firstIndex + 1) % capacity;
        length--;
        if (length == 0) 
        {
            nextIndex = 0;
            firstIndex = -1;
        }
        return itemAtFirstIndex;
    }
    public int front() 
    {
        if (isEmpty()) 
        {
            System.out.println("Queue is empty");
            return Integer.MIN_VALUE;
        }
        return queue[firstIndex];
    }
    public int rear() 
    {
        if (isEmpty())
        {
            System.out.println("Queue is Empty");
            return Integer.MIN_VALUE;
        }
        int itemAtRear = queue[nextIndex - 1];
        return itemAtRear;
    }
    public static void main(String[] args) {
        QueueTwo q = new QueueTwo(5);
        q.enqueue(10);
        q.enqueue(20);
        q.enqueue(30);
        q.enqueue(40);
        q.enqueue(50);
        q.enqueue(60);
        System.out.println(q.front());   
        System.out.println(q.dequeue());
        System.out.println(q.dequeue());
        System.out.println(q.dequeue());
        System.out.println(q.getSize());
        System.out.println(q.isEmpty());
    }
}
