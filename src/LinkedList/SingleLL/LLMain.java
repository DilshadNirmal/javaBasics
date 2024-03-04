package LinkedList.SingleLL;

public class LLMain {
    public static void main(String[] args) {
        SingleLL sll = new SingleLL();

        sll.insert(5);
        sll.insert(3);
        sll.insert(6);
        sll.insert(9);
        sll.insert(4);
        sll.insert(23, 2);
        sll.insert(12, 0);

        sll.remove(3);

        sll.print();
    }
}
