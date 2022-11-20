package com.projectsconcepts;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Logger;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class DataDriven_WriteData {
  
	 static Logger  log = Logger.getLogger(DataDriven_WriteData.class);
	
	public static void write_Data(String a) throws IOException {
  
		BasicConfigurator.configure();
		
		 File f = new File("C:\\Users\\HP\\Desktop\\Write Data.xlsx"); 
		 FileInputStream fis = new  FileInputStream(f); 
		 Workbook wb = new XSSFWorkbook(fis); 
		 wb.createSheet(a).createRow(0).createCell(0).setCellValue("FirstName");
		 wb.getSheet(a).getRow(0).createCell(1).setCellValue("Monica");
		 wb.getSheet(a).getRow(0).createCell(2).setCellValue("Indhu");
		 wb.getSheet(a).createRow(1).createCell(0).setCellValue("LastName");
		 wb.getSheet(a).getRow(1).createCell(1).setCellValue("N");
		 wb.getSheet(a).getRow(1).createCell(2).setCellValue("V");
		 
		 FileOutputStream fos = new FileOutputStream(f);
		 wb.write(fos);
		 wb.close();
		 
		 log.info("Data passed successfully");
	}
	
	public static void main(String[] args) throws IOException {
		write_Data("Data");
	}
}
