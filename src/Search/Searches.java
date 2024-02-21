package Search;

public class Searches {

    public static void main(String[] args) {
        int[] array = {3, 5, 6, 7, 8, 9};
        int find = 9;

        print("linear", linearSearch(array, find), find);        
        print("binary", binarySearch(array, find), find);    
        print("binary in Recursive", binaryRecursive(array, find, 0, array.length - 1), find);    

        
    }

    public static void print(String search, int result, int find) {
        if (result != -1) {
            System.out.println(search + " - " + find +" is found at index: " + result);
        } else {
            System.out.println(search + "- number not found");
        }
    }

    

    public static int linearSearch(int[] array, int find) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == find) {
                return i;
            }
        }

        return -1;
    }

    public static int binarySearch(int[] array, int find) {

        int left = 0, right = array.length - 1;

        while (left <= right) {
            int middle = (left + right) / 2;

            if (find == array[middle]) {
                return middle;
            } else if (find > array[middle]) {
                left = middle + 1;
            } else {
                right = middle - 1;
            }
        }

        return -1;
    }

    public static int binaryRecursive(int[] array, int find, int left, int right) {
        int middle = (left + right) / 2;
        int res;

        if (find == array[middle]) {
            return middle;
        } else if (find > array[middle]) {
            res = binaryRecursive(array, find, middle + 1, right);
        } else {
            res = binaryRecursive(array, find, left, middle - 1);
        }

        return res;
    }

}
