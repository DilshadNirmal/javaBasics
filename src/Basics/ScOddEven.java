package Basics;
public class ScOddEven {
    public static void main(String[] args) {
        int num = 43587;
        int value = num % 2;

        switch (value) {
            case 1:
                System.out.println("number is odd");
                break;
            case 0:
                System.out.println("number is even");
                break;
        
            default:
                break;
        }
    }
}
