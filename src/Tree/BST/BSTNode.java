package Tree.BST;

public class BSTNode {
    int value;
    BSTNode left, right;

    public BSTNode(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public BSTNode getLeft() {
        return left;
    }
    public BSTNode getRight() {
        return right;
    }

    public void setLeft(BSTNode left) {
        this.left = left;
    }

    public void setRight(BSTNode right) {
        this.right = right;
    }
}
