package OOPS.Abstraction;

public class Mother extends GrandMother {
    public Mother(String name) {
        super(name);
    }

    @Override
    String getAge(String dob) {
        
        return dob;
    }
}
