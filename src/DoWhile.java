public class DoWhile {
    public static void main(String[] args) {
        int[] array = {8, 9, 21, 19, 16, 29, 36, 77};

        int index = -1;
        do {
            index++;
            System.out.println(array[index]);
        } while(index < array.length - 1);
    }
}
