package Basics;
public class SwitchCase {
    public static void main(String[] args) {
        
        char grade = 'C';

        switch (grade) {
            case 'A':
                System.out.println("first grade");
                break;
            case 'B':
                System.out.println("second grade");
                break;
            case 'C':
                System.out.println("third grade");
                break;
        
            default:
                break;
        }
    }
}
