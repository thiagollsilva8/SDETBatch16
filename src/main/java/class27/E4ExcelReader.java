package class27;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import utils.Constants;

import java.io.FileInputStream;
import java.io.IOException;

public class E4ExcelReader {

    public static void main(String[] args) throws IOException {

        FileInputStream fileInputStream = new FileInputStream(Constants.EXCEL_FILE_PATH);

        // Special call which knows how to read the data from Excel files
        XSSFWorkbook xssfWorkbook = new XSSFWorkbook(fileInputStream);
        Sheet sheet = xssfWorkbook.getSheet("Sheet1");

        for (int rows = 0; rows < sheet.getPhysicalNumberOfRows(); rows++) {
            Row row = sheet.getRow(rows);


            for (int col = 0; col < row.getPhysicalNumberOfCells(); col++) {
                System.out.print(row.getCell(col) + " ");
            }
            System.out.println();

        /*
        System.out.println(row.getCell(0)+" ");
        System.out.println(row.getCell(1)+" ");
        System.out.println(row.getCell(2)+" ");
        System.out.println(row.getCell(3)+" ");
        System.out.println(row.getCell(4)+" ");
        */


        }


    }
}

