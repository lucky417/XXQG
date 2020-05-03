package day1107;

import java.util.ArrayList;
import java.util.List;

/*给定一个非负整数 numRows，生成杨辉三角的前 numRows 行。
 * 输入: 5
输出:
[
     [1],
    [1,1],
   [1,2,1],
  [1,3,3,1],
 [1,4,6,4,1]
]*/
public class generate {
	   public static List<List<Integer>> generate(int n){
		   List<List<Integer>> lisum = new ArrayList<List<Integer>>();
		   List<Integer> li1 = new ArrayList<Integer>();
		   li1.add(1);
		   lisum.add(li1);
		   li1.add(1,1);
		   lisum.add(li1);
		   
		   for(int j=3;j<=n;j++) {
		   
		   List<Integer> li = new ArrayList<Integer>();
		   li.add(0, 1);
		   for(int i=1;i<j;i++) {
			   li.add(i, (lisum.get(j-1).get(i-1)+lisum.get(j-1).get(i)));
		   }
		   li.add(j-1, 1);
		   lisum.add(li);
		   }
		   
		   
		return lisum;
		   
	   }

	public static void main(String[] args) {
		
		   List<List<Integer>> li2 = new ArrayList<List<Integer>>();
		   li2= generate(5);
		for(int i=0;i<5;i++) {
			System.out.println(li2.get(i));
			
		}
		// TODO Auto-generated method stub

	}

}
