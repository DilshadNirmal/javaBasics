package TryWithMe.EmployeeCustomer;

public class Customer extends Person {
    private String cusId, account;

    public Customer(String name, String gender, String dob, String bloodGroup, String phone, Integer age, String cusId, String account) {
        super(name, gender, dob, bloodGroup, phone, age);
        this.cusId = cusId;
        this.account = account;
    }

    public void setCusId(String cusId) {
        this.cusId = cusId;
    }

    public void setAccount(String account) {
        this.account = account;
    }

    public String getCusId() {
        return cusId;
    }

    public String getAccount() {
        return account;
    }
}
