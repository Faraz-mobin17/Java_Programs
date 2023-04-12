package DSA.Stack;
import java.util.Scanner;
public class Stack {
    private int size,arr[],top,count;
    private final int MAX = 10;
    public Stack() {
        System.out.println("Stack Created by Default Constructor of Size 5");
        this.top = -1;
        this.size = MAX;
        this.arr = new int[MAX];
        this.count = 0;
    }
    public Stack(int size) {
        System.out.println("Stack Created by params Constructor");
        this.size = size;
        this.arr = new int[size];
        this.top = -1;
        this.count = 0;
    }
    public Stack(Stack s) {
        System.out.println("Stack Created by Copy Constructor");
        this.size = s.size;
        this.arr = new int[s.size];
        this.top = s.top;
        this.count = s.count;
    }
    public boolean isEmpty() {
        return (top == -1);
    }
    public boolean isFull() {
        return (size - 1 == top);
    }
    public void push(int data) {
       
        if (isFull()) {
            System.out.println("Stack is Overflowing");
            return;
        }
        arr[++top] = data;
        count++;
    }
    public int pop() {
        if (isEmpty()) {
            System.out.println("Stack is Empty");
            return -1;
        }
        return arr[top--];
    }
    public int peek() {
        if (!isEmpty()) {
            return arr[top];    
        }
        return top;
    }
    public int size() {
        return size;
    }
    public int countItems() {
        return count;
    }
    public void displayItems() {
        for (int x : arr)
        {
            if (x == 0) break;
            System.out.println(x);
        }
    }
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            Stack s1 = new Stack(5);
            while (true) {
                System.out.println("======================================");
                System.out.println("1. Push on Stack");
                System.out.println("2. Pop on Stack");
                System.out.println("3. Peek on Stack");
                System.out.println("4. Check if the Stack is Full");
                System.out.println("5. Check if the Stack is Empty");
                System.out.println("6. Count Items");
                System.out.println("7. Display Items");
                System.out.println("8. Size of the Stack");
                System.out.println("======================================");
                int options = input.nextInt();
                switch (options) {
                    case 1:
                        System.out.println("Enter the Element to Push in Stack");
                        int data = input.nextInt();
                        System.out.println("Element Pushed on Stack is Empty: " + data);
                        s1.push(data);
                        break;
                    case 2:
                        int item = s1.pop();
                        System.out.println("Item poped: " + item);
                        break;
                    case 3:
                        int topItem = s1.peek();
                        System.out.println("Item at the Top is: " + topItem);
                        break;
                    case 4:
                        s1.isFull();
                        break;
                    case 5:
                        s1.isEmpty();
                        break;
                    case 6:
                        System.out.println("Total Items in the Stack: ");
                        int count = s1.countItems();
                        System.out.println(count);
                        break;
                    case 7:
                        System.out.println("Printing Integers");
                        s1.displayItems();
                    default:
                        System.exit(1);
                        break;
                }
            }
        }  
    }
}
