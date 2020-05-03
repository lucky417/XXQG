package com.day1022;

import java.util.HashMap;
import java.util.Map;

public class romToInt {
	public static void romanToInt(String s){
		Map<String,Integer> romanInt = new HashMap();
			romanInt.put("I",1);
			romanInt.put("V",5);
			romanInt.put("X",10);
			romanInt.put("L",50);
			romanInt.put("C",100);
			romanInt.put("D",500);
			romanInt.put("M",1000);
			romanInt.put("IV", 4);
			romanInt.put("IX", 9);
			romanInt.put("XL", 40);
			romanInt.put("XC", 90);
			romanInt.put("CD", 400);
			romanInt.put("CM", 900);
			int sum=0;
			for(int i=0;i<s.length();){
				if(i+1<s.length()&&romanInt.containsKey(s.substring(i, i+2))) {
					sum=sum+romanInt.get(s.substring(i, i+2));
					i=i+2;
				}
				else {
					sum=sum+romanInt.get(s.substring(i,i+1));
					i++;
				}
			}
			System.out.println(sum);
			
			}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		romanToInt("MCMXCIV");
	}

}
