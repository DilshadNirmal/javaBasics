package ArrayList;

import java.util.ArrayList;

public class OddOrEven {
    public ArrayList<ArrayList<Integer>> FindOdrEv(ArrayList<Integer> arr) {
        ArrayList<Integer> oddArr = new ArrayList<>();
        ArrayList<Integer> evenArr = new ArrayList<>();

        for (Integer i : arr) {
            if (i % 2 == 0) {
                evenArr.add(i);
            } else {
                oddArr.add(i);
            }
        }

        ArrayList<ArrayList<Integer>> result = new ArrayList<>();
        result.add(evenArr);
        result.add(oddArr);

        return result;
    }

    public ArrayList<Integer> returnOdd(ArrayList<ArrayList<Integer>> result) {
        ArrayList<Integer> oddArr = result.get(1); 
        return oddArr;
    }

    public ArrayList<Integer> returnEven(ArrayList<ArrayList<Integer>> result) {
        ArrayList<Integer> EvenArr = result.get(0); 
        return EvenArr;
    }
}
