package LinkedList.Double;

public class DlLinkedPerson {
    DLPerson head, tail;

    public void insert(String name) {
        DLPerson newPerson = new DLPerson(name);

        if (head == null) {
            head = newPerson;
            tail = newPerson;
        } else {
            newPerson.prevPerson = tail;
            tail.nextPerson = newPerson;
            tail = newPerson;
        }
    }

    public void insert(String name, int position) {

        if (position == 0) {
            insert(name);
        } else {
            int index = 0;

            DLPerson currentDlPerson = head;

            while (currentDlPerson != null) {

                if (position == index) {
                    
                }

                index++;
                currentDlPerson = currentDlPerson.nextPerson;
            }
        }
    }

    public void printAsc() {
        DLPerson currentPerson = head;

        while (currentPerson != null) {
            System.out.println(currentPerson.name);
            currentPerson = currentPerson.nextPerson;
        }
    }

    public void printDes() {
        DLPerson currentPerson = tail;

        while (currentPerson != null) {
            System.out.println(currentPerson.name);
            currentPerson = currentPerson.prevPerson;
        }
    }
}
