package Method_Overidding.Sorting;

public class Main {
    public static void main(String[] args) {
        System.out.println();
    }
}

class Parent {
    void sort(int[] arr, int n) {
        for (int i = 0; i < n - 1; i += 1) {
            boolean flag = false;
            for (int j = 0; j < n - i - 1; j += 1) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    flag = true;
                }
            }
            if (!flag)
                break;
        }
    }
}

class Child extends Parent {
    void sort(int[] arr, int n) {
        int i, j;
        for (i = 0; i < n - 1; i += 1) {
            int minEl = arr[0];
            int minIdx = 0;
            for (j = 0; j < n - 1; j += 1) {
                if (arr[j] < minEl) {
                    minEl = arr[j];
                    minIdx = j;
                }
            }
            int temp = arr[j];
            arr[j] = arr[minIdx];
            arr[minIdx] = temp;
        }
    }
}