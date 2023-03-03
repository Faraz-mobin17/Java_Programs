package DSA.Sorting;

public class BubbleSort {
    public void bubbleSort(int[] arr)
    {
        int n = arr.length;
        boolean swapped;
        for (int i = 0; i < n - 1; i++)
        {
            swapped = false;
            for (int j = 0; j < n - i - 1; j++)
            {
                if (arr[j] > arr[j + 1]) 
                {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swapped = true;
                }
            } 
            if (swapped == false) break; // if the array is sorted it will stop after 1 pass
        }             
    }
    public void print(int[] arr)
    {
        int n = arr.length;
        for (int i = 0; i < n; i += 1)
        {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        BubbleSort ob = new BubbleSort();
        int arr[] = { 5,4,3,2,1};
        ob.bubbleSort(arr);
        System.out.println("Sorted array");
        ob.print(arr);
    }
}
