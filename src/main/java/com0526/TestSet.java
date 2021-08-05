package com0526;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class TestSet {

    static  Set<Student> set1 = new HashSet<Student>();
    static  Set<Integer> set2 = new HashSet<Integer>();

    public static  void addNum(){
    Student stu1 = new Student("yang1",21);
    Student stu2 = new Student("yang1",21);
    Student stu3 = new Student("yang3",23);
    set1.add(stu1);
    set1.add(stu2);
    set1.add(stu3);
    }

    public  static  void addIntNUM(){
        set2.add(1);
        set2.add(1);
        set2.add(3);
        set2.add(2);
    }


    //ite遍历
    public static void putNum() {
        Iterator<Student> iter = set1.iterator();
        while (iter.hasNext()) {
            Student stu = iter.next();
            System.out.println(stu.getAge()+stu.getName());
        }

    }

    //for—ench遍历
    public static void  putNum1(){
        for (int i:set2){
            System.out.printf("---"+i);
        }
    }

    public static void main(String[] args) {
        addNum();
        putNum();
        System.out.printf("---------------------");
        addIntNUM();
        putNum1();
    }
}
