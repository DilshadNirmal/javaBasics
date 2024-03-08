package Sort.DoubleLinkedList;

public class LinkableLinky<T> {
    
    LinkyNode<T> head = null, tail = null;

    public void insert(T data) {
        LinkyNode<T> node = new LinkyNode<T>(data);

        if (head == null) {
            head = node;
            tail = node;
        } else {
            node.setPrev(tail);
            tail.setNext(node);
            tail = node;
        }
    }

    public void sort() {
        LinkyNode<T> current = null, nextCurrent = null;
        T temp;

        if (head == null) {
            return;
        } else {
            for (current = head; current.getNext() != null; current = current.getNext()) {
                for (nextCurrent = current.getNext(); nextCurrent != null; nextCurrent = nextCurrent.getNext()) {
                    if ((int)current.getData() > (int)nextCurrent.getData()) {
                        temp = current.data;
                        current.data = nextCurrent.data;
                        nextCurrent.data = temp;
                    }
                }
            }
        }
    }

    public void display() {
        LinkyNode<T> current = head;

        if (head == null) {
            System.out.println("list is empty");
        } else {
            while(current != null) {
                System.out.println(current.getData());
                current = current.getNext();
            }
        }

    }

    public void displayReverse() {
        LinkyNode<T> current = tail;

        while(current != null) {
            System.out.println(current.getData());
            current = current.getPrev();
        }
    }

}
