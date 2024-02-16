package Basics;
public class FibonacciArray {
    public static void main(String[] args) {

        int fib = 6;
        int[] array = new int[fib + 1];

        int index = 0;
        int firstNum = 0;
        int secNum = 1;
        int mind, total = 0;

        while (index <= fib) {
            mind = firstNum + secNum;
            array[index] = firstNum;

            firstNum = secNum;
            secNum = mind;

            index++;
        }

        index = 0;

        do {
            total = total + array[index];
            System.out.println(index + ":" + array[index]);
            index++;
        } while(index <= fib);

        System.out.println("sum of the fibonacci series: " + total);

    }
}
