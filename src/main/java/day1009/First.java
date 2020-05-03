package day1009;

import java.util.HashMap;
import java.util.Map;

public class First {

	public static void test(int[] da,int sum) {
		Map<Integer,Integer> dat = new HashMap<Integer, Integer>();
		for(int i=0;i<da.length;i++) {
			dat.put(da[i],i);
		}
		for(int i=0;i<da.length;i++) {
			int contain = sum-da[i];
			if(dat.containsKey(contain)&&dat.get(contain)!=i) {
				System.out.println("sum:"+sum+"first num:"+i+"second:"+dat.get(contain));
			}
			}
		}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = {1,2,3};
		test(a,5);

	}

}
