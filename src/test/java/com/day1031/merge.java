package com.day1031;

public class merge {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int m = 3;
		int n = 3;
		int[] nums1 = { 1,2,3,0,0,0 };
		int[] nums2 = {2,5,6};
		int j = n - 1;
		int g = m - 1;
		for (int i = m + n - 1; i >= 0; i--) {
			if (g >= 0 && j >= 0) {
				if (nums1[g] < nums2[j]) {
					nums1[i] = nums2[j];
					j--;
				} else {
					nums1[i] = nums1[g];
					g--;
				}
			}
			else if(g<0) {
				nums1[i] = nums2[j];
				j--;
			}
			else if(j<0) {
				nums1[i] = nums1[g];
				g--;
			}
		}
		for (int i = 0; i < m + n; i++) {
			System.out.println(nums1[i]);

		}

	}

}
