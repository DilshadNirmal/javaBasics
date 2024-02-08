package Array;

import java.util.ArrayList;

public class OddOrEven {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 4, 8};
        ArrayList<ArrayList<Integer>> result = numberFind(numbers);
        ArrayList<ArrayList<Integer>> duplicate = duplicate(numbers);

        System.out.println("Odd numbers && Even numbers:");
        for (ArrayList<Integer> number : result) {
            System.out.print(number + " ");
        }

        System.out.println();

        System.out.println("Duplicate numbers:");
        for (ArrayList<Integer> number : duplicate) {
            System.out.print(number + " ");
        }
    }

    public static ArrayList<ArrayList<Integer>> numberFind(int[] arr) {
        ArrayList<Integer> evenNumbers = new ArrayList<>();
        ArrayList<Integer> oddNumbers = new ArrayList<>();

        for (int number : arr) {
            if (number % 2 == 0) {
                evenNumbers.add(number);
            } else {
                oddNumbers.add(number);
            }
        }

        ArrayList<ArrayList<Integer>> result = new ArrayList<>();
        result.add(oddNumbers);
        result.add(evenNumbers);
        return result;
    }

    public static ArrayList<ArrayList<Integer>> duplicate(int[] arr) {

        ArrayList<Integer> duplicate = new ArrayList<>();

        for (int index = 0; index < arr.length; index++) {
            for (int j = index + 1; j < arr.length; j++) {
                if (arr[index] == arr[j]) {
                    duplicate.add(arr[index]);
                }
            }
        }

        ArrayList<ArrayList<Integer>> duplicates = new ArrayList<>();
        duplicates.add(duplicate);

        return duplicates;
    }
}
