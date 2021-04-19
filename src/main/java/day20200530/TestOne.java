package day20200530;

import org.apache.poi.ss.usermodel.*;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class TestOne {
    public static void main(String[] args) throws Exception {
        /*java读取 excel文件
         * 1、定位找到文件
         * 2、打开文件
         * 3、找到需要的sheet
         * 4、找到row
         * 5、找到cell,重新写入值
         * 6、保存到excl
         * 7、关闭文件流
         * */
        FileInputStream file = new FileInputStream("/Users/lucky/Downloads/test.xls");
        Workbook book = WorkbookFactory.create(file);
        Sheet sheet = book.getSheetAt(0);
        Row row = sheet.getRow(0);
        Cell cell = row.getCell(0);
        cell.setCellType(CellType.STRING);
        cell.setCellValue("lucky");


        //6、保存到Excel
        FileOutputStream file2 = new FileOutputStream("/Users/lucky/Downloads/test.xls");
        book.write(file2);
        file2.close();
        file.close();

    }
}
