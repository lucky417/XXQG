package day110304;

public class TreeNode {
	int value;
	TreeNode left;
	TreeNode right; 
	public TreeNode(int value, TreeNode left, TreeNode right) {
		super();
		this.value = value;
		this.left = left;
		this.right = right;
	}
	public TreeNode(int value) {
		super();
		this.value = value;
	}
	public TreeNode(int value, TreeNode right) {
		super();
		this.value = value;
		this.right = right;
	}
	

}
