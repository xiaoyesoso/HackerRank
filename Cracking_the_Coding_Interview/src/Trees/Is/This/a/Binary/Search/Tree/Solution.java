package Trees.Is.This.a.Binary.Search.Tree;

public class Solution {
	class Node {
		int data;
		Node left;
		Node right;
	}

	boolean checkBST(Node root) {
		if (root.left != null) {
			Node M = root.left;
			while (M.right != null)
				M = M.right;
			if (!checkBST(root.left) || M.data >= root.data)
				return false;

		}
		if (root.right != null) {
			Node M = root.right;
			while (M.left != null)
				M = M.left;
			if (!checkBST(root.right) || M.data <= root.data)
				return false;
		}
		return true;
	}
}
