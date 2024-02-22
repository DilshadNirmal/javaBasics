package Pattern;

public class RandPattern {
    public static void main(String[] args) {
        int length = 10;

        printRandomPattern(length);

        
    }
    
    public static void printRandomPattern(int length) {
        for (int row = 0; row < length / 2; row++) {
            for (int col = 0; col < length; col++) {
                if (row == 0 || row == length - 1 || col == 0 || col == length - 1) {
                    System.out.print("* ");
                } else {
                    // System.out.print(" ");
                    if (row % 2 == 0) {
                        if (col % 2 == 0) {
                        System.out.print("* ");
                    } else {
                        System.out.print("  ");
                    }
                    }
                    if (row % 2 != 0) {
                        if (col % 2 != 0) {
                            System.out.print("* ");
                        } else {
                            System.out.print("  ");
                        }
                    }
                }
            } System.out.println();
        }
    }
}
