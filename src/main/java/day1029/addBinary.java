package day1029;

public class addBinary {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String a="1010";
		String b="1010";
		int[] c = new int[Math.max(a.length(), b.length())];
		boolean flag = false;
		for(int i=Math.max(a.length(), b.length())-1;i>=0;i--) {
			if(a.charAt(i)=='1' && b.charAt(i)=='1'&& flag == false) {
				c[i]=0;
				flag = true;
			}
			else if(a.charAt(i)=='1' && b.charAt(i)=='1'&& flag == true) {
				c[i]=1;
			}
			else if(a.charAt(i)=='1' && b.charAt(i)=='0'&& flag == true) {
				c[i]=0;
			}
			else if(a.charAt(i)=='1' && b.charAt(i)=='0'&& flag == false) {
				c[i]=1;
			}
			else if(a.charAt(i)=='0' && b.charAt(i)=='0'&& flag == false) {
				c[i]=0;
			}
			else if(a.charAt(i)=='0' && b.charAt(i)=='0'&& flag == true) {
				c[i]=1;
				flag = false;
			}
			else if(a.charAt(i)=='0' && b.charAt(i)=='1'&& flag == true) {
				c[i]=0;
			}
			else if(a.charAt(i)=='0' && b.charAt(i)=='1'&& flag == false) {
				c[i]=1;
			}
			
		}
		if(c[0]==0) {
			
		}
		
		for(int i=0;i<c.length;i++) {
			System.out.print(c[i]);
		}

	}

}
