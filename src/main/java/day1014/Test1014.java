package day1014;


/*判断一个数是否为回文数*/
public class Test1014 {

	public static boolean isPalindrome(int x) {
		String st_x = String.valueOf(x);
		boolean result = true;
		for(int i=0;i<st_x.length();i++) {
			if(st_x.charAt(i)!=st_x.charAt(st_x.length()-i-1)){
				result= false;
			}
		}
		return result;
	}
	public static boolean isPalindrome1(int x) {
        if(x < 0 || (x % 10 == 0 && x != 0)) {
            return false;
        }
        int revertedNumber = 0;
        while(x > revertedNumber) {
            revertedNumber = revertedNumber * 10 + x % 10;
            x /= 10;
        }
        return x == revertedNumber || x == revertedNumber/10;
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean a=isPalindrome1(1233213);
		System.out.println(a);

	}

}
