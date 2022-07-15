package org.test; //Comparing the string value of the cell using "IF" and Inserting value

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelWriteTwo {
	public static void main(String[] args) throws IOException { //Comparing the string value of the cell using "IF" and Inserting value
		//1. File Path/Location
				File f = new File ("C:\\Users\\Om Prakash\\eclipse-workspace\\Sample\\Excel\\Excel Ref.xlsx");
				
				//2.Get into the File ---> Get the Objects
				FileInputStream fin = new FileInputStream (f);
				
				//3.Get the workbook
				Workbook w = new XSSFWorkbook(fin);
				//creating sheet
				Sheet s = w.getSheet("Sheet1");
				Row r = s.getRow(4);
				Cell c = r.getCell(0);
				//Getting the string value
				String value = c.getStringCellValue();
				//Comparing with the value and inserting
				if (value.equals("Ragu")) {
					c.setCellValue("qwe");
				}
				//FOut class is important to insert value
				FileOutputStream fout = new FileOutputStream (f);
				w.write(fout);
				System.out.println("Done");
				
	}

}
