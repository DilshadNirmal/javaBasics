package TaskOne;

public class Sum {
    Integer a, b;

    public Sum(Integer a, Integer b) {
        this.a = a;
        this.b = b;
    }

    @SuppressWarnings("unused")
    private Integer add() {
        return a + b;
    }

    public Integer add(Integer x, Integer y) {
        return x + y;
    }

    public static Float add(Float x, Float y) {
        return x + y;
    }

    // method overloading
    public Double add(Double x, Double y) {
        return x + y;
    }
}
