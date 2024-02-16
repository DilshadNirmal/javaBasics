package OOPS;

import OOPS.Inheritance.Single.Father;
import OOPS.Inheritance.Single.Son;

public class OopsMain {
    public static void main(String[] args) {

        Father father = new Father("Dilshad");
        Son son = new Son("nirmal");

        son.setAge(9);

        System.out.println(father.getName());
        System.out.println(son.getName());
        System.out.println(son.getAge());
    }
}
