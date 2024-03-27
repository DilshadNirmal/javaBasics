package TryWithMe.EmployeeCustomer;

import java.util.*;

public class SortOut {

    public void dataSheet(String name, String id, Map<String, String> newMap, int value) {

        System.out.println("Name: " + name + " - Id: " + id);
        getMap(newMap, value);
    }

    private void getMap(Map<String, String> newMap, int value) {

        List<String> date = new ArrayList<>(newMap.keySet());

        date.sort(null);
        Collections.reverse(date);

        if (value <= date.size()) {
            for (int i = 0; i < date.size(); i++) {
                if (i < value)
                    System.out.println(date.get(i) + "  :  " + newMap.get(date.get(i)));
            }
        } else {
            System.out.println("the required details can't be extractred");
        }

    }
}
