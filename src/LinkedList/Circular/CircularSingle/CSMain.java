package LinkedList.Circular.CircularSingle;

public class CSMain {
    public static void main(String[] args) {
        CSConnect connection = new CSConnect();

        connection.insert("someone");
        connection.insert("otherone");
        connection.insert("otherOtherone");

        connection.print();

        connection.recursivePrint(connection.head);
    }
}
