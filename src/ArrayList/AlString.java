package ArrayList;

import java.util.ArrayList;

public class AlString {
    public static void main(String[] args) {
        ArrayList<String> stringAl = new ArrayList<>();

        stringAl.add("nothing");
        stringAl.add("phone");
        stringAl.add("watch");
        stringAl.add("👂🪷");
        stringAl.add("🧣📿");

        OddOrEven<String> forString = new OddOrEven<String>(stringAl);

        forString.print(stringAl);
    }
}
