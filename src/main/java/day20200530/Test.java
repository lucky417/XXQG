package day20200530;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.*;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Test {
    /*java读取 excel文件
    * 1、定位找到文件
    * 2、打开文件
    * 3、找到需要的sheet
    * 4、找到row
    * 5、找到cell
    * 6、关闭文件流
    * */
    public static void main(String[] args) throws Exception {
        //1、定位文件
        FileInputStream file = new FileInputStream("/Users/lucky/Downloads/test.xls");
        //2、打开文件,双击打开
        System.out.println(file);
        Workbook book = WorkbookFactory.create(file);
        System.out.println("book:"+book);
        //3、找到需要的sheet
        Sheet sheet = book.getSheetAt(0);
        System.out.println("sheet:"+ sheet.getLastRowNum());
        //4、找到需要的row
        Row row = sheet.getRow(0);
        System.out.println("row:"+row.getLastCellNum());
        //5、找到cell
        Cell cell = row.getCell(0);
        //cell.setCellType(CellType.STRING);
        String a = cell.getStringCellValue();

        System.out.println("cell"+a);
        //6、关闭文件流
        file.close();

    }

}
