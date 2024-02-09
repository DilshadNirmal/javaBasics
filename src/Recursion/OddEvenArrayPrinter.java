package Recursion;

import java.util.Arrays;

public class OddEvenArrayPrinter {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9};

        int[] oddArray = getOddNumbers(array, 0, new int[array.length], 0);
        int[] evenArray = getEvenNumbers(array, 0, new int[array.length], 0);

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

        return getOddNumbers(arr, index + 1, oddArr, oddIndex);
    }

    public static int[] getEvenNumbers(int[] arr, int index, int[] evenArr, int evenIndex) {
        if (index >= arr.length) {
            return Arrays.copyOf(evenArr, evenIndex);
        }

        if (arr[index] % 2 == 0) {
            evenArr[evenIndex++] = arr[index];
        }

        return getEvenNumbers(arr, index + 1, evenArr, evenIndex);
    }
}

