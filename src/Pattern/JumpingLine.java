package Pattern;

public class JumpingLine {
    public static void main(String[] args) {
        int w = 60, h = 19;
        int jumpWidth = h - 2;
        int jumpMid = jumpWidth / 2;

        if (h % 2 == 1) {
            int midH = (h / 2);
            int jumpLeft = 0, jumpRight = jumpWidth;

            for (int i = 0; i < h; i++) {
                for (int j = 0; j < w; j++) {

                    int starLocation = j % jumpWidth;

                    // mid line
                    if (midH == i) {
                        System.out.print("-");
                    } else if (starLocation == jumpLeft || starLocation == jumpRight) {
                        System.out.print("*");
                    } else if (i == 0 || i == h -1 || j == 0 || j == w - 1) {
                        System.out.print("^");
                    } else {
                        System.out.print(" ");
                    }
                } System.out.println();

                if (jumpMid > (i % h) && midH != i) {
                    jumpLeft++;
                    jumpRight--;
                } else if (midH != i && (midH - 1) != i) {
                    jumpLeft--;
                    jumpRight++;
                }
            }
        } else {
            System.out.println("It's an even number");
        }
    }
}
