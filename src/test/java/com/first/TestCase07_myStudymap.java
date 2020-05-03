package com.first;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;


public class TestCase07_myStudymap {
public static void main(String[] args) {
	 Map<String,String> map = new HashMap<String, String>();
	 map.put("aa", "11");
	 map.put("bb", "22");
	 
	 //first 普遍使用，二次取值
	 System.out.println("通过Map.keyset遍历key和value");
	 for(String key:map.keySet()) {
		 System.out.println(map.keySet());
		 System.out.println("key:"+ key +" value:"+map.get(key));
	 }
	 
	 //second 通过Map.entry使用iterator遍历 key和value
	 System.out.println("通过Map.entry使用iterator遍历 key和value");
	 Iterator<Map.Entry<String, String>> it = map.entrySet().iterator();
	 while(it.hasNext()) {
		 Map.Entry<String, String> entry = it.next();
		 System.out.println("key:"+entry.getKey()+ "value:"+entry.getValue());
	 }
	 
	 //third 推荐，尤其是容量大时
	 System.out.println("通过map.entrySet遍历");
	 for(Map.Entry<String, String> entry : map.entrySet()) {
		 System.out.println(map.entrySet());
		 System.out.println("key:"+ entry.getKey()+" value:"+entry.getValue());
	 }
}
}
