package ArrayList;

import java.util.ArrayList;

public class ArrayListObjects {
    public static void main(String[] args) {
        
        ArrayList<PersonId> per = new ArrayList<PersonId>();

        PersonId p = new PersonId("name", "male", 22);
        PersonId p1 = new PersonId("kiran", "male", 22);
        PersonId p2 = new PersonId("gowtham", "male", 22);
        PersonId p3 = new PersonId("kishore", "male", 22);

        per.add(p);
        per.add(p1);
        per.add(p2);
        per.add(p3);
        per.add(new PersonId("dil", "male", 22));

        System.out.println("from traditional for loop");
        for (int i = 0; i < per.size(); i++) {
            PersonId person = per.get(i);

            System.out.println("---------");
            System.out.println("name: " + person.getName());
            System.out.println("male: " + person.getGender());
            System.out.println("age: " + person.getAge());
        }System.out.println();

        System.out.println("from for");
        for (PersonId person : per) {
            System.out.println("---------");
            System.out.println("name: " + person.getName());
            System.out.println("male: " + person.getGender());
            System.out.println("age: " + person.getAge());
        }System.out.println();

        System.out.println("from Each");
        per.forEach(person -> {
            System.out.println("---------");
            System.out.println("name: " + person.getName());
            System.out.println("male: " + person.getGender());
            System.out.println("age: " + person.getAge());
        });

    }
}
