package HeapDS;

import java.util.ArrayList;

public class HeapMain {
    public static void main(String[] args) {
        ArrayList<Integer> heap = new ArrayList<Integer>();

        HeapLogic heapLogic = new HeapLogic(heap);

        heapLogic.insert(22);
        heapLogic.insert(56);
        heapLogic.insert(21);
        heapLogic.insert(14);
        heapLogic.insert(16);
        heapLogic.insert(18);
        heapLogic.insert(12);
        heapLogic.insert(7);
        heapLogic.insert(13);
        heapLogic.insert(23);
        heapLogic.insert(36);
        heapLogic.insert(5);
        heapLogic.insert(9);
        heapLogic.insert(4);
        heapLogic.insert(2);
        heapLogic.insert(57);
        heapLogic.insert(24);

        for (int i = 0; i < heapLogic.heap.size(); i++) {
            System.out.println(i + " : " + heapLogic.heap.get(i));
        }

        HeapLogic logic = new HeapLogic(heap);

        logic.minHeap(0);
    }
}
