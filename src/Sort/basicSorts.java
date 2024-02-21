package Sort;

public class basicSorts {
    public static void main(String[] args) {
        int[] array = {21, 9, 16, 18, 17, 2};

        int[] bubbleSort = bubbleSort(array.clone());
        for (int i = 0; i < bubbleSort.length; i++) {
            System.out.println(bubbleSort[i]);
        }
    }

    public static int[] bubbleSort(int[] array) {
        for (int index = 0; index < array.length - 1; index++) {
            for (int innerIndex = 0; innerIndex < array.length - index - 1; innerIndex++) {
                if (array[innerIndex] > array[innerIndex + 1]) {
                    int temp = array[innerIndex];
                    array[innerIndex] = array[innerIndex + 1];
                    array[innerIndex + 1] = temp;
                }
            }
        }

        return array;
    }

    public static int[] selectionSort(int[] array) {
        
    }
}
