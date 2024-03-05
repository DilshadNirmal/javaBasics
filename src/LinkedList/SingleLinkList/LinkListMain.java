package LinkedList.SingleLinkList;

public class LinkListMain {
    public static void main(String[] args) {
        LinkedList linkedList = new LinkedList();

        for (int i = 0; i < 15; i++) {
            linkedList.addValue(i);
        }

        linkedList.insertValue(3, 2);
        linkedList.insertValue(9, 0);
        linkedList.insertValue(7, 3);
        linkedList.insertValue(5, 0);

        System.out.println(linkedList.toString());
        
        linkedList.removeValue(9);

        System.out.println(linkedList.toString());
    }
}
