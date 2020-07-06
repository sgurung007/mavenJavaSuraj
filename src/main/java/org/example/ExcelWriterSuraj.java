package org.example;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class ExcelWriterSuraj {
    public static void main(String[] args) throws IOException {
        XSSFWorkbook workbook = new XSSFWorkbook();
        XSSFSheet sheet = workbook.createSheet("firstSheet");
        Row row0 = sheet.createRow(0);
        Cell cell0 = row0.createCell(0);
        Cell cell1 = row0.createCell(1);

        cell0.setCellValue("gurung");
        cell1.setCellValue("prajapati");

        File file = new File("src/main/resources/myExcel.xlsx");
        FileOutputStream fileOutputStream = new FileOutputStream(file);
        workbook.write(fileOutputStream);
        fileOutputStream.close();

        System.out.println("File Created");


    }
}
