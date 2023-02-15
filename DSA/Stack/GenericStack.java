package DSA.Stack;
import java.util.*;
public class GenericStack<T> {
    private int size,top,count;
    private ArrayList<T> a;
    public GenericStack(int size) {
        top = -1;
        count = 0;
        this.size = size;
        this.a = new ArrayList<T>(size);
    }
    public boolean isFull() {
        return (size - 1 == top);
    }
    public boolean isEmpty() {
        return (top == -1);
    }
    public void push(T data) {
        if (isFull()) {
            System.out.println("Stack is Overflowing");
            return;
        }
        ++top;
        ++count;
        a.add(data);
    }
    T pop() {
        if (isEmpty()) {
            System.out.println("Stack is Empty");
            return null;
        }
        T item = a.get(top);
        System.out.println("Item Removed: " + item);
        --top;
        a.remove(item);
        return item;
    }
    T top() {
        if (isEmpty()) {
            return null;
        }
        return a.get(top);
    }
    public int displayCount() {
        return count;
    }
    public void displayItems() {
        for (T x : a) {
            System.out.println(x);
        }
    }
    public static void main(String[] args) {
               // Integer Stack
 
        // Creating an object of Stack class
        // Declaring objects of Integer type
        GenericStack<Integer> s1 = new GenericStack<>(3);
 
        // Pushing elements to integer GenericStack - s1
 
        // Element 1 - 10
        s1.push(10);
        // Element 2 - 20
        s1.push(20);
        // Element 3 - 30
        s1.push(30);
 
        // Print the GenericStack elements after pushing the
        // elements
        System.out.println(
            "s1 after pushing 10, 20 and 30 :\n" + s1);
 
        // Now, pop from GenericStack s1
        s1.pop();
 
        // Print the GenericStack elements after popping few
        // element/s
        System.out.println("s1 after pop :\n" + s1);
 
        // String GenericStack
 
        // Creating an object of GenericStack class
        // Declaring objects of Integer type
        GenericStack<String> s2 = new GenericStack<>(3);
 
        // Pushing elements to string GenericStack - s2
 
        // Element 1 - hello
        s2.push("hello");
        // Element 2 - world
        s2.push("world");
        // Element 3 - java
        s2.push("java");
 
        // Print string GenericStack after pushing above string
        // elements
        System.out.println(
            "\ns2 after pushing 3 elements :\n" + s2);
 
        System.out.println(
            "s2 after pushing 4th element :");
 
        // Pushing another element to above GenericStack
 
        // Element 4 - GFG
        s2.push("GFG");
 
        // Float GenericStack
 
        // Creating an object of GenericStack class
        // Declaring objects of Integer type
        GenericStack<Float> s3 = new GenericStack<>(2);
 
        // Pushing elements to float GenericStack - s3
 
        // Element 1 - 100.0
        s3.push(100.0f);
        // Element 2 - 200.0
        s3.push(200.0f);
 
        // Print string GenericStack after pushing above float
        // elements
        System.out.println(
            "\ns3 after pushing 2 elements :\n" + s3);
 
        // Print and display top element of GenericStack s3
        System.out.println("top element of s3:\n"
                           + s3.top());
        s1.displayItems();
        s2.displayItems();
        s3.displayItems();
    }
}
