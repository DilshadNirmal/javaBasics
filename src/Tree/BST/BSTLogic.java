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

    public void printTree(BSTNode root, String prefix, boolean isLeft) {
		if (root != null) {
			System.out.println(prefix + (isLeft ? "├── " : "└── ") + root.value);
			printTree(root.left, prefix + (isLeft ? "│   " : "    "), true);
			printTree(root.right, prefix + (isLeft ? "│   " : "    "), false);
		}
	}
    
}
