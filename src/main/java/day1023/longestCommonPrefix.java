package day1023;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class longestCommonPrefix {

	public static void longestCommonPrefix1(String[] str) {
		List<Map> li = new ArrayList();
		for (int i = 0; i < str.length; i++) {
			Map<Integer, String> map = new HashMap();
			for (int j = 0; j < str[i].length(); j++) {
				map.put(j, str[i].substring(j, j + 1));
			}
			li.add(map);
		}
		String commonpre = null;
		boolean flag = true;
		if (li.get(0).size() > 0) {
			// todo li.get(0) 返回的是一个map，遍历就有问题
			for (int f = 1; f < li.get(0).size(); f++) {
				if (flag == true) {
					boolean flag1 = true;
					for (int g = 0; g < li.size() - 1; g++) {
						if (flag1 == true) {
							// TODO 应该是把两个map里面的值分别拿出来比较
							if (li.get(g).get(f - 1) != li.get(g + 1).get(f)) {
								flag1 = false;
								break;
							}
						}
					}

				} else
					break;
				commonpre = str[0].substring(0, f);

			}
		} else {
			boolean flag1 = true;
			for (int g = 0; g < li.size() - 1; g++) {
				if (flag1 == true) {
					if (li.get(g).get(0) != li.get(g + 1).get(0)) {
						flag1 = false;
						break;
					}
				}
			}
			commonpre = str[0];

		}
		System.out.println("commonpre:" + commonpre);

	}

	public static void main(String[] args) {
		String[] str = { "ab", "abc" };
		longestCommonPrefix1(str);
		System.out.println("aa");

	}
	
	public static void longestCommonPrefixTest(String[] str) {
		List<String> strList=Arrays.asList(str);
		
	}
}
