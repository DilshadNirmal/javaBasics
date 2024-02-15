package OOPS.Polymorphism;

/**
 * polymorphism has two types
 * -> overload
 *   |-> constructor overloading
 *   |-> method overloading
 * -> override
 */

public class Arithmetic extends SimpleMath {

    int a, b, c;
    String name;
    float percentage;

    // constructor overloading
    public Arithmetic(int a, int b) {
        super(a, b);
        this.a = a;
        this.b = b;
    }

    // public Arithmetic(int a) {
    //     this.a = a;
    // }

    // public Arithmetic(String name) {
    //     this.name = name;
    // }

    // public Arithmetic(float percentage) {
    //     this.percentage = percentage;
    // }

    // method overloading - same function name different arguments
    public int add(int a, int b) {
        return a + b;
    }

    public int add(int a, int b, int c) {
        return a + b + c;
    }

    @Override
    public int add() {
        super.add();
        return a + b + a;
    }
}
