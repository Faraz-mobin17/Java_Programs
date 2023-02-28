package DSA.Queue;
public class Dequeue {
    int[] dequeue;
    int front,rear,size;
    public Dequeue(int size)
    {
        this.size = size;
        front = -1;
        rear = -1;
        dequeue = new int[size];
    }
    public boolean check()
    {
        return (front == 0 && rear == size - 1);
    }
    public void insertInAtFront(int data)
    {
        // check overflow
        if (check())
        {
            System.out.println("Overflow");
            return;
        }
        if (front > 0)
        {
            front--;
            dequeue[front] = data;
        }
    }
    public void insertAtRear(int data)
    {
        if (rear < size - 1)
        {
            rear++;
            dequeue[rear] = data;
        }
        else 
        {
            System.out.println("Can't Insert");
            return;
        }
    }
    public void displayFront() 
    {
        System.out.println("Element at Front: " + dequeue[front]);
    }
    public void displayRear()
    {
        System.out.println("Element at Rear: " + dequeue[rear]);
    }
    public void display()
    {
        System.out.println("Front: " + dequeue[front] + " " + " Rear: " + dequeue[rear]);
    }
    public static void main(String[] args) {
        Dequeue d = new Dequeue(5);
        d.insertAtRear(5);
        d.insertInAtFront(1);
        d.displayFront();
        d.displayRear();
    }
}
