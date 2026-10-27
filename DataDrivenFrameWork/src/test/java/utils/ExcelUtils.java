package utils;

import java.io.FileInputStream;
import org.apache.poi.ss.usermodel.*;

public class ExcelUtils {

    public static String getCellData(String filePath, String sheetName, int row, int col) {

        String data = "";

        try {
            FileInputStream fis = new FileInputStream(filePath);
            Workbook wb = WorkbookFactory.create(fis);
            Sheet sheet = wb.getSheet(sheetName);

            data = sheet.getRow(row).getCell(col).toString();
            wb.close();

        } catch (Exception e) {
            e.printStackTrace();
        }

        return data;
    }
}