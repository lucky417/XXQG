package com.day1028;

public class lengthOfLastWord {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="this is a name"; 
		String arrays[] = str.split(" ");
		System.out.println(arrays[arrays.length-1].length());

	}

}
