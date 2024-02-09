package Recursion;

public class BubSortRecursion {
    public static void main(String[] args) {
        int[] array = {5, 3, 2, 6, 1, 0, 4};

        int[] ascending = asc(array, 0, 0);
        int[] descending = des(array, 0, 0);

        System.out.println("Ascending order");
        for (int index = 0; index < array.length; index++) {
            System.out.print(ascending[index] + " ");
        }

        System.out.println();
        
        System.out.println("Descending order");
        for (int index = 0; index < array.length; index++) {
            System.out.print(descending[index] + " ");
        }
    }

    public static int[] asc(int[] arr, int i, int j) {

        if (j < arr.length - 1)
            j++;
        else {
            j = 0;
            i++;
        }

        if (j < arr.length && i < arr.length) {
            if (arr[i] < arr[j]) {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
            asc(arr, i, j);
        }

        return arr;
    }

    public static int[] des(int[] arr, int i, int j) {

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
            des(arr, i, j);
        }

        return arr;
    }
}
