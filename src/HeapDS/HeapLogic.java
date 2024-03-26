package HeapDS;

import java.util.ArrayList;

public class HeapLogic {
    ArrayList<Integer> heap;
    
    public HeapLogic(ArrayList<Integer> array) {
        this.heap = array;
    }

    private int parentPos(int i) {
        return (i - 1) / 2;
    }

    private int leftChild(int pos) {
        return (pos * 2) + 1;
    }

    private int rightChild(int pos) {
        return (pos * 2) + 2;
    }

    public void minHeap(int pos) {
        int parent = pos;
        int left = leftChild(pos);
        int right = rightChild(pos);

        if (left < heap.size() && heap.get(parent) < heap.get(left)) {
            parent = left;
        }

        if (right < heap.size() && heap.get(parent) < heap.get(right)) {
            parent = right;
        }

        if (parent != pos) {
            int temp = heap.get(parent);
            heap.set(parent, heap.get(pos));
            heap.set(pos, temp);
            minHeap(parent);
        }

    }

    public void insert(int value) {
        heap.add(value);
        insertMaxHeap(heap.size() - 1);
    }

    private void insertMaxHeap(int i) {
        while (i > 0 && heap.get(i) > heap.get(parentPos(i))) {
            int parent = parentPos(i);

            int temp = heap.get(parent);
            heap.set(parent, heap.get(i));
            heap.set(i, temp);
            i = parent;
        }
    }
}
