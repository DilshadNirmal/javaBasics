package OOPS.Polymorphism;

public class PolyMain {
    public static void main(String[] args) {
        Arithmetic newOne = new Arithmetic(33, 33);

        System.out.println(newOne.add(300, 3, 23));
        System.out.println("get C: " + newOne.getC());
        System.out.println("not override: " + newOne.add());
        System.out.println("get C: " + newOne.getC());
    }
}
