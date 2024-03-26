package TryWithMe.IntHeap;

import java.util.ArrayList;

public class HeapImpl {
    public static void main(String[] args) {
        ArrayList<Integer> og = new ArrayList<>();

        og.add(32);
        og.add(43);
        og.add(21);
        og.add(12);
        og.add(19);
        og.add(46);
        og.add(34);
        og.add(3);
        og.add(54);
        og.add(38);
        og.add(46);
        og.add(4);
        og.add(6);
        og.add(6);
        og.add(9);

        System.out.println("-------- og array ---------");
        for (int index = 0; index < og.size(); index++) {
            System.out.println(index + " : " + og.get(index));
        }

        HeapLogic logic = new HeapLogic();

        for (Integer integer : og) {
            logic.add(integer);
        }

        System.out.println("------- heap array ----------");
        logic.show();
    }
}
