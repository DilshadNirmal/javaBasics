package TryWithMe.EmployeeCustomer;

public class EmpCusMain {
    public static void main(String[] args) {
        Salary employeeOne = new Salary("dilshad", "M", "26-02-2002", "O+", "3840257490", 43, "emp_01", "Technical Lead", "coimbatore", "092340328524");

        employeeOne.setSalary("12-06-2021", "4000000");
        employeeOne.setSalary("12-07-2021", "4000000");
        employeeOne.setSalary("12-08-2021", "4000000");
        employeeOne.setSalary("12-09-2021", "4000000");
        employeeOne.setSalary("12-10-2021", "4000000");
        employeeOne.setSalary("12-11-2021", "4000000");
        employeeOne.setSalary("12-12-2021", "4000000");

        Bills customerOne = new Bills("gowtham", "M", "30-12-2343", "b-", "504850324362", 453, "02432424", "932452345");

        customerOne.setPurchase("12-06-2021", "4000000");
        customerOne.setPurchase("12-07-2021", "4000000");
        customerOne.setPurchase("12-08-2021", "4000000");
        customerOne.setPurchase("12-09-2021", "4000000");
        customerOne.setPurchase("12-10-2021", "4000000");
        customerOne.setPurchase("12-11-2021", "4000000");
        customerOne.setPurchase("12-12-2021", "4000000");

        SortOut sortOut = new SortOut();

        sortOut.dataSheet(customerOne.getName(), customerOne.getCusId(), customerOne.getPurchase(), 3);
        sortOut.dataSheet(employeeOne.getName(), employeeOne.getEmpId(), employeeOne.getSalary(), 4);

    }
}
