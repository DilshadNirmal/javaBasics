package Stacky.CustomStack;

public class HumanList {
    HumanNode head = null, tail = null;
    int size = 0;

    public void push(int data) {
        HumanNode human = new HumanNode(data);

        if (head == null) {
            head = human;
            tail = human;
        } else {
            tail.setNext(human);
            tail = human;
        }

        size++;
    }

    public int peek() {
        if (tail != null)
            return tail.getData();
        
        return 0;
    }

    public void pop() {
        HumanNode curHumanNode = head;

        if (head == tail) {
            head = null;
            tail = null;
            size = 0;
        }

        if (head != null) {
            while (curHumanNode != null) {
                if (curHumanNode.getNext() == tail) {
                    curHumanNode.setNext(null);
                    tail = curHumanNode;
                }
                curHumanNode = curHumanNode.getNext();
            }
            size--;
        }
    }

    public int getSize() {
        return size;
    }

    public void display(HumanNode head) {
        HumanNode current = head;

        if (current != null) {
            System.out.println(current.getData());
            display(current.getNext());
        }

        // current = current.getNext();
    }
}
