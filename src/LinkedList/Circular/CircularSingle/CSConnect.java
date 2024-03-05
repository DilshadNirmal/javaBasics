package LinkedList.Circular.CircularSingle;

public class CSConnect {
    CSPerson head = null, tail = null;

    public void insert(String name) {
        CSPerson newPerson = new CSPerson(name);

        if (head == null) {
            head = newPerson;
            tail = newPerson;
            newPerson.next = newPerson;
        } else {
            newPerson.next = head;
            tail.next = newPerson;
            tail = newPerson;
        }
    } 

    public void print() {
        CSPerson current = head;
        
        if (current != null) {
            do {
                System.out.println(current.name);
                current = current.next;
            } while (current != head);
        } else {
            System.out.println("list is empty");
        }
    }

    public void recursivePrint(CSPerson current) {
        if (current != null) {
            System.out.println(current.name);
            current = current.next;

            if (current != head) {
                recursivePrint(current);
            }
        } else {
            System.out.println("list is empty");
        }
    }
}
