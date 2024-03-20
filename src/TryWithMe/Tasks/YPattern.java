package TryWithMe.Tasks;

public class YPattern {
    public static void main(String[] args) {
        int n = 5;

        for (int length = 1; length <= n; length++) {
            for (int breadth = 1; breadth <= n; breadth++) {
                if((length==breadth && length<=n/2) || (length+breadth==n-breadth && length>=n/2) || (breadth==n/2 && length>=n/2))
                    System.out.print("* ");
                else
                    System.out.print("  ");
            }
            System.out.println();
        }

        System.out.println("------- from function ----------");
        yPattern(n);
    }

    static void yPattern(int n) {
        int mid = (n / 2) + 1;
        for (int length = 1; length <= n; length++) {
            for (int breadth = 1; breadth <= n; breadth++) {
                // if ( ((length == breadth) && (length <= mid)) || ((breadth == mid) && (length > mid)) || (breadth == n - length + 1 && length >= mid) ) {
                if ((breadth == mid && length <= mid) || (length == breadth && length > mid) || ((breadth == (n - length) + 1) && breadth > mid)) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
