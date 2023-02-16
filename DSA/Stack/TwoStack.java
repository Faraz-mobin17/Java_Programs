package DSA.Stack;

public class TwoStack {
    private int arr[],top1,top2,size;
    public TwoStack(int size) 
    {
        this.size = size;
        arr = new int[size];
        top1 = -1;
        top2 = size;
    }
 
    public void push1(int data) 
    {
        // code here
        if (top2 - top1 > 1) 
        { 
            top1++;
            arr[top1] = data;
        }
        else {
            System.out.println("Stack overflow");
            return;
        }
    }
    public void push2(int data) 
    {
        // code here
        if (top2 - top1 > 1) 
        { 
            top2--;
            arr[top2] = data;
        }
        else {
            System.out.println("Stack Overflow");
            return;
        }
    }
    public int pop1() 
    {
        // code here
        if (top1 >= 0) 
        {
            int item = arr[top1];
            top1--;
            return item;
        }
        else {
            System.out.println("Stack Underflow");
            return -1;
        }
    }
    public int pop2() 
    {
        // code here
        if (top2 < size) 
        {
            int item = arr[top2];
            top2++;
            return item;
        } else {
            System.out.println("Stack is Underflow");
            return -1;
        }
    }

    public void displayItems() 
    {
        for (int x : arr) 
        {
            System.out.println(x);
        }
    }

    public static void main(String[] args) {
         TwoStack ts = new TwoStack(5);
         ts.push1(1);
         ts.push1(2);
         ts.push1(3);
         ts.push2(4);
         ts.push2(5);
         ts.displayItems();
    }
}
