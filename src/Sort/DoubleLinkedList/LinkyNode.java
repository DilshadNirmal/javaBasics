package Sort.DoubleLinkedList;

public class LinkyNode<T> {

    T data;
    LinkyNode<T> prev, next;

    public LinkyNode(T data) {
        this.data = data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public void setPrev(LinkyNode<T> prev) {
        this.prev = prev;
    }

    public void setNext(LinkyNode<T> next) {
        this.next = next;
    }

    public T getData() {
        return data;
    }

    public LinkyNode<T> getPrev() {
        return prev;
    }

    public LinkyNode<T> getNext() {
        return next;
    }
}
