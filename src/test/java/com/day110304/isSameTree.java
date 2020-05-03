package com.day110304;

public class isSameTree {
	
	
	public boolean isSame(TreeNode a,TreeNode b) {
		if(a==null&&b==null) {
			return true;
		}
		if(a==null||b==null) {
			return false;
		}
		if(a.value==b.value) {
			return isSame(a.left,b.left)&& isSame(a.right,b.right);
		}
		return false;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
