package Recursion;

public class BubSortRecursion {
    public static void main(String[] args) {
        int[] array = {5, 3, 2, 6, 1, 0, 4};

        int[] Ascending = BubSortAsc(array, 0, 0);

        for (int index = 0; index < array.length; index++) {
            System.out.print(Ascending[index] + " ");
        }
    }

    public static int[] BubSortAsc(int[] arr, int i, int j) {

        if (j < arr.length - 1)
            j++;
        else {
            j = 0;
            i++;
        }

        if (j < arr.length && i < arr.length) {
            if (arr[i] > arr[j]) {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
            BubSortAsc(arr, i, j);
        }

        return arr;
    }
}
