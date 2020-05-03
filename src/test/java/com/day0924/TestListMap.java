package com.day0924;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class TestListMap {
    public void count(List<Student> students){  
        Map<String, List<Student>> m = new HashMap<String, List<Student>>();  
        //得到list中的学生的班级信息，按不同的班级添加到Map中  
        for (int i = 0; i < students.size(); i++) {  
            Student s = (Student) students.get(i);  
            String classNumber = s.getClassnum();  
            //如果班级存在就将学生添加到该班级对应的学生集合中  
            if (m.containsKey(classNumber)) {  
                List<Student> list = m.get(classNumber);  
                list.add(s);  
  
            } else {  
                List<Student> list = new ArrayList<Student>();  
                list.add(s);  
                m.put(classNumber, list);  
            }  
        }  
        //遍历map集合 获得班级 和对应的学生集合  
        for (Entry<String, List<Student>> ent : m.entrySet()) {  
            List<Student> s = ent.getValue();  
            int total = 0;  
          //遍历学生集合得到每个学生的分数 求总和  
            for (int n = 0; n < s.size(); n++) {  
                total = total + s.get(n).getScore();  
            }  
            System.out.println(ent.getKey() + "班 总分:" + total + " 平均分:"  
                    + (float) total / s.size() + " 人数：" + s.size());  
        } 

    }
}   
        
