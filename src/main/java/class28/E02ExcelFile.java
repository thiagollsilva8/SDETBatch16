package class28;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class E02ExcelFile {

    public static void main(String[] args) throws IOException {

        String path = "Files/Employees.xlsx";
        // WE use FileInputStream to read the existing data
        FileInputStream fileInputStream = new FileInputStream(path);
        XSSFWorkbook xssfWorkbook = new XSSFWorkbook(fileInputStream);
        Sheet sheet = xssfWorkbook.getSheet("Sheet1");
        Row row = sheet.createRow(5);
        row.createCell(0).setCellValue("Moncef");
        row.createCell(1).setCellValue("M");
        row.createCell(2).setCellValue("Belgas");
        // Creates an empty file
        FileOutputStream fileOutputStream = new FileOutputStream(path);
        // Data is written to that file
        xssfWorkbook.write(fileOutputStream);


    }
}
