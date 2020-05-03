package com.day1016;

import java.util.HashMap;
import java.util.Map;



public class romanToInt {
	
	public static void romanToInt(String s){
		Map<Character,Integer> romanInt = new HashMap();
			romanInt.put('I',1);
			romanInt.put('V',5);
			romanInt.put('X',10);
			romanInt.put('L',50);
			romanInt.put('C',100);
			romanInt.put('D',500);
			romanInt.put('M',1000);
			int sum=0;
			if(s.length()==2 && 
					((s.charAt(0)=='I'&& s.charAt(1)=='V'||s.charAt(1)=='X')||
							(s.charAt(0)=='C'&& s.charAt(1)=='D'||s.charAt(1)=='M')||
							(s.charAt(0)=='X'&& s.charAt(1)=='L'||s.charAt(1)=='C'))) {
					sum=romanInt.get(s.charAt(1))-romanInt.get(s.charAt(0));

				System.out.println(sum);
				
			}
			else {
			for(int i=0;i<s.length();i++) {
				sum=sum+romanInt.get(s.charAt(i));
			}
			System.out.println(sum);
			}
		
		
		/*
		//判断输入是否符合规范
		char[] romanum = {'I','V','X','L','C','D','M'};
		for(int i=0;i<s.length();i++) {
			boolean flag = false;
			System.out.println("第"+(i+1)+"个字母为："+s.charAt(i));
			for(int j=0;j<romanum.length;j++) {
				if(romanum[j]==s.charAt(i)) {
					flag=true;
				}
			}
			if(flag==false) {
				System.out.println("第"+(i+1)+"个字母input wrong");
			}
			}
		
		*/
		}

	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		romanToInt("MCMXCIV");

	}

}
