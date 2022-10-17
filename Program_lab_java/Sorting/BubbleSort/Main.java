public class Main {

    public static void swap(int x, int y) {
        int temp = x;
        x = y;
        y = temp;
    }

    public static void bubbleSort(int[] arr, int n) {
        for (int i = 0; i < n - 1; i += 1) {
            boolean flag = false;
            for (int j = 0; j < n - 1 - i; j += 1) {
                if (arr[j] > arr[j + 1]) {
                    swap(arr[j], arr[j + 1]);
                    flag = true;
                }
            }
            if (!flag) {
                break;
            }
        }

    }

    public static void main(String[] args) {
        int[] arr = { 8, 5, 3, 7, 2 };
        int n = arr.length;
        bubbleSort(arr, n);
    }
}
