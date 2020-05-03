package com.day1024;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class removeDuplicatesLi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = { 0, 0, 1, 1, 1, 2, 2, 3, 3, 4 };
		int cout=0;
		List<Integer> list = new ArrayList<Integer>();
		for (int i : nums) {
			list.add(i);
		}
		for (int i = 0; i < list.size(); i++) {
			for (int j = i + 1; j < list.size();) {
				if (list.get(i) == list.get(j)) {
					list.remove(j);
				} else {
					j++;
				}
			}
		}
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
		cout=list.size();
		System.out.println("cout:"+cout);

	}

}
