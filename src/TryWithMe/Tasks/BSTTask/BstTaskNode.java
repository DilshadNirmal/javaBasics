package TryWithMe.Tasks.BSTTask;

public class BstTaskNode {
    int value;
    BstTaskNode right, left;

    public BstTaskNode(int value) {
        this.value = value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public void setRight(BstTaskNode right) {
        this.right = right;
    }

    public void setLeft(BstTaskNode left) {
        this.left = left;
    }

    public int getValue() {
        return value;
    }

    public BstTaskNode getRight() {
        return right;
    }

    public BstTaskNode getLeft() {
        return left;
    }
}
