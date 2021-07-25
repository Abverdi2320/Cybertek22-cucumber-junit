package com.cybertek.tests;

import org.apache.poi.xssf.usermodel.XSSFShape;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.junit.Test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ExcelRead {

    /*
      In this file we will learn how to read from excel file step by step
     */

    @Test
    public void read_from_excel_file() throws IOException {
        String path = "SampleData.xlsx";

        //To be able to read from Excel file, we need to load it intro FileInputStream
        FileInputStream fileInputStream = new FileInputStream(path);

        //workbook>sheet>row>cell


        //1-Create a Workbook

        XSSFWorkbook workbook = new XSSFWorkbook(fileInputStream);


        //2- We need to get the specific sheet from currently opened workBook

        XSSFSheet sheet = workbook.getSheet("Employees");


        //3- Select row and cell
        //Print out Steven's cell
        //Indexes starts from 0

        System.out.println("sheet.getRow(1).getCell(0) = " + sheet.getRow(1).getCell(0));

    }
}
