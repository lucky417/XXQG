package day1030;

public class climbStairs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=6;
		if(n>2) {
		int[] nums= new int[n];
		nums[0]=1;
		nums[1]=2;
		for(int i=2;i<n;i++) {
			nums[i]=nums[i-2]+nums[i-1];
		}
		
		System.out.println(nums[n-1]);
		}else System.out.println(n);
	}

}
