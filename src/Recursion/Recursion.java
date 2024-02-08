package Recursion;

public class Recursion {
    public static void main(String[] args) {
        int[] array = {3, 5, 6};
        recursion(array, 0);
        reverseRecursion(array, 2);
    }

    public static int recursion(int[] arr, int index) {
        if (index < arr.length) {
            System.out.println(arr[index]);
            recursion(arr, ++index);
        }

        return index;
    }

    public static int reverseRecursion(int[] arr, int index) {
        if (index >= 0) {
            System.out.println(arr[index]);
            reverseRecursion(arr, --index);
        }
        return index;
    }
}
