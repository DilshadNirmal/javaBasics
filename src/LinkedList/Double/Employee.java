package LinkedList.Double;

public class Employee {
    String name, empId, dob, gender, phone, address, role;

    public Employee(String name, String empId, String dob, String gender, String phone, String address, String role) {
        this.name = name;
        this.empId = empId;
        this.dob = dob;
        this.gender = gender;
        this.phone = phone;
        this.address = address;
        this.role = role;
    }

    public String getName() {
        return name;
    }

    public String getEmpId() {
        return empId;
    }

    public String getDob() {
        return dob;
    }

    public String getGender() {
        return gender;
    }

    public String getPhone() {
        return phone;
    }

    public String getAddress() {
        return address;
    }

    public String getRole() {
        return role;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setEmpId(String empId) {
        this.empId = empId;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }
    
    public void setPhone(String phone) {
        this.phone = phone;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setRole(String role) {
        this.role = role;
    }
}
