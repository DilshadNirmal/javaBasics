package LinkedList.Double;

public class DlLinkedPerson<K> {
    DLPerson<K> head, tail;

    public void insert(K name) {
        DLPerson<K> newPerson = new DLPerson<K>(name);

        if (head == null) {
            head = newPerson;
            tail = newPerson;
        } else {
            newPerson.prevPerson = tail;
            tail.nextPerson = newPerson;
            tail = newPerson;
        }
    }

    public void insert(K name, int position) {

        if (position == 0) {
            insert(name);
        } else {
            int index = 0;

            DLPerson<K> currentDlPerson = head;

            while (currentDlPerson != null) {

                if (position == index) {
                    
                }

                index++;
                currentDlPerson = currentDlPerson.nextPerson;
            }
        }
    }

    public void printAsc() {
        DLPerson<K> currentPerson = head;

        while (currentPerson != null) {
            System.out.println(currentPerson.data);
            currentPerson = currentPerson.nextPerson;
        }
    }

    public void printDes() {
        DLPerson<K> currentPerson = tail;

        while (currentPerson != null) {
            System.out.println(currentPerson.data);
            currentPerson = currentPerson.prevPerson;
        }
    }
}
