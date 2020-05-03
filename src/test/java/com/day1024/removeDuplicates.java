package com.day1024;

import java.util.Arrays;

public class removeDuplicates {
	public static int removeDuplicates(int[] nums) {
		for(int i=0;i<nums.length-1;i++) {
			for(int j=i+1;j<nums.length-1;) {
				if(nums[i]==nums[j]) {
					for(int f=j;f<nums.length-1;f++) {
					nums[f]=nums[f+1];
					}
					nums = Arrays.copyOf(nums,nums.length-1);
					for(int m=0;m<nums.length-1;m++) {
						if(nums[m]==nums[nums.length-1]) {
							nums = Arrays.copyOf(nums,nums.length-1);
						}
					}

				}
				else {
					j++;
				}
			}
		}
		for(int g=0;g<nums.length;g++) {
		System.out.println(nums[g]);
		}
		
		return nums.length;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = {1,1,2,2,1};
		int num=removeDuplicates(nums);
		System.out.println("数组的长度为:"+num);

}
}
