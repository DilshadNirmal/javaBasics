package TryWithMe.EmployeeCustomer;

public class Employee extends Person {
    private String empId, role, branch, account;

    public Employee(String name, String gender, String dob, String bloodGroup, String phone, Integer age, String empId, String role, String branch, String account) {
        super(name, gender, dob, bloodGroup, phone, age);
        this.empId = empId;
        this.role = role;
        this.branch = branch;
        this.account = account;
    }

    public void setEmpId(String empId) {
        this.empId = empId;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public void setBranch(String branch) {
        this.branch = branch;
    }

    public void setAccount(String account) {
        this.account = account;
    }

    public String getEmpId() {
        return empId;
    }

    public String getRole() {
        return role;
    }

    public String getBranch() {
        return branch;
    }
    public String getAccount() {
        return account;
    }
}
