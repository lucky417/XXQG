package day1010;
/*
 * reverse integer */
public class Test {
	public static int test(int x) {
		int rev = 0;
        while (x != 0) {
            int pop = x % 10;
            x /= 10;
            if (rev > Integer.MAX_VALUE/10 || (rev == Integer.MAX_VALUE / 10 && pop > 7)) return 0;
            if (rev < Integer.MIN_VALUE/10 || (rev == Integer.MIN_VALUE / 10 && pop < -8)) return 0;
            rev = rev * 10 + pop;
        }
        return rev;
    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
       int a=test(34465);
       System.out.println(a);
	}

}
