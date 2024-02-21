package Pattern;

public class SquareVertices {
    public static void main(String[] args) {
        int value = 5;

        squareVertices(value);
        squareInRec(value, 0, 0);
        arrowRec(value, 0, 0);
    }

    public static void squareVertices(int value) {
        int row = 0;
        while (row < value) {
            int col = 0;
            while (col < value) {
                if (row == 0 || row == value - 1 || col == 0 || col == value - 1) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
                col+= 1;
            } 
            System.out.println("");
            row+=1;
        }
    }

    public static int squareInRec(int value, int row, int col) {
        // int res = 0;
        if (row < value) {
            if (col < value) {
                if (row == 0 || row == value - 1 || col == 0 || col == value - 1) {
                    System.out.print("*");
                }
                else {
                    System.out.print(" ");
                }
                // res = squareInRec(value, row, col + 1);
                return squareInRec(value, row, col + 1);
            }
            System.out.println("");
            // res = squareInRec(value, row + 1, 0);
            return squareInRec(value, row + 1, 0);
        }
        return 0;
    }

    public static int arrowRec(int value, int row, int col) {

        if (row < value) {
            if (col < value) {
                if (row == value - 1 || row + col == value - 1 || col == 0) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
                return arrowRec(value, row, col + 1);
            }
            System.out.println("");
            return arrowRec(value, row + 1, 0);
        }

        return 0;
    }

}
