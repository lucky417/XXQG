
import java.util.HashMap;
import java.util.Map;

/**
 * Created by lingsf on 2019/4/27.
 */
public class TestStudentMap {
    public static void main(String[] args){
        Map<Student,String> map = new HashMap();
        Student a = new Student();
        a.setName("一号");
        a.setSex("男");
        Student b = new Student();
        b.setName("二号");
        b.setSex("女");
        map.put(a, "123");
        map.put(b, "111"); //往map里放了两对数据
        for(Student s:map.keySet()){
            System.out.println("map中含有的数据："+map.get(s));
        }
        System.out.println("map中获取对象a："+map.get(a)); //试了试单独根据key获取值
        System.out.println("map中获取对象b："+map.get(b)); //试了试单独根据key获取值
        System.out.println("存入两个对象之后==========");
        Student c = new Student();

        c.setName("一号");
        c.setSex("男");
        System.out.println("map中获取内容："+map.get(c)); //因为c和a一样，我希望拿到a对应的数据
        map.put(c,"222");
        System.out.println("再存入一个c,c对象的姓名和性别，与a对象的一模一样");
        System.out.println("map中获取对象c："+map.get(c));
        System.out.println("map中获取对象b："+map.get(b));
        System.out.println("map中获取对象a："+map.get(a));

    }
}
