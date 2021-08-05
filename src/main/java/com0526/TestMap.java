package com0526;


import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class TestMap {
    static Map<Integer, Student> map = new HashMap<Integer, Student>();

    public static void addNum() {
        map.put(1, new Student("yang", 22, "java"));
        map.put(2, new Student("yang", 22, "java"));
    }

    //遍历
    public static void putNum(){
        Iterator<Map.Entry<Integer, Student>> iterator = map.entrySet().iterator();
        while (iterator.hasNext()) {
            Map.Entry<Integer, Student> entry = iterator.next();
            System.out.println("key:" + entry.getKey() + ",value:" + entry.getValue());
        }
    }


    public  static void putNum1(){
        Iterator<Map.Entry<Integer,Student>> iter = map.entrySet().iterator();
        while (iter.hasNext()){
            Map.Entry<Integer,Student> a = iter.next();
            System.out.printf(a.getKey()+a.getValue().getName());
        }
    }

    public static void main(String[] args) {
        addNum();
        putNum1();
    }

}
