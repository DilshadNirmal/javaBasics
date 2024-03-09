package LinkedList.Double;

public class DLPerson<T> {
    T data;
    DLPerson<T> nextPerson = null, prevPerson = null;

    public DLPerson(T data) {
        this.data = data;
    }
}
