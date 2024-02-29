package Math;

public class IntegerDouble {
    public static void main(String[] args) {
        Integer age1 = 78;

        String s = age1.toString();
        Double d = age1.doubleValue();
        String pincode = "625526";
        Integer pin = Integer.parseInt(pincode);

        System.out.println(Integer.max(26, 66));
        System.out.println(Integer.min(26, 66));
        System.out.println(Integer.sum(26, 66));

        Integer num = 912;
        System.out.println(Integer.reverse(num));

        int ageInt = 77;
        String ageStr = "" + ageInt;

        System.out.println("int to str: " + ageStr);
    }
}
