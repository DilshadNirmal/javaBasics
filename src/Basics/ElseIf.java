package Basics;
public class ElseIf {
    public static void main(String[] args) {
        int num1 = 6, num2 = 7;

        if (num1 == num2) {
            System.out.println("equal");
        } else if (num1 != num2) {
            System.out.println("not equal");
        } else if (num1 <= num2) {
            System.out.println("lesser than or equal");
        } else {
            System.out.println("greater than or equal");
        }
    }
}
