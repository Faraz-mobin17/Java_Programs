package Linear_Search;

public class Main {

    public static int linearSearch(int[] arr, int find) {
        for (int i = 0; i < arr.length; i += 1) {
            if (arr[i] == find) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5 };
        int find = 5;
        int index = linearSearch(arr, find);
        if (index == -1)
            System.out.println("Element is not present in the array");
        else
            System.out.println("Element found at position " + index);
    }

}
