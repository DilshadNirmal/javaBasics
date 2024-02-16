package Basics;
public class Factorial {

    static int factorial(int number) {
        if (number == 1 || number == 0) {
            return 1;
        } else if (number > 1) {
            return number * factorial(number - 1);
        } else {
            return 0;
        }
    }
    public static void main(String[] args) {
        
        int factorial = 5;
        int result_1 = 1;
        int result_2 = 1;
        int result_3 = 1;
        
        for (int i = 1; i <= factorial; i++) {
            result_1 = result_1 * i;
        }
        
        int i = 1;

        while (i <= factorial) {
            result_2 = result_2 * i;
            i++;
        }

        i = 1;

        do {
            result_3 = result_3 * i;
            i++;
        } while(i <= factorial);


        System.out.println("from function");
        System.out.println(factorial(factorial));
        System.out.println("from forLoop");
        System.out.println(result_1);
        System.out.println("from whileLoop");
        System.out.println(result_2);
        System.out.println("from doWhileLoop");
        System.out.println(result_3);
    }
}
