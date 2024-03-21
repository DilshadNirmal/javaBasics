package TryWithMe.Tasks;

public class YPattern {
    public static void main(String[] args) {
        int n = 5;

        System.out.println("------- Traditional Y ----------");
        yPattern(n);
        System.out.println("------- Y counter clockwise 1 ----------");
        yPatternCounterClock1(n);

    }

    static void yPattern(int n) {
        int mid = (n / 2) + 1;
        for (int length = 1; length <= n; length++) {
            for (int breadth = 1; breadth <= n; breadth++) {
                if ((breadth == mid && length >= mid) || (breadth == length && length < mid) || ((breadth == (n - length) + 1) && breadth > mid)) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    static void yPatternCounterClock1(int n) {
        int mid = (n / 2) + 1;
        for (int length = 1; length <= n; length++) {
            for (int breadth = 1; breadth <= n; breadth++) {
                if (length == mid && breadth >= mid || length == breadth && breadth < mid || length == (n - breadth) + 1 && length > mid) {
                    System.out.print("*  ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}
