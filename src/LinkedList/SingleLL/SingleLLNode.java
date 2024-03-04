package LinkedList.SingleLL;

public class SingleLLNode {
    private int value;
    private SingleLLNode next = null;

    public SingleLLNode getNext() {
        return next;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public void setNext(SingleLLNode next) {
        this.next = next;
    }
}
