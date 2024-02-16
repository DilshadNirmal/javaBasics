package Basics;
import java.util.Scanner;

public class Methods {
    public static void main(String[] args) {
        /**
         * access modifier 
         * -> public - everywhere
         * -> private - inside the class
         * -> protected - inside package
         * static - withour object creation
         * void - nothing / empty
         * main - method name
         * (args) - arguments passed as parameter
         */

        Scanner object = new Scanner(System.in);
        System.out.println("enter two numbers: ");
        int num1 = object.nextInt();
        int num2 = object.nextInt();
        System.out.println("enter the operator: ");
        char oper = object.next().charAt(0);
        object.close();

        Arithmetic operation = new Arithmetic();

        float result = 0;

        switch (oper) {
            case '+':
                result = operation.add(num1, num2);
                break;
            case '-':
                result = operation.sub(num1, num2);
                break;
            case '*':
                result = operation.mul(num1, num2);
                break;
            case '/':
                result = operation.div(num1, num2);
                break;
            case '%':
                result = operation.add(num1, num2);
                break;
        
            default:
                break;
        }

        System.out.println(result);
        
    }
}
