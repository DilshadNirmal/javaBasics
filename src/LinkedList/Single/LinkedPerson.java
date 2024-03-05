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
}
