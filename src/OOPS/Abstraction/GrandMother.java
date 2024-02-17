package OOPS.Abstraction;

public abstract class GrandMother {
    String name;

    public GrandMother(String name) {
        this.name = name;
    }

    void setName(String name) {
        this.name = name;
    }

    String getName() {
        return name;
    }

    abstract String getAge(String dob);
}
