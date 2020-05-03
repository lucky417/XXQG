package day1110;

import java.util.ArrayList;
import java.util.List;

public class Trangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> li1 = new ArrayList<Integer>();
		List<List<Integer>> lisum = new ArrayList<List<Integer>>();
		int n=5;
		li1.add(0, 1);
		lisum.add(0, li1);
		for (int i = 1; i < n; i++) {
			List<Integer> li = new ArrayList<Integer>();
			li.add(0, 1);
			for(int j=1;j<i;j++) {
				li.add(j,lisum.get(i-1).get(j-1)+lisum.get(i-1).get(j));
			}
			li.add(i, 1);
			lisum.add(i, li);
		}
		for(int f=0;f<n;f++) {
			System.out.print(lisum.get(n-1).get(f));
		}
	}

}
