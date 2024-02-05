public class Palindrome {
    public static void main(String[] args) {
        
        String input = "madam";
        String reverse = "";

        for (int index = input.length() - 1; index >= 0; index++) {
            reverse = reverse + input.charAt(index);
        }

        System.out.println(input + " " + reverse);

        if (input.equals(reverse)) {
            System.out.println(input + " is a palindrome");
        } else {
            System.out.println(input + " is not a palindrome");
        }
        
    }
}
