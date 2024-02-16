package Basics;
public class IfElse {
    public static void main(String[] args) {
        int num1 = 6, num2 = 7;

        if (num1 == num2) {
            System.out.println("equal");
        } else {
            System.out.println("not equal");
        }

        if (num1 <= num2) {
            System.out.println("lesser than or equal");
        } else {
            System.out.println("greater than or equal");
        }

        String value = ((num1 < num2) && (num1 <= num2)) ? "true" : "false";
        System.out.println("the value in ternary operator is '" + value + "'");
    }
}
