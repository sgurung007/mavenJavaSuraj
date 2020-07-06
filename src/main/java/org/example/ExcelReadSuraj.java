package org.example;

import org.apache.poi.ss.usermodel.*;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class ExcelReadSuraj {
    public static void main(String[] args) throws IOException {
        File file = new File("src/main/resources/myExcel.xlsx");
        FileInputStream fileInputStream = new FileInputStream(file);
        Workbook workbook = WorkbookFactory.create(fileInputStream);
        Sheet sheet = workbook.getSheetAt(0);
        Row row0 = sheet.getRow(0);
        Cell cell0 = row0.getCell(0);
        Cell cell1 = row0.getCell(1);

        System.out.println(cell0.getStringCellValue() + "\n" + cell1.getStringCellValue());
        System.out.println("Printing following with the enchanced loop -------------------->\n");

        for (Row row:sheet){
            for (Cell cell:row){
                switch(cell.getCellType()){
                    case STRING:
                        System.out.println(cell);
                        break;
                    case NUMERIC:
                        System.out.println(cell);
                        break;
                }
            }
        }

        fileInputStream.close();
    }
}
