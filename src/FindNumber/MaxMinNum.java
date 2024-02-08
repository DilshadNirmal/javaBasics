package FindNumber;

import java.util.Arrays;

public class MaxMinNum {
    public static void main(String[] args) {
        int[] arr = {5, 8, 0, 2, 4};

        Arrays.sort(arr);

        int min = arr[0];
        int max = arr[arr.length - 1];

        System.out.println("the minimum value is " + min);
        System.out.println("the maximum value is " + max);
    }
}
