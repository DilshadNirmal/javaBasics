package Pattern;

public class RandPattern {
    public static void main(String[] args) {
        int length = 15;

        printRandomPattern(length);

        for (int i = length - 1; i >= 0; i--) {
            for (int j = length - 1; j > i; j--) {
                System.out.print(" ");
            } System.out.print("*");
            for (int j = 1; j < (i * 2); j++) {
                System.out.print(" ");
            }
            if (i >= 1) {
                System.out.print("*");
            } System.out.println("");
        }

        
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
