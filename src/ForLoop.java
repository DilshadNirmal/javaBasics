public class ForLoop {
    public static void main(String[] args) {
        int[] array = {21, 19, 17, 18, 109, 200};
        int length = array.length;
        int total = 0;

        // loop forward
        for (int index = 0; index < length; index++) {
            int rev = length - (index + 1);
            System.out.println(index + ":" + array[rev]);
        }

        // loop backward
        for (int index = length - 1; index >= 0; index--) {
            System.out.println(index + ":" + array[index]);
            total += array[index];
        }

        System.out.println("the total value: " + total);

    }
}
