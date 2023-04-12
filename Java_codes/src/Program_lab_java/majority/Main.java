package majority;

public class Main 
{
    public static void main(String[] args) 
    {
        int[] arr = {1,2,2,3,3,3,5};
        int maxCount = 0;
        int index = -1;
        for (int i = 0; i < arr.length; ++i) 
        {
            int count = 0;
            for (int j = i+1; j < arr.length; ++j)
            {
                if (arr[i] == arr[j])
                {
                    count++;
                }
            }
            if (count > maxCount) 
            {
                maxCount = count;
                index = i;
            }
        }
        System.out.println(arr[index]);
    }
}
