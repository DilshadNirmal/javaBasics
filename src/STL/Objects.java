package STL;

import java.util.HashMap;
import java.util.Map;

public class Objects {
    public static void main(String[] args) {
        Map<String, String> newMap = new HashMap<String, String>();

        newMap.put("name", "satoru gojo");

        Map<String, Integer> newMap1 = new HashMap<String, Integer>();

        newMap1.put("age", 25);

        System.out.println(newMap.get("name"));
        System.out.println(newMap1.get("age"));
        System.out.println(newMap.keySet());
        System.out.println(newMap1.keySet());
    }
}
