package com.day1026;

public class maxSubArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums= {-1,2,3,4,-3,5,1};
		int ans = nums[0];
        int sum = 0;
        for(int num: nums) {
            if(sum > 0) {
                sum += num;
            } else {
                sum = num;
            }
            ans = Math.max(ans, sum);
        }
		System.out.println("ans"+ans);

	}

}
