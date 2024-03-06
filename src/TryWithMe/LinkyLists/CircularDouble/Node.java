package TryWithMe.LinkyLists.CircularDouble;

public class Node {
    int data;
    Node prev, next;

    public Node() {
        data = 0;
        prev = null;
        next = null;
    }

    public Node(int data, Node prev, Node next) {
        this.data = data;
        this.prev = prev;
        this.next = next;
    }

    public void setData(int data) {
        this.data = data;
    }

    public void setPrev(Node prev) {
        this.prev = prev;
    }

    public void setNext(Node next) {
        this.next = next;
    }

    public int getData() {
        return data;
    }

    public Node getPrev() {
        return prev;
    }

    public Node getNext() {
        return next;
    }
}
