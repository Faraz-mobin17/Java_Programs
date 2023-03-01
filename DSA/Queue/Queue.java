package DSA.Queue;
public class Queue 
{
    private int queue[];
    private int front,rear,size;
    public Queue(int size)
    {
        this.size = size;
        front = rear = -1;
        queue = new int[size];
    }
    public boolean isFull() 
    {
        return (rear == size - 1);
    }
    public boolean isEmpty() 
    {
        return (front == -1 && rear == -1 || front == rear);
    }
    public void enqueue(int data)
    {
        if (isFull()) 
        {
            System.out.println("Queue is full can't insert elements");
            return;
        }
        if (front == -1) front = 0;
        System.out.println("Inserting element:" + data);
        rear++;
        queue[rear] = data;
    }
    public void dequeue()
    {
        if (isEmpty())
        {
            System.out.println("Queue is empty can't remove elements");
            return;
        }
        int frontItem = queue[front];
        front++;
        System.out.println("Removed Item: " + frontItem);
    }
    public void frontElement()
    {
        if (front == -1 || front == rear) return;
        System.out.println("Element at Front is: " + queue[front]);
    }
    public void rearElement()
    {
        if (rear == -1) return;
        System.out.println("Element at rear is : " + queue[rear]);
    }
    public void display() 
    {
        if (isEmpty())
        {
            System.out.println("Queue is Empty");
            return;
        }
        for (int index = front; index <= rear; ++index) 
        {
            System.out.println("Elements in Queue: " + queue[index]);
        }
    }
    public int countElements() 
    {
        int count = 0;
        while (front <= rear) 
        {
            count++;
            front++;
        }
        return count;
    }
    public static void main(String[] args) 
    {
        Queue q = new Queue(5);
        for (int i = 1; i <= 5; ++i) {
            q.enqueue(i);
        }
        q.display();
        q.frontElement();
        q.rearElement();
        q.dequeue();
        System.out.println("After removing the first item from the queue");
        q.display();
        System.out.println(q.countElements());
    }
}