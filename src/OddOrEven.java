import java.util.Scanner;

public class OddOrEven {
    public static void main(String[] args) {
        
        System.out.println("enter a number: ");
        Scanner input = new Scanner(System.in);

        int num = input.nextInt();
        input.close();

        if (!(num % 2 == 0)) {
            System.out.println("entered number is odd");
        } else {
            System.out.println("entered number is even");
        }

    }
}
