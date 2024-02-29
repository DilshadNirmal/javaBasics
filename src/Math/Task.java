package Math;

public class Task {
    public static void main(String[] args) {
        Integer negNum = -217, posNum = 317, d = 99;
        Double a = 37.5, b = 22.3, c = 31.6;

        Integer[] arr = {21, 17, 13, 113, 119};
        findPrimeNumber(arr);
        print("------------");
        
        simplestFormRatio(80, 75);
        simplestFormRatio(3200, 2560);
        print("------------");

        print("negative to positive: " + Math.abs(negNum));
        print("positive to negative : " + Math.negateExact(posNum));
        print("added numbers: " + sum(a, b, c, d));
    }

    public static void print(String someString) {
        System.out.println(someString);
    }

    public static int sum(Double a, Double b, Double c , Integer d) {
        Double sum = Math.floor(a) + Math.floor(b) + Math.floor(c) + d;
        Integer value = (int)Math.round(sum);
        return value;
    }

    public static void findPrimeNumber(Integer[] arr) {
        for (int i : arr) {
            if (isPrime(i)) {
                print(i + " is a prime number");
            } else {
                print(i + " is not a prime number");
            }
        }

    }

    public static boolean isPrime(int num) {
        if (num <= 1) {
            return false;
        }
        
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }

        return true;
    }

    public static void simplestFormRatio(Integer ante, Integer cons) {
        Integer gcf = findGcf(ante, cons);

        print("Simplest form for given ratio is using gcf " + gcf + " => " + Math.divideExact(ante, gcf) + ":" + Math.divideExact(cons, gcf));
    }

    public static int findGcf(int x, int y) {
        while(y != 0) {
            int temp = y;
            y = x % y;
            x = temp;
        }

        return x;
    }
}
