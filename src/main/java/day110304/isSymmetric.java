package day110304;

public class isSymmetric {
	
	public static boolean isSymmet1(TreeNode a) {
		return isSymmet(a,a);
	}
	
	public static boolean isSymmet(TreeNode a,TreeNode b) {
		if(a==null&&b==null) {
			return true;
		}
		if(a==null||b==null) {
			return false;
		}
		if(a.value==b.value) {
	       return isSymmet(a.left,b.right)&&isSymmet(a.right,b.left);
		}
		return false;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeNode a=new TreeNode(2);
		TreeNode c=new TreeNode(4);
		TreeNode d=new TreeNode(1,c);
		TreeNode b=new TreeNode(1,d,c);
		System.out.println(isSymmet1(b));
		

	}

}
