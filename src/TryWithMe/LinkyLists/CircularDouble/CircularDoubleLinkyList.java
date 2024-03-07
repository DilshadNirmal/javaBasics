package TryWithMe.LinkyLists.CircularDouble;

public class CircularDoubleLinkyList {
    public static void main(String[] args) {
        
        LinkedList list = new LinkedList();

        list.insertAtStart(34);
        list.insertAtEnd(54);
        list.insertAtPos(45, 2);
        list.insertAtPos(66, 3);

        list.display();

        list.deleteAtPos(3);
        list.insertAtPos(0, 2);
        list.insertAtPos(1, 2);
        list.display();
        System.out.println(list.getSize());

    }
}
