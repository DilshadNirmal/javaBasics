package LogicImpl;

public class TwoPointerBitManip {
    public static void main(String[] args) {
        int[] array = {3, 6, 8, 12, 23};
        int value = 20;

        System.out.println(addTwoNumbers(array, value));
    }

    public static boolean addTwoNumbers(int[] array, int value) {

        boolean bool = false;
        int res = 0;

        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                /*
                 * if (arr[i] + arr[j] == val) {
                 *      return true;
                 * }
                 */
                if (array[i] != array[j]) { 
                    res = array[i] + array[j];
                    if (res == value) {
                        bool = true;
                    }
                }
            }
        }


        return bool;
    }
}
