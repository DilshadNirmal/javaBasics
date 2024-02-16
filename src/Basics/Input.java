package Basics;
import java.util.Scanner;

public class Input {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int num1 = input.nextInt();
        int num2 = input.nextInt();
        input.close();
        // int num3 = input.nextInt();
        // int num4 = input.nextInt();
        // int num5 = input.nextInt();

        // System.out.println("number 1: " + num1);
        // System.out.println("number 2: " + num2);
        // System.out.println("number 3: " + num3);
        // System.out.println("number 4: " + num4);
        System.out.println("additon: " + (num1 + num2));
        System.out.println("subtraction: " + (num1 - num2));
        System.out.println("multiplication: " + (num1 * num2));
        System.out.println("division: " + (num1 / num2));

    }
}
