package com.first;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;

import javax.imageio.stream.FileImageInputStream;

public class TestCase08_myStudyIO {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
	/*	
		//使用buffereReader在控制台读取字符
		char c;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("输入字符，按下'q'退出");
        do {
        	c=(char)br.read();
        	System.out.println(c);
        }
        while(c !='q');
        	*/
		/*
		//从控制台读取字符串
		BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
	String str;
	System.out.println("enter lines of text:");
	System.out.println("enter END to quit");
		do {
		str= br.readLine();
		System.out.println(str);
	} while (!str.equals("end"));
	*/
   //inputStream and outputStream
		byte bWrite[] = {11,12,13,14};
		OutputStream os = new FileOutputStream("test.txt");
		for(int x =0;x<bWrite.length;x++) {
			os.write(bWrite[x]);
		}
		os.close();
		
		InputStream is = new FileInputStream("test.txt");
		int size =is.available();
		for(int i=0;i<=size;i++) {
			System.out.println((char)is.read()+" ");
		}
		is.close();
		
	}


}
