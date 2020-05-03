package com.day1108;

public class Trangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 6;
		int[][] a = new int[n][n];
		a[0][0] = 1;
		for (int i = 1; i < n; i++) {
			a[i][0]=1;
			a[i][i]=1;
			for (int j = 1; j <i; j++) {
				a[i][j] = a[i - 1][j - 1] + a[i - 1][j];
			}
			for(int f=0;f<=i;f++) {
				System.out.println(a[i][f]);
			}
			System.out.println("**************");
		}

	}

}
