package String;

public class StringExercise {
    public static void main(String[] args) {
        String anyString = "hello world";

        try {
            int c = 0/0;
            System.out.println(c);
        } catch (Exception e) {
            e.printStackTrace();
        }

        System.out.println(findDuplicate(anyString));
    }

    public static String findDuplicate(String s) {
        String response = "";

        for (int i = 1; i < s.length(); i++) {
            if (s.substring(i).contains(s.substring(i - 1, i))) {
                if (!response.contains(s.substring(i - 1, i))) {
                    response = response.concat(s.substring(i - 1, i));
                }
            }
        }

        return response;
    }
}
