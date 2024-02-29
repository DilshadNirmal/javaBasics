package TaskOne;

public class ClassMain {
    public static void main(String[] args) {
        Sum obj1 = new Sum(4, 3);

        // Normal Method (objectName.methodName)
        print("sum: " + obj1.add(3, 3));
        // Static Method (className.StaticMethodName)
        print("static method: " + Sum.add(5.3f, 2.2f));

        SumType<Integer, Double> obj = new SumType<Integer, Double>(2, 3);

        print("from Type conversion: " + obj.add());
        print("from Type conversion: " + obj.add(3.2, 3.5));
    }

    public static void print(String someString) {
        System.out.println(someString);
    }
}
