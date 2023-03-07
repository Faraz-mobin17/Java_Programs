package DSA.Queue;
import java.util.Stack;
public class QueueUsingStacks {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
    }
}

class QuisngStack 
{
    private Stack<Integer> first;
    private Stack<Integer> second;
    public QuisngStack() {
        first = new Stack<>();
        second = new Stack<>();
    }
    public void insertItem(int item) {
        first.push(item);
    }
    public int remove() throws Exception
    {
        // while first is not empty remove from first
        while (!first.isEmpty())
        {
            // put it in second
            int itemRemoved = first.pop();
            second.push(itemRemoved);
        }
        int removed = second.pop();
        
        // while second is not empty remove it from second and put it in first
        while (!second.isEmpty())
        {
            int itemRemoved = second.pop();
            first.push(itemRemoved);
        }
        return removed;
    }
    public boolean isEmpty() 
    {
        return first.isEmpty();
    }
    public int peek() 
    {
        // while first is not empty remove from first
        while (!first.isEmpty())
        {
            // put it in second
            int itemRemoved = first.pop();
            second.push(itemRemoved);
        }
        int peeked = second.peek();
        
        // while second is not empty remove it from second and put it in first
        while (!second.isEmpty())
        {
            int itemRemoved = second.pop();
            first.push(itemRemoved);
        }
        return peeked;
    }
}
