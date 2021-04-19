package day20200528;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;

import java.util.List;

public class Test {
    public static void main(String[] args) {
        //json 格式  {brand:"Bin"，color："red"}

        //1、字符串转对象
        System.out.println("1、字符串转对象");
        String json1 = "{brand:\"Bin\",color:\"red\"}";
        Car car1 = JSONObject.parseObject(json1, Car.class);
        System.out.println("aaa"+car1);
        System.out.println("_______________________________________");
        //2、对象转字符串
        System.out.println("2、对象转字符串");
        Car car2 = new Car("bao","blue");
        String json2 = JSONObject.toJSONString(car2);
        System.out.println(json2);
        System.out.println("---------------------------------------");
        //3、json 字符串数组转为list集合
        System.out.println("3、json 字符串数组转为list集合");
        String json3 ="[{\"brand\":\"aaa\",\"color\":\"green\"},{\"brand\":\"bao\",\"color\":\"blue\"}]";
        List<Car> car3 = JSONObject.parseArray(json3,Car.class);
        System.out.println(car3);
    }
}
