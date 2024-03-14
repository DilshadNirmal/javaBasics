package Tree.DFS;

import java.util.ArrayList;

public class DFSMain {
    public static void main(String[] args) {

        DFSNode root = new DFSNode(3);
		root.left = new DFSNode(2);
		root.left.left = new DFSNode(4);
		root.left.right = new DFSNode(5);
		root.right = new DFSNode(6);
		root.right.left = new DFSNode(7);
		root.right.right = new DFSNode(8);
		

        DFSLogic logic = new DFSLogic();
        
        // System.out.println("------- Pre Order --------");
        // logic.preOrder(root);
        // System.out.println();
        // System.out.println("------- In Order --------");
        // logic.inOrder(root);
        // System.out.println();
        // System.out.println("------- Post Order --------");
        // logic.postOrder(root);
        // System.out.println();

		System.out.println("-------- height ---------");
		System.out.println(logic.height(root));

		System.out.println("--------- width ---------");
		System.out.println(logic.getMaxWidth(root));

		ArrayList<int[]> width = logic.treeWidth(root, new ArrayList<int[]>(), 0);
		int[] levelBasedWidth = new int[logic.height(root)];

		for (int i = 0; i < width.size(); i++) {
			int j = width.get(i)[0];
			levelBasedWidth[j] = levelBasedWidth[j] + width.get(i)[1];
		}

		int maxWidth = 0;

		for (int i = 0; i < levelBasedWidth.length; i++) {
			if (maxWidth < levelBasedWidth[i]) {
				maxWidth = levelBasedWidth[i];
			}
		}

		System.out.println("max width: " + maxWidth);

		// System.out.println("BFS print"); 
		// logic.printBFD(root);
		// System.out.println();
		
		// System.out.println("------ mirror ----------"); 
		// logic.mirror(root);
		
		// System.out.println("BFS print"); 
		// logic.printBFD(root);

		System.out.println("-------- tree diagram --------");
		logic.dfs(root, 0);

		System.out.println("-------- tree diagram --------");
		logic.printTree(root, "", false);

		DFSNode root2 = new DFSNode(3);
		root2.left = new DFSNode(2);
		root2.right = new DFSNode(5);
		
		System.out.println("-------- tree diagram --------");
		logic.printPattern(root2, logic.height(root2));
    }
}
