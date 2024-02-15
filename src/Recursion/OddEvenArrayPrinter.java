package Recursion;

import java.util.Arrays;

public class OddEvenArrayPrinter {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6, 7, 6, 9};
        int[] array1 = {4, 6, 7, 6, 9};

        int[] oddArray = getOddNumbers(array, 0, new int[array.length], 0);
        int[] evenArray = getEvenNumbers(array, 0, new int[array.length], 0);
        getDuplicates(array1, 0, 0);

        System.out.println("Odd numbers: " + Arrays.toString(oddArray));
        System.out.println("Even numbers: " + Arrays.toString(evenArray));
    }

    public static int[] getOddNumbers(int[] arr, int index, int[] oddArr, int oddIndex) {
        if (index >= arr.length) {
            return Arrays.copyOf(oddArr, oddIndex);
        }

        if (arr[index] % 2 != 0) {
            oddArr[oddIndex++] = arr[index];
        }

        // System.out.println("from odd function: " + index);

        return getOddNumbers(arr, index + 1, oddArr, oddIndex);
    }

    public static int[] getEvenNumbers(int[] arr, int index, int[] evenArr, int evenIndex) {
        if (index >= arr.length) {
            return Arrays.copyOf(evenArr, evenIndex);
        }

        if (arr[index] % 2 == 0) {
            evenArr[evenIndex++] = arr[index];
        }

        // System.out.println("from even function: " + index);


        return getEvenNumbers(arr, index + 1, evenArr, evenIndex);
    }

    public static void getDuplicates(int[] arr, int index, int nextIndex) {

        if (nextIndex < arr.length - 1) {
            nextIndex = nextIndex + 1;
        } else {
            index = index + 1;
            nextIndex = index + 1;
        }

        System.out.println("function call index: " + index + " next index: " + nextIndex);
        
        if (index < arr.length - 1) {
            if (arr[index] == arr[nextIndex]) {
                System.out.println(arr[index]);
            }
            getDuplicates(arr, index, nextIndex);
        }
        
        System.out.println("function return index: " + index + " next index: " + nextIndex);
    }
}

