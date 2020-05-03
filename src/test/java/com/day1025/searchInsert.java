package com.day1025;

public class searchInsert {
	
    public static int searchInsert(int[] nums, int target) {
    	int f=0;
    	for(int i=0;i<nums.length;i++) {
    		if(nums[i]>=target) {
    			f=i;
    			break;
    		}
    			f=i+1;
    	}
		return f;
        
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums={1,3,5,6};
		int a=searchInsert(nums,2);
		System.out.println(a);


	}

}
