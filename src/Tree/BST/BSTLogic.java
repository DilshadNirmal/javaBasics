package Tree.BST;

public class BSTLogic {
    BSTNode root;

    public BSTNode insert(int value) {
        if (root == null) {
            root = new BSTNode(value);
            return root;
        } else {
            return insert(root, value);
        }
    }

    private BSTNode insert(BSTNode currentRoot, int value) {
        if (currentRoot == null) {
            BSTNode newNode = new BSTNode(value);
            return newNode;
        }

        if (value <= currentRoot.value) {
            System.out.println("parent: " + currentRoot.value + " left: " + value);
            currentRoot.left = insert(currentRoot.left, value);
        } else if (value > currentRoot.value) {
            System.out.println("parent: " + currentRoot.value + " right: " + value);
            currentRoot.right = insert(currentRoot.right, value);
        }

        return currentRoot;
    }

    public boolean find(int value) {
        if (find(root, value) == null ) {
            System.out.println("false for value: " + value);
            return false;
        } else {
            System.out.println("true for value: " + value);
            return true;
        }
    }
    private BSTNode find(BSTNode currentNode, int value) {

        if (currentNode == null) {
            return null;
        }
        if (currentNode.value == value) {
            return currentNode;
        } else if (currentNode.value > value) {
            // System.out.println("left: " + currentNode.value);
            return  find(currentNode.left, value);
        } else {
            // System.out.println("right: " + currentNode.value);
           return find(currentNode.right, value);
        }
    }

    public BSTNode delete(int value) {
        root = delete(root, value);
        return root;
    }

    private BSTNode delete(BSTNode currentRoot, int value) {
        if (currentRoot == null)
            return null;

        // Search for the node to be deleted
        if (value < currentRoot.value)
            currentRoot.left = delete(currentRoot.left, value);
        else if (value > currentRoot.value)
            currentRoot.right = delete(currentRoot.right, value);
        else {
            // Node to be deleted found

            // Case 1: No child or only one child
            if (currentRoot.left == null)
                return currentRoot.right;
            else if (currentRoot.right == null)
                return currentRoot.left;

            // Case 2: Node with two children
            // Find the inorder successor (smallest node in the right subtree)
            currentRoot.value = minValue(currentRoot.right);

            // Delete the inorder successor
            currentRoot.right = delete(currentRoot.right, currentRoot.value);
        }
        return currentRoot;
    }

    private int minValue(BSTNode node) {
        int minValue = node.value;
        while (node.left != null) {
            minValue = node.left.value;
            node = node.left;
        }
        return minValue;
    }
    
}
