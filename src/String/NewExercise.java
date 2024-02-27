package String;

public class NewExercise {
    public static void main(String[] args) {
        String anyString = "hello world";

        String replace = anyString.replace("world", "all");
        String[] reverse = anyString.split(" ");
        String underscore = anyString.replace(" ", "___");
        String[] randomSymbols = anyString.split("");

        System.out.println("after replace: " + replace);

        System.out.print("reversed: ");
        reverseLoop(reverse);
        
        System.out.println("added underscore: " + underscore);

        System.out.print("random symbols: ");
        loop(randomSymbols);
    }

    public static void reverseLoop(String[] sArr) {
        for (int i = sArr.length - 1; i >= 0; i--) {
            System.out.print(sArr[i] + " ");
        }System.out.println(" ");
    }

    public static void loop(String[] sArr) {
        for (int i = 0; i < sArr.length; i++) {
            if (i % 2 == 0) {
                System.out.print(sArr[i] + "_");
            } else {
                System.out.print(sArr[i] + "*");
            }
        }
    }
}
