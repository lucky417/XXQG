package com.day1024;

public class Leecode {
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] nums= {1,2,2,4,3,3,2};
	    if (nums.length == 0) {
	    	System.out.println("nums:"+nums);
	    }
	    int i = 0;
	    for (int j = 1; j < nums.length; j++) {
	        if (nums[j] != nums[i]) {
	            i++;
	            nums[i] = nums[j];
	        }
	    }
	    for(int g=0;g<=i;g++) {
	    System.out.println(nums[g]);;
	    }
	}

}
