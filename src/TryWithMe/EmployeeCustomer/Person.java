package TryWithMe.EmployeeCustomer;

public class Person {
    private String name, gender, dob, bloodGroup, phone;
    private Integer age;

    public Person(String name, String gender, String dob, String bloodGroup, String phone, Integer age) {
        this.name = name;
        this.gender = gender;
        this.dob = dob;
        this.bloodGroup = bloodGroup;
        this.phone = phone;
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }

    public void setBloodGroup(String bloodGroup) {
        this.bloodGroup = bloodGroup;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public String getGender() {
        return gender;
    }

    public String getDob() {
        return dob;
    }

    public String getBloodGroup() {
        return bloodGroup;
    }

    public String getPhone() {
        return phone;
    }

    public Integer getAge() {
        return age;
    }
}
