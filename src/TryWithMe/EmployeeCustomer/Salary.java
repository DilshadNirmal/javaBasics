package TryWithMe.EmployeeCustomer;

import java.util.HashMap;
import java.util.Map;

public class Salary extends Employee {

    private Map<String, String> salary = new HashMap<>();

    public Salary(String name, String gender, String dob, String bloodGroup, String phone, Integer age, String empId, String role, String branch, String account) {
        super(name, gender, dob, bloodGroup, phone, age, empId, role, branch, account);
    }

    public void setSalary(String date, String salary) {
        this.salary.put(date, salary);
    }

    public Map<String, String> getSalary() {
        return salary;
    }
}
