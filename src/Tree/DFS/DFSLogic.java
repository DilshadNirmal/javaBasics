package Tree.DFS;

import java.util.LinkedList;
import java.util.Queue;
import java.util.ArrayList;

public class DFSLogic {
	DFSNode root;
    
	public void setRoot(DFSNode root) {
		this.root = root;
	}
	
	public void preOrder(DFSNode child) {
		if(child != null) {
            System.out.print(" "+child.value);
            preOrder(child.left);
            preOrder(child.right);
		}
//		else {
//			return;
//		}
	}
	public void inOrder(DFSNode child) {
		if(child != null) {
            inOrder(child.left);
            System.out.print(" "+child.value);
            inOrder(child.right);
		}
	}
	public void postOrder(DFSNode child) {
		if(child != null) {
			postOrder(child.left);
			postOrder(child.right);
			System.out.print(" "+child.value);
		}
	}

	public void printBFD(DFSNode root) {
		Queue<DFSNode> queue = new LinkedList<DFSNode>();
		
		queue.offer(root);

		while (queue.size() != 0) {
			DFSNode current = queue.poll();
			System.out.print(" " + current.value);

			if (current.left != null) {
				queue.offer(current.left);
			}

			if (current.right != null) {
				queue.offer(current.right);
			}
		}
	}
	
	public DFSNode mirror(DFSNode root) {

		if (root == null) {
			return root;
		}

		DFSNode lH = mirror(root.left);
		DFSNode rH = mirror(root.right);

		if (lH != null || rH != null) {
			root.left = rH;
			root.right = lH;
		}

		return root;
	}
	
	public int height(DFSNode root) {
		if (root == null) {
			return 0;
		} else {
			int lHeight = height(root.left);
			int rHeight = height(root.right);

			return (lHeight > rHeight) ? (lHeight + 1) : (rHeight + 1);
		}
	}

	public int getMaxWidth(DFSNode root) {
		int maxWidth = 0;
		int width, height = height(root);

		for (int i = 1; i < height; i++) {
			width = width(root, i);

			if (width > maxWidth)
				maxWidth = width;
		}

		return maxWidth;
	}
	
	public int width(DFSNode root, int i) {
		if (root == null) {
			return 0;
		}

		if (i == 1)
			return 1;
		else if (i > 1)
			return width(root.left, i - 1) + width(root.right, i - 1);

		return 0;
	}

	// public int treeWidthMax(DFSNode root) {
        
    //     return maxWidth;
    // }

    public ArrayList<int[]> treeWidth(DFSNode root, ArrayList<int[]> width, int level) {
        if (root == null) {
			return width;
		}

		int[] levelSize = new int[2];
		levelSize[0] = level;
		levelSize[1] = 0;

		if (root.left != null && root.right != null)
			levelSize[1] = 2;
		else if (root.left != null || root.right != null)
			levelSize[1] = 1;

		width.add(levelSize);
		width = treeWidth(root.left, width, level + 1);
		width = treeWidth(root.right, width, level + 1);

		return width;
    }

	public void dfs(DFSNode root, int level) {
		if (root != null) {
			for (int i = 0; i < level; i++) {
				System.out.print("| ");
			}

			System.out.println(root.value);

			dfs(root.left, level + 1);
			dfs(root.right, level + 1);
		}
	}

	public void printTree(DFSNode root, String prefix, boolean isLeft) {
		if (root != null) {
			System.out.println(prefix + (isLeft ? "├── " : "└── ") + root.value);
			printTree(root.left, prefix + (isLeft ? "│   " : "    "), true);
			printTree(root.right, prefix + (isLeft ? "│   " : "    "), false);
		}
	}

	public void printPattern(DFSNode root, int height) {
		int n = height * 11;
		int mid = n / 2;

		int leftStar = mid, rightStar = mid;
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if (mid == i && j == 0) {
					System.out.print(root.value);
				} else if (j == 0 && i == n - 1) {
					System.out.print(root.left.value);
				} else if (j == n - 1 && i == n - 1) {
					System.out.print(root.right.value);
				} else if (leftStar == j || rightStar == j) {
					System.out.print("*");
				}

				System.out.print(" ");
			}
			System.out.print("");
		}
	}
	
}