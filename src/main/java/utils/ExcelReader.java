package utils;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ExcelReader {

    public static List<Map<String, String>> read(String sheetName, String path) throws IOException {

        FileInputStream fileInputStream = new FileInputStream(path);

        // Special call which knows how to read the data from Excel files
        XSSFWorkbook xssfWorkbook = new XSSFWorkbook(fileInputStream);
        Sheet sheet = xssfWorkbook.getSheet(sheetName);

        List<Map<String, String>> excelData = new ArrayList<>();
        Row headerRow = sheet.getRow(0);

        for (int rows = 1; rows < sheet.getPhysicalNumberOfRows(); rows++) {
            Row row = sheet.getRow(rows);

            Map<String, String> rowMap = new HashMap<>();
            for (int col = 0; col < row.getPhysicalNumberOfCells(); col++) {
                String key = headerRow.getCell(col).toString();
                String value = row.getCell(col).toString();

                rowMap.put(key, value);
            }

            excelData.add(rowMap);

        }
        return excelData;
    }
}
