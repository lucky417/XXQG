package com.day0925;

import java.util.ArrayList;
import java.util.List;

public class WaterFlower {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=0;
		int b=0;
		int c=0;
		for(int i=100;i<=999;i++) {
			// String st = String.valueOf(i);
             a=i/100;
             b=i%10;
             c=i/10%10;
             if(a*a*a+b*b*b+c*c*c==i)
            	 System.out.println(i+" "+b+c);
			}
		}


}
