package com.day0924;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

import org.apache.poi.ss.formula.functions.Count;
import org.apache.regexp.RE;

public class Test {

	public static void count(List<Student> stu) {
		Map<String, List<Student>> cout = new HashMap<String, List<Student>>();
		for (int i = 0; i < stu.size(); i++) {
			if (cout.containsKey(stu.get(i).getClassnum())) {
				List<Student> stu_class = new ArrayList<Student>();
				stu_class.add(stu.get(i));
			} else {
				List<Student> stu_class = new ArrayList<Student>();
				stu_class.add(stu.get(i));
				cout.put(stu.get(i).getClassnum(), stu_class);
			}
		}
		// throught map get sum and avg
		Map<String, Integer> re = new HashMap<String, Integer>();
		for (Entry<String, List<Student>> A : cout.entrySet()) {
			int sum = 0;
			double avg = 0;
			List<Student> b = new ArrayList<Student>();
			for (int F = 0; F < A.getValue().size(); F++) {
				b.add(A.getValue().get(F));
				for (Student B : b) {
					sum = B.getScore() + sum;
				}
			}
			re.put(A.getKey(), sum);
		}
		for (Map.Entry<String, Integer> o : re.entrySet()) {
			System.out.println("班级：" + o.getKey() + "sum" + o.getValue());

		}
	}

	public static void main(String[] args) {
		List<Student> stu = new ArrayList<Student>();
		stu.add(new Student("aa", "b", 90));
		stu.add(new Student("cd", "s", 80));
		stu.add(new Student("cc", "b", 100));
		// stu.add(new Student("cc", "a", 100));
		count(stu);
	}
}
