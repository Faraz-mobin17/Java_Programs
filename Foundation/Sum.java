package Foundation;
public class Sum {
    public static int sum(int n) {
        // O(1)
        return (n * (n + 1) / 2);
    }

    public static int sum2(int n) {
        // O(n)
        int sum = 0;
        for (int i = 1; i <= n; i++) 
        {
            sum += i;
        }
        return sum;
    }

    public static int sum3(int n) {
        // O(n^2)
        int sum = 0;
        for (int i = 1; i <= n; i++) 
        {
            for (int j = 1; j <= i; j++) 
            {
                sum++;
            }
        }
        return sum;
    }

    public static void main(String[] args) 
    {
       System.out.println(sum(5));
       System.out.println(sum2(5));
       System.out.println(sum3(5));
    }
}
