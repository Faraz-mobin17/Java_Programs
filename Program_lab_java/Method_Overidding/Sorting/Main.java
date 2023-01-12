package Method_Overidding.Sorting;

import javax.swing.SortOrder;

public class Main {
    public static void main(String[] args) {
        System.out.println();
        int[] arr = {3,4,5,1,1,9,2};
        int n = arr.length;
        // Parent p = new Parent();
        Child c = new Child();
        c.sort(arr,n);
        System.out.println("Array before sort");    
        for (int i =0; i < arr.length; ++i) {
            System.out.println(arr[i]);
        }
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
        for (int i = 0; i < arr.length;++i) {
            System.out.println(arr[i]);
        }
    }
}

class Child  {
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
        for (int z = 0; i < arr.length;++i) {
            System.out.println(arr[z]);
        }
    }
}