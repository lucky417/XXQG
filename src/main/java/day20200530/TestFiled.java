package day20200530;

import java.io.File;

public class TestFiled {
    public static void main(String[] args) {
        //java提供操作文件或者文件夹的对象
        //常用方法 exist，delete，mkdir，getname
        File file = new File("/Users/lucky/Downloads/test.xls");
        System.out.println(file.exists());
        System.out.println(file.getName());

    }
}
