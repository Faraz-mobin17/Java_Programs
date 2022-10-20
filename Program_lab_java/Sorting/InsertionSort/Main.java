package Sorting.InsertionSort;

public class Main {

    static void insertionSort(int[] arr, int size) {
        for (int i = 1; i < size; i += 1) {
            int j = i - 1;
            int currentElement = arr[i];
            while (j > -1 && arr[i] > currentElement) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = currentElement;
        }
    }

    public static void main(String[] args) {
        int[] arr = { 8, 5, 7, 3, 2 };
        int size = arr.length;
        insertionSort(arr, size);
    }
}
