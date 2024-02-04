public class FibonacciBest {
    public static void main(String[] args) {
        
        int[] arr = new int[6];
        arr[0] = 0;
        arr[1] = 1;

        int total = arr[0] + arr[1];

        for (int index = 2; index < arr.length; index++) {
            arr[index] = arr[index - 1] + arr[index - 2];
            total = total + arr[index];
        }

        for (int index = 0; index < arr.length; index++) {
            System.out.println(index + ":" + arr[index]);
        }

        System.out.println("total: " + total);
        
    }
}
