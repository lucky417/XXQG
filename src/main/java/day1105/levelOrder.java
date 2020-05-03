package day1105;

import java.util.ArrayList;
import java.util.List;

/*
 * 给定一个二叉树，返回其按层次遍历的节点值。 （即逐层地，从左到右访问所有节点）。
例如:
给定二叉树: [3,9,20,null,null,15,7],
    3
   / \
  9  20
    /  \
   15   7
返回其层次遍历结果：
[[3],[9,20],[15,7]]
*/

public class levelOrder {

	public List<List<Integer>> levelOreder1(TreeNode a){
		List<Integer> li = new ArrayList<Integer>();
		List<List<Integer>> lisum = new ArrayList<List<Integer>>();
		

		if(a.left==null&&a.right==null) {
			li.add(a.value);
			lisum.add(li);
		}
		
		return null;
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
