package DSA.Stack;
import java.util.Scanner;
public class StackWithString {
    private int size,top,count;
    private final int MAX = 10;
    private String stringArr[];
    public StackWithString() {
        System.out.println("StackWithString Created by Default Constructor of Size 5");
        this.top = -1;
        this.size = MAX;
        this.count = 0;
        this.stringArr = new String[MAX];
    }
    public StackWithString(int size) {
        System.out.println("StackWithString Created by params Constructor");
        this.size = size;
        this.stringArr = new String[size];
        this.top = -1;
        this.count = 0;
    }
    public StackWithString(StackWithString s) {
        System.out.println("StackWithString Created by Copy Constructor");
        this.size = s.size;
        this.stringArr = new String[s.size];
        this.top = s.top;
        this.count = s.count;
    }
    public boolean isEmpty() {
        return (top == -1);
    }
    public boolean isFull() {
        return (size - 1 == top);
    }
    public void push(String data) {
        if (isFull()) {
            System.out.println("Stack is Overflowing");
            return;
        }
        stringArr[++top] = data;
        count++;
    }
    public String pop() {
        if (isEmpty()) {
            System.out.println("Stack is Empty");
            return "";
        }
        return stringArr[top--];
    }
    public String peek() {
        if (isEmpty()) {
            return "";    
        }
        return stringArr[top];    
    }
    public int size() {
        return size;
    }
    public int countItems() {
        return count;
    }
    public void displayItems() {
        for (String x : stringArr)
        {
            if (x == null) break;
            System.out.println(x);
        }
    }
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            StackWithString s1 = new StackWithString(5);
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
                        String data = input.next();
                        System.out.println("Element Pushed on Stack is Empty: " + data);
                        s1.push(data);
                        break;
                    case 2:
                        String item = s1.pop();
                        System.out.println("Item poped: " + item);
                        break;
                    case 3:
                        String topItem = s1.peek();
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
