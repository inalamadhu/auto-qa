package auto;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Data {
    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream(System.getProperty("user.dir")+"/selenium-qa/src/resources/data.xlsx");
        XSSFWorkbook wb = new XSSFWorkbook(fis);
        Sheet sheet = wb.getSheet("sheet1");
        int rowCount = sheet.getLastRowNum();
        DataFormatter form = new DataFormatter();
        Row row = sheet.getRow(0);
        int cellCount = row.getLastCellNum();
        for(int i=0; i<row.getLastCellNum(); i++){
            Cell cell = row.getCell(i);
            System.out.println(form.formatCellValue(cell));
        }
        row = sheet.getRow(2);
        row.getCell(1).setCellValue("new text");

        wb.write(new FileOutputStream(System.getProperty("user.dir")+"/selenium-qa/src/resources/data.xlsx"));
        wb.close();
    }

}
