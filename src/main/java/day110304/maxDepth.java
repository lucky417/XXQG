package day110304;

public class maxDepth {

	public static  int maxDep(TreeNode root) {
		if(root==null) {
			return 0;
		}
		if(root.left==null&&root.right==null) {
			return 1;
		}
		return Math.max(maxDep(root.left),maxDep(root.right))+1;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeNode a=new TreeNode(15);
		TreeNode c=new TreeNode(7);
		TreeNode d=new TreeNode(20,a,c);
		TreeNode b=new TreeNode(9);
		TreeNode f=new TreeNode(3,b,d);
		System.out.println(maxDep(f)); 

	}

}
