package org.test;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelFullRead {
	public static void main(String[] args) throws IOException {
		//1. File Path/Location
				File f = new File ("C:\\Users\\Om Prakash\\eclipse-workspace\\Sample\\Excel\\Excel Ref.xlsx");
				
				//2.Get into the File ---> Get the Objects
				FileInputStream fin = new FileInputStream (f);	
				//3.Get the workbook
				Workbook w = new XSSFWorkbook(fin);
				//4. Get the Sheet
				Sheet s = w.getSheet("Sheet1");				
				//To get the Row count
				int rows = s.getPhysicalNumberOfRows();
				System.out.println("Row Count:"+rows);			
				//To get Cell count
				Row row = s.getRow(1);
				int cells = row.getPhysicalNumberOfCells();
				System.out.println("Cell Count:"+cells);				
				//To get all data
				
				//getting the rows by for loop
				for (int i = 0; i < rows; i++) {
					Row row2 = s.getRow(i);
					//getting cells by for loop
					for (int j = 0; j < cells; j++) {
						Cell cell = row2.getCell(j);
						System.out.println(cell);
					}
				} 
	}

}
