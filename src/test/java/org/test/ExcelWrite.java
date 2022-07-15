package org.test; //Creating sheet and entering value

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelWrite {  //Creating sheet and entering value
	public static void main(String[] args) throws IOException {
		//1. File Path/Location
		File f = new File ("C:\\Users\\Om Prakash\\eclipse-workspace\\Sample\\Excel\\Excel Ref.xlsx");
		
		//2.Get into the File ---> Get the Objects
		FileInputStream fin = new FileInputStream (f);
		
		//3.Get the workbook
		@SuppressWarnings("resource")
		Workbook w = new XSSFWorkbook(fin);
		//creating sheet
		Sheet s = w.createSheet("Sheet 03");
		Row r = s.createRow(2);
		Cell c = r.createCell(3);
		//setting value for the cell
		c.setCellValue("Ram");
		//FOut class is important to insert value
		FileOutputStream fout = new FileOutputStream (f);
		w.write(fout);
		System.out.println("Done");
		
	}

}
