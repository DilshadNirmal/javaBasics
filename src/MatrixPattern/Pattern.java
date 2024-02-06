package MatrixPattern;

public class Pattern {
    public static void main(String[] args) {
        
        for (int row = 0; row < 4; row++) {
            for (int col = 0; col < 4; col++) {
                if (row == col) {
                    System.out.print("* ");
                } else {
                    System.out.print(". ");
                }
            } System.out.println("");
        }

    }
}
