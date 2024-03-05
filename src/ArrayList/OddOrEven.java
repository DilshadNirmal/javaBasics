package ArrayList;

import java.util.ArrayList;

public class OddOrEven<T> {
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

    ArrayList<T> array;

    public OddOrEven(ArrayList<T> arr) {
        array = arr;
    }

    public ArrayList<Integer> oddArray() {
        return oddAndEven(true);
    }

    public ArrayList<Integer> evenArray() {
        return oddAndEven(false);
    }

    public ArrayList<Integer> oddAndEven(Boolean isOdd) {
        ArrayList<Integer> res = new ArrayList<>();

        for (int i = 0; i < array.size(); i++) {
            if (oddOrEven(array.get(i)) && isOdd) {
                res.add((int)array.get(i));
            } else if (isOdd == false && !oddOrEven(array.get(i))) {
                res.add((int)array.get(i));
            }
        }

        return res;
    }

    public boolean oddOrEven(T t) {

        if ((int)t % 2 != 0) {
            return true;
        }

        return false;
    }

    public void print(ArrayList<T> arr) {
        for (int i = 0; i < arr.size(); i++) {
            System.out.println(arr.get(i));
        }
    }
}
