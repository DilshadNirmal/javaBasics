package Sorting;

public class BubbleSort {
    public static void main(String[] args) {
        int[] array = {5, 3, 9, 7, 2, 6, 1, 8, 0, 4};

        bubbleSort(array);
    }

    public static void bubbleSort(int[] arr) {
        int n = arr.length;
        int iter = 1;
        for (int i = 0; i < n-1; i++) {  
            for (int j = 0; j < n-i-1; j++) {
                if (arr[j] > arr[j+1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
                System.out.println("number of iterations: " + iter);
                iter++;
             }
          }
        
        for (int index = 0; index < arr.length; index++) {
            System.out.println(arr[index]);
        }
    }
}
