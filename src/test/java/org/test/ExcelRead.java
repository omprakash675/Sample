package org.test;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelRead {
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
				Cell c = row.getCell(2);		
				System.out.println(c);
				
				//Getting Cell Type
				int cellType = c.getCellType(); 
				System.out.println(cellType); 
				
				//To check whether cell is string 
				if (cellType==1) {
					//TO get the value from the cell --- string
					String value = c.getStringCellValue();
					//Print value
					System.out.println(value);
					
				}
				// To check whether cell is number
				else if (cellType==0) {
					//To check cell is date format
					if (DateUtil.isCellDateFormatted(c)) {
						//to get the value from the cell as date
						Date date = c.getDateCellValue();
						//Date as required format
						SimpleDateFormat sim = new SimpleDateFormat("MM/dd/yyyy");
						//convert the date into string
						String format = sim.format(date);
						//Print date
						System.out.println(format);
						
					} else {
						double d = c.getNumericCellValue();
						//typecast ---> double ----> long
						long l =(long) d;
						// converting long ----> String
						String valueOf = String.valueOf(l);
						//Printing the value
						System.out.println(valueOf);

					}
					
				} 
	}

}
