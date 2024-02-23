package Sort;

public class MergeSort {
    public static void main(String[] args) {
        int[] array = {21, 9, 16, 2, 12, 11};

        mergeSort(array, 0, array.length - 1);

        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }

    }

    public static void merge(int[] arr, int l, int r, int mid) {

        int size = (mid - l) + 1;
        int size2 = r - mid;

        int[] lArr = new int[size];
        int[] rArr = new int[size2];

        for (int i = 0; i < size; i++) {
            lArr[i] = arr[l + i];
        }

        for (int i = 0; i < size2; i++) {
            rArr[i] = arr[mid + 1 + i];
        }

        int i = 0, j = 0, arrPos = l;

        while (i < size && j < size2) {
            if (lArr[i] <= rArr[j]) {
                arr[arrPos] = lArr[i];
                i++;
            } else {
                arr[arrPos] = rArr[j];
                j++;
            }
            arrPos++;
        }

        while (i < size) {
            arr[arrPos] = lArr[i];
            i++;
            arrPos++;
        }

        while (i < size2) {
            arr[arrPos] = rArr[j];
            j++;
            arrPos++;
        }
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

            merge(arr, l, r, m);
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
