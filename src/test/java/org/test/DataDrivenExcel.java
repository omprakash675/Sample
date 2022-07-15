package org.test;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class DataDrivenExcel {
	public static void main(String[] args) throws IOException {
		//1. File Path/Location
		File f = new File ("C:\\Users\\Om Prakash\\eclipse-workspace\\Sample\\Excel\\Excel Ref.xlsx");
		
		//2.Get into the File ---> Get the Objects
		FileInputStream fin = new FileInputStream (f);
		
		//3.Get the workbook
		Workbook w = new XSSFWorkbook(fin);
		
		//4. Get the Sheet
		Sheet sheet = w.getSheet("Sheet1");
		
		//5. Get the Row 
		Row row = sheet.getRow(2);
		
		//6. Get the Cell
		Cell cell = row.getCell(2);
		
		//7. Print the value
		System.out.println(cell);
	}

}
