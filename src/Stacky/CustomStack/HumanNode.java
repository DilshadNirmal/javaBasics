package Stacky.CustomStack;

public class HumanNode {
    int data;
    HumanNode next;

    public HumanNode(int data) {
        this.data = data;
    }

    public void setData(int data) {
        this.data = data;
    }

    public void setNext(HumanNode next) {
        this.next = next;
    }

    public int getData() {
        return data;
    }

    public HumanNode getNext() {
        return next;
    }
}
