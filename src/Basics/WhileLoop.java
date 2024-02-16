package Basics;
public class WhileLoop {
    public static void main(String[] args) {
        int[] array = {8, 9, 21, 19, 16};
        int length = array.length - 1;

        while(length >= 0) {
            if ((length % 2 == 0) && (length > 0)) {
                System.out.println(length + ":" + array[length]);
            }
            length = length - 2;
        }

        // efficient
        length = array.length - 1;
        while (length >= 0) {
            System.out.println(length + "::" + array[length]);
            length -= 2;
        }
    }
}
