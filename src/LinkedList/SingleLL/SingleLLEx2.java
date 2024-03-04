package LinkedList.SingleLL;

public class SingleLLEx2 {
    public static void main(String[] args) {
        SingleLLNode head = null, tail = null;

        SingleLLNode obj = new SingleLLNode();
        obj.setValue(5);
        System.out.println(obj);

        if(head == null) {
            head = obj;
            tail = obj;
        }
        System.out.println(head);
        System.out.println(tail);

        SingleLLNode obj1 = new SingleLLNode();
        obj1.setValue(3);
        tail.setNext(obj1);
        tail = obj1;
        System.out.println(obj.getValue());
        System.out.println(obj.getNext().getValue());

        SingleLLNode obj2 = new SingleLLNode();
        obj2.setValue(0);
        tail.setNext(obj2);
        tail = obj2;

    }
}
