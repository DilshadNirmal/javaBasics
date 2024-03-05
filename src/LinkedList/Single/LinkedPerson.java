package LinkedList.Single;

public class LinkedPerson {
    Person head = null, tail = null;

    public void insert(String name) {
        Person newPerson = new Person(name);

        if (head == null) {
            head = newPerson;
            tail = newPerson;
        } else {
            tail.nextPerson = newPerson;
            tail = newPerson;
        }
    }

    public void remove(int position) {
        Person currentPerson = head;

        int index = 0;
        while (currentPerson != null) {
            if (index == position) {
                currentPerson.nextPerson = currentPerson;
            }
            currentPerson = currentPerson.nextPerson;
        }
    }

    public void print() {
        Person currentPerson = head;

        while (currentPerson != null) {
            System.out.println(currentPerson.name);
            currentPerson = currentPerson.nextPerson;
        }
    }
}
