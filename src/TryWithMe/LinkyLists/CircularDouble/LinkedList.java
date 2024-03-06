package TryWithMe.LinkyLists.CircularDouble;

public class LinkedList {
    Node head, tail;
    int size;

    public LinkedList() {
        head = null;
        tail = null;
        size = 0;
    }

    public boolean isEmpty() {
        return head == null;
    }

    public int getSize() {
        return size;
    }

    public void insertAtStart(int val) {
        Node nptr = new Node(val, null, null);

        if (head == null) {
            nptr.setNext(nptr);
            nptr.setPrev(nptr);
            head = nptr;
            tail = head;
        } else {
            nptr.setPrev(tail);
            tail.setNext(nptr);
            head.setPrev(nptr);
            nptr.setNext(head);
            head = nptr;
        }
        size++;
    }

    public void insertAtEnd(int val) {
        Node nptr = new Node(val, null, null);

        if (head == null) {
            nptr.setNext(nptr);
            nptr.setPrev(nptr);
            head = nptr;
            tail = head;
        } else {
            nptr.setPrev(tail);
            tail.setNext(nptr);
            head.setPrev(nptr);
            nptr.setNext(head);
            tail = nptr;
        }
        size++;
    }

    public void insertAtPos(int val, int pos) {
        Node nptr = new Node(val, null, null);

        if (pos == 1) {
            insertAtStart(val);
            return;
        }

        Node current = head;
        for (int index = 2; index <= size; index++) {
            if (index == pos) {
                Node tmp = current.getNext();
                current.setNext(nptr);
                nptr.setPrev(current);
                nptr.setNext(tmp);
                tmp.setPrev(nptr);
            }
            current = current.getNext();
        }
        
        size++;
    }

    public void deleteAtPos(int pos) {

        if (pos == 1) {
            if (size == 1) {
                head = null;
                tail = null;
                size = 0;
                return;
            }

            head = head.getNext();
            head.setPrev(tail);
            tail.setNext(head);
            size--;
            return;
        }

        if (pos == size) {
            tail = tail.getPrev();
            tail.setNext(head);
            head.setPrev(tail);
            size--;
        }

        Node current = head.getNext();

        for (int index = 2; index <= size; index++) {
            if (index == pos) {
                Node prev = current.getPrev();
                Node next = current.getNext();

                prev.setNext(next);
                next.setPrev(prev);
                size--;
                return;
            }
            current = current.getNext();
        }
    }

    public void display() {
        Node current = head;

        if (size == 0) {
            System.out.println("list is empty");
            return;
        }

        if (head.getNext() == head) {
            System.out.println(head.getData() + " <--> " + current.getData());
            return;
        }

        System.out.print(head.getData() + " <--> ");
        current = head.getNext();

        while (current.getNext() != head) {
            System.out.print(current.getData() + " <--> ");
            current = current.getNext();
        }

        System.out.print(current.getNext().getData());

        System.out.println();
    }
}
