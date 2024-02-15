package OOPS.Inheritance.Single;

import OOPS.Inheritance.Multilevel.Father;

public class Son extends Father {

    int age;

    public Son(String name) {
        super(name); // Father(String name)
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return this.age;
    }

}
