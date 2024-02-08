package TwoDimensionalArray;

public class TwoDimensionalArray {
    public static void main(String[] args) {
        
        int[][] TwoDArray = { {3, 5, 6}, {6, 9, 7}, {2, 8, 0} };

        System.out.println("printing array normally");
        forwardPrint(TwoDArray);
        System.out.println("printing array with reverse row");
        rowReverse(TwoDArray);
        System.out.println("printing array with reverse column");
        colReverse(TwoDArray);
        System.out.println("printing array with reverse row and reverse column");
        rowAndColReverse(TwoDArray);

    }

    public static void forwardPrint(int[][] array) {
        for (int row = 0; row < array.length; row++) {
            for (int col = 0; col < array[row].length ; col++) {
                System.out.print(array[row][col] + " ");
            } System.out.println();
        }
    }

    public static void rowReverse(int[][] array) {
        for (int row = array.length - 1; row >= 0; row--) {
            for (int col = 0; col < array[row].length ; col++) {
                System.out.print(array[row][col] + " ");
            } System.out.println();
        }
    }

    public static void colReverse(int[][] array) {
        for (int row = 0; row < array.length; row++) {
            for (int col = array[row].length - 1; col >= 0; col--) {
                System.out.print(array[row][col] + " ");
            } System.out.println();
        }
    }

    public static void rowAndColReverse(int[][] array) {
        for (int row = array.length - 1; row >= 0; row--) {
            for (int col = array[row].length - 1; col >= 0 ; col--) {
                System.out.print(array[row][col] + " ");
            } System.out.println();
        }
    }
}
