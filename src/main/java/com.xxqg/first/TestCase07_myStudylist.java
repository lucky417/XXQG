package com.xxqg.first;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class TestCase07_myStudylist {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> list = new ArrayList<String>();
		list.add("yang");
		list.add("xing");
		//第一种使用foreach遍历List
		for (String Str : list) {
			System.out.println(Str);
		}
		//使用get方法获取遍历值
		for (int i=0;i<list.size();i++) {
			System.out.println(list.get(i));
		}
		
		//把list转换为数组再遍历
		String[] Arryli = new String[list.size()];
		list.toArray(Arryli);
		System.out.println("数组模式1：");
		for(String str:Arryli) {
			System.out.println(str);
		}
		
		System.out.println("数组模式2：");
		for(int i=0;i<Arryli.length;i++) {
			System.out.println(Arryli[i]);
			
		}
		
		//第三种遍历，使用迭代器遍历
		
		Iterator<String> ite= list.iterator();
		System.out.println("迭代器");
		while(ite.hasNext()) {
			System.out.println(ite.next());
		}
	}

}
