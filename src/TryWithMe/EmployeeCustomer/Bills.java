package TryWithMe.EmployeeCustomer;

import java.util.HashMap;
import java.util.Map;

public class Bills extends Customer {
    private Map<String, String> purchase = new HashMap<>();

    public Bills(String name, String gender, String dob, String bloodGroup, String phone, Integer age, String cusId, String account) {
        super(name, gender, dob, bloodGroup, phone, age, cusId, account);
    }

    public void setPurchase(String date, String amount) {
        this.purchase.put(date, amount);
    }

    public Map<String, String> getPurchase() {
        return purchase;
    }
}
