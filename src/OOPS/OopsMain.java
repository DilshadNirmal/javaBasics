package OOPS;

import OOPS.Inheritance.Multilevel.GrandFather;
import OOPS.Inheritance.Multilevel.Father;
import OOPS.Inheritance.Multilevel.Son;

public class OopsMain {
    public static void main(String[] args) {

        GrandFather grandpa = new GrandFather();
        Father father = new Father("Dilshad");
        Son son = new Son("nirmal");

        grandpa.setDob("30-12-2002");
        son.setAge(9);
        
        

        System.out.println(father.getName());
        System.out.println(son.getName());
        System.out.println(son.getAge());
    }
}
