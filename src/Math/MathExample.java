package Math;

import java.util.Random;

public class MathExample {
    public static void main(String[] args) {
        Integer a = -23;
        Double c = 21.7, d = 11.2;

        print("Abs: " + Math.abs(a));
        print("Abs: " + Math.abs(a));
        print("ceil: " + Math.ceil(c));
        print("floor: " + Math.floor(c));
        print("round: " + Math.round(c));
        print("round: " + Math.round(c));
        print("sqrt: " + Math.sqrt(c));
        print("max: " + Math.max(c, d));
        print("min: " + Math.min(c, a));
        print("random: " + Math.random());
        print("pow: " + Math.pow(c, a));
        print("exp: " + Math.exp(c));

        Random randNum = new Random();
        print("random number: " + randNum.nextDouble(0.99, 999.99));
    }

    public static void print(String someString) {
        System.out.println(someString);
    }
}
