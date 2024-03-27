package TryWithMe.Tasks.BSTTask;

public class BstTaskMain {
    public static void main(String[] args) {
        BstTaskLogic logic = new BstTaskLogic();

        logic.insert(4);
        logic.insert(6);
        logic.insert(7);
        logic.insert(2);
        logic.insert(1);

        System.out.println("----- from delete -----");
        logic.delete(2);
        System.out.println("----------");

        logic.insert(5);

        System.out.println("----- from delete -----");
        logic.delete(7);
        System.out.println("----------");

    }
}
