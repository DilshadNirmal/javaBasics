package ArrayList;

import java.util.ArrayList;

public class ArrayListTopic {
    public static void main(String[] args) {
        ArrayList<Integer> intArr = new ArrayList<Integer>();
        intArr.add(12);
        intArr.add(34);
        intArr.add(19);
        intArr.add(29);

        System.out.println("---- before adding elements using index ------");
        arrayPrint(intArr);

        System.out.println("---- after adding elements using specific index ------");
        intArr.add(1, 55);
        arrayPrint(intArr);

        System.out.println("---- after removing elements using specific index ------");
        intArr.remove(3);
        arrayPrint(intArr);

        System.out.println("---- after removing all ------");
        intArr.clear();
        intArr.add(0, 1);
        arrayPrint(intArr);

        System.out.println("----------");

        intArr.add(23);
        intArr.add(99);
        intArr.add(89);
        intArr.add(79);

        System.out.println("Is empty check: " + intArr.isEmpty());
        System.out.println("Array list size: " + intArr.size());
        System.out.println("Find Index of 11: " + intArr.indexOf(11));
        System.out.println("Find Index of 1: " + intArr.indexOf(1));
        System.out.println("contains 1: " + intArr.contains(1));
    }

    public static void arrayPrint(ArrayList<Integer> arr) {
        for (int i = 0; i < arr.size(); i++) {
            System.out.println(arr.get(i));
        }
    }
}
