package Tree.BST;

public class BSTMain {
    public static void main(String[] args) {

        BSTLogic logic = new BSTLogic();

        logic.insert(4);
        logic.insert(2);
        logic.insert(6);
        logic.insert(3);
        logic.insert(8);
        logic.insert(10);
        logic.insert(14);

        logic.find(10);
        logic.find(14);
        logic.find(4);
        logic.find(3);
        logic.find(7);

        // logic.printTree(node, "", false);
    }
}
