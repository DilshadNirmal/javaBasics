package Search;

public class TernarySearch {
    public static void main(String[] args) {
        int[] array = {4, 5, 6, 7, 8, 9, 10, 12};
        int find = 12;

        print("Ternary", ternarysearch(array, find), find);
        print("ternary in recursion", ternaryInRecursive(array, find, 0, array.length - 1), find);
    }

    public static void print(String search, int result, int find) {
        if (result != -1) {
            System.out.println(search + " - " + find +" is found at index: " + result);
        } else {
            System.out.println(search + "- number not found");
        }
    }

    public static int ternarysearch(int[] array, int find) {
        
        int left = 0, right = array.length - 1;
        int iter = 0;

        while (left < right) {

            int lMid = left + (right - left) / 3, rMid = right - (right - left) / 3;
            System.out.println("value of lmid: " + lMid + " and rmid: " + rMid + " at iteration: " + iter);

            if (find == array[lMid]) {
                return lMid;
            }

            if (find == array[rMid]) {
                return rMid;
            }

            if (array[lMid] > find) {
                right = lMid - 1;
            } else if (array[rMid] < find) {
                left = rMid + 1;
            } else {
                left = rMid + 1;
                right = lMid - 1;
            }

            iter++;
            
        }

        return -1;
    }

    public static int ternaryInRecursive(int[] array, int find, int left, int right) {
        
        if (left > right) {
            return -1; 
        }
        
        int lMid = left + (right - left) / 3, rMid = right - (right - left) / 3;

        if (find == array[lMid]) {
            return lMid;
        }

        if (find == array[rMid]) {
            return rMid;
        }

        if (array[lMid] > find) {
            return ternaryInRecursive(array, find, left, lMid - 1);
        } else if (array[rMid] < find) {
            return ternaryInRecursive(array, find, rMid + 1, right);
        } else {
            return ternaryInRecursive(array, find, rMid + 1, lMid - 1);
        }
    }

}
