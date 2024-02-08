package Array;

import java.util.ArrayList;

public class OddOrEven {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 4, 8};
        ArrayList<Integer>[] result = numberFind(numbers);
        ArrayList<Integer>[] duplicate = duplicate(numbers);

        System.out.println("Odd numbers:");
        for (int number : result[0]) {
            System.out.print(number + " ");
        }

        System.out.println();

        System.out.println("Even numbers:");
        for (int number : result[1]) {
            System.out.print(number + " ");
        }

        System.out.println();

        System.out.println("Duplicate numbers:");
        for (int number : duplicate[0]) {
            System.out.print(number + " ");
        }
    }

    public static ArrayList<Integer>[] numberFind(int[] arr) {
        ArrayList<Integer> evenNumbers = new ArrayList<>();
        ArrayList<Integer> oddNumbers = new ArrayList<>();

        for (int number : arr) {
            if (number % 2 == 0) {
                evenNumbers.add(number);
            } else {
                oddNumbers.add(number);
            }
        }

        @SuppressWarnings("unchecked")
        ArrayList<Integer>[] result = new ArrayList[2];
        result[0] = oddNumbers;
        result[1] = evenNumbers;
        return result;
    }

    public static ArrayList<Integer>[] duplicate(int[] arr) {

        ArrayList<Integer> duplicate = new ArrayList<>();

        for (int index = 0; index < arr.length; index++) {
            for (int j = index + 1; j < arr.length; j++) {
                if (arr[index] == arr[j]) {
                    duplicate.add(arr[index]);
                }
            }
        }

        @SuppressWarnings("unchecked")
        ArrayList<Integer>[] duplicates = new ArrayList[1];
        duplicates[0] = duplicate;

        return duplicates;
    }
}
