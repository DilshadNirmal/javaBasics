package LinkedList;

public class SingleLL {

    SingleLLNode head = null, tail = null;

    public void insert(int value) {
        SingleLLNode singleLLNode = new SingleLLNode();
        singleLLNode.setValue(value);

        if (head == null) {
            head = singleLLNode;
            tail = singleLLNode;
        } else {
            tail.setNext(singleLLNode);
            tail = singleLLNode;
        }
    }

    public void print() {
        SingleLLNode currentVal = head;

        if (head != null) {
            while(currentVal != null) {
                System.out.println(currentVal.getValue());
                currentVal = currentVal.getNext();
            }
        } else {
            System.out.println("list is empty");
        }

    }
}
