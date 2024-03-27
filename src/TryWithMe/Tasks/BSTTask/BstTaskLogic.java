package TryWithMe.Tasks.BSTTask;

public class BstTaskLogic {

    BstTaskNode root = null;

    public BstTaskNode insert(int value) {
        if (root == null) {
            root = new BstTaskNode(value);
            return root;
        } else {
            return insert(root, value);
        }
    }

    private BstTaskNode insert (BstTaskNode currentRoot, int value) {

        if (currentRoot == null) {
            BstTaskNode newNode = new BstTaskNode(value);
            return newNode;
        }

        if (value <= currentRoot.getValue()) {
            System.out.println("parent: " + currentRoot.value + " left: " + value);
            currentRoot.left = (insert(currentRoot.getLeft(), value));
        } else {
            System.out.println("parent: " + currentRoot.value + " right: " + value);
            currentRoot.right = (insert(currentRoot.getRight(), value));
        }

        return currentRoot;
    }

    public BstTaskNode delete(int value) {
        root = delete(root, value);
        return root;
    }

    private BstTaskNode delete(BstTaskNode currentRoot, int value) {
        if (currentRoot == null)
            return null;

        if (value < currentRoot.value){
            System.out.println("parent: " + currentRoot.value + " left: " + value);
            currentRoot.left = delete(currentRoot.getLeft(), value);
        }
        else if (value > currentRoot.value){
            System.out.println("parent: " + currentRoot.value + " right: " + value);
            currentRoot.right = delete(currentRoot.getRight(), value);
        }
        else {
            if (currentRoot.getLeft() == null)
                return currentRoot.right;
            else if (currentRoot.getRight() == null)
                return currentRoot.left;

            currentRoot.value = minValue(currentRoot.getRight());

            currentRoot.right = delete(currentRoot.getRight(), currentRoot.getValue());
        }

        return currentRoot;
    }

    private int minValue(BstTaskNode node) {
        int minValue = node.value;
        while (node.left != null) {
            minValue = node.left.value;
            node = node.left;
        }
        return minValue;
    }
}
