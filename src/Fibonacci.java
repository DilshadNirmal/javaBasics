public class Fibonacci {

    
    public static void main(String[] args) {

        int fibonacci = 5;
        int firstNum = 0;
        int secNum = 1;
        int mind = 0;
        int total = 0;

        for (int index = 0; index <= fibonacci; index++) {
            mind = firstNum + secNum;
            System.out.println(firstNum);
            total += firstNum;

            firstNum = secNum;
            secNum = mind;
            
        }

        System.out.println("sum of fibonacci numbers: " + total);
        
        int r = 0;
        mind = 0;
        total = 0;
        firstNum = 0;
        secNum = 1;
        
        while (r <= fibonacci) {
            mind = firstNum + secNum;
            System.out.println(firstNum);
            total += firstNum;
    
            firstNum = secNum;
            secNum = mind;

            r++;
        }

        System.out.println("sum of fibonacci numbers: " + total);
    }
}
