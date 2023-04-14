package DSA.Queue;
import java.util.Stack;
public class QueueUsingStacksEff {
    public static void main(String[] args) {
    }
}

class QuisngStackEff 
{
    private Stack<Integer> first,second;
    public QuisngStackEff() {
        first = second = new Stack<>();
    }
    public void add(int item) throws Exception
    {
        while (!first.isEmpty())
        {
            second.push(first.pop());
        }
        first.push(item);
        while (!second.isEmpty())
        {
            first.push(second.pop());
        }
    }

    public int peek() throws Exception
    {
        return first.peek();
    }
    public int remove() throws Exception
    {
        return first.pop();
    }
    public boolean isEmpty()
    {
        return first.isEmpty();
    }
}