package LinkedList.Double;

public class DLMain {
    public static void main(String[] args) {
        DlLinkedPerson person = new DlLinkedPerson();

        person.insert("null");
        person.insert("niraml");
        person.insert("dil");
        person.insert("null");

        System.out.println("Ascending");
        person.printAsc();
        System.out.println("Descending");
        person.printDes();
    }
}
