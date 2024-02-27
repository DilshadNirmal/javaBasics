package String;

public class StringRepeat {
    public static void main(String[] args) {
        String useString = "hello world all";
        String useString2 = "hello world";

        logic(useString);
        System.out.println("-------------");
        logic(useString2);
    }

    public static void logic(String someString) {
        String[] sArr = someString.split(" ");

        for (int i = 0; i < sArr.length; i++) {
            for (int j = 0; j < sArr.length - i; j++) {
                System.out.print(sArr[i] + " ");
            } System.out.println();
        }
    }
}




