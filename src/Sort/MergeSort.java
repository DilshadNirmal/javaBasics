package Sort;

public class MergeSort {
    public static void main(String[] args) {
        int[] array = {3, 4, 5, 6, 7, 8};

        mergeSort(array, 0, array.length - 1);

    }

    public static void mergeSort(int[] arr, int l, int r) {
        if (l < r) {
            int m = (l + r) / 2;
            mergeSort(arr, l, m);
            System.out.println("every separation from left to mid");
            printArray(arr, l, m);
            mergeSort(arr, m + 1, r);
            System.out.println("every separation from mid to right");
            printArray(arr, m + 1, r);
        }
    }
    
    public static void printArray(int[] arr, int l, int r) {
        System.out.print("Array from " + l + " to " + r + ": ");
        for (int i = l; i <= r; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}
