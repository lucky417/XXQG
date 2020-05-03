package com.day1028;

public class plusOne {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums= {9,8,9};
		for(int i=nums.length-1;i>=0;i--) {
			if(nums[i]<9) {
				nums[i]=nums[i]+1;
				break;
			}
			else{
				nums[i]=0;
			}
			if(nums[0]==0) {
				nums = new int[nums.length + 1];
				nums[0]=1;
			}
			
		}
		for(int j=0;j<nums.length;j++) {
			System.out.println(nums[j]);
		} 
	}

}
