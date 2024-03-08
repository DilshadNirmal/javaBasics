package Sort.DoubleLinkedList;

public class DoubleLinky {
    public static void main(String[] args) {
        
        LinkableLinky<Integer> table = new LinkableLinky<Integer>();

        table.insert(54);
        table.insert(33);
        table.insert(88);
        table.insert(64);
        table.insert(57);

        table.display();

        table.sort();

        System.out.println("after sorted");
        table.display();

    }
}
