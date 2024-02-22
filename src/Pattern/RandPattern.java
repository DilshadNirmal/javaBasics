package Pattern;

public class RandPattern {
    public static void main(String[] args) {
        int length = 10;

        for (int i = 0; i < length / 2; i++) {
            for (int j = 0; j < length  - 1; j++) {
                if (i % 2 == 0) {
                    if (j % 2 == 0) {
                        System.out.print("*");
                    } else {
                        System.out.print(" ");
                    }
                }
                if (i % 2 != 0) {
                    if (j % 2 != 0) {
                        System.out.print("*");
                    } else {
                        System.out.print(" ");
                    }
                }
            } System.out.println();
        }
    }
    
    public static void printRandomPattern(int length) {
        for (int row = 0; row < length / 2; row++) {
            for (int col = 0; col < )
        }
    }
}
