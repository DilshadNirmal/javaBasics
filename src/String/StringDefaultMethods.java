package String;

public class StringDefaultMethods {
    public static void main(String[] args) {
        String someString = "hi mom";

        print("length: " + someString.length());
        print("length: " + someString.toCharArray().length);
        print("replace: " + someString.replace("mom", "dad"));
        print("subString: " + someString.substring(0, 3));
        print("concat: " + someString.concat(", love you"));
        print("split: " + someString.split(" ")[0] + " " + someString.split(" ")[1]);
        print("trim: " + someString.trim());
        print("indexOf: " + someString.indexOf('m'));
        print("uppercase: " + someString.toUpperCase());
        print("lowercase: " + someString.toLowerCase());

        String[] stringArray = someString.split(" ");
        char[] charArray = someString.toCharArray();

        for (int i = 0; i < stringArray.length; i++) {
            print("index: " + i + " " + stringArray[i]);
        }

        for (int i = 0; i < charArray.length; i++) {
            print("index: " + i + " " + charArray[i]);
        }
    }

    static void print(String someValue) {
        System.out.println(someValue);
    }
}
