package com.utilityfiles;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.log4j.Logger;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import com.google.common.collect.ContiguousSet;

public class BaseClass_DataDriven {
	
	public static Workbook wb;
	
	public static void read_Data(String path,int sheet, int row , int cell) throws IOException {
		File f = new File(path); 
		FileInputStream fis = new  FileInputStream(f); 
        wb = new XSSFWorkbook(fis);
		Sheet s = wb.getSheetAt(sheet);
		 Row r = s.getRow(row); 
		 Cell c = r.getCell(cell); 
		 CellType type = c.getCellType(); 
		 
		 if (type.equals(CellType.STRING)) {
		   	 String value = c.getStringCellValue();
		   	 System.out.println(value);
		   	 }
		
		 else if (type.equals(CellType.NUMERIC)) {
			double d = c.getNumericCellValue();
			System.out.println(d);
		}
	
		 wb.close();
	}

  
	public static File path(String loc)  {
		File f = new File(loc);
		return f;
	}
		public static Workbook input(File f) throws IOException{
		FileInputStream fis = new  FileInputStream(f);
		Workbook wb = new XSSFWorkbook(fis);
		return wb;
	}
		public static void create_Sheet(Workbook wb,String name) {
			Sheet s = wb.createSheet(name);
	}
		public static Sheet get_Sheet(Workbook wb,String name) {
			Sheet s = wb.getSheet(name);
			return s;
		}
	public static String create_setValue(Sheet s, int rowindex,int columnindex,String value ) {
        s.createRow(rowindex).createCell(columnindex).setCellValue(value);
        return value;
	}
	public static String get_SetValue(Sheet s,int rowindex,int columnindex,String value) {
		 s.getRow(rowindex).createCell(columnindex).setCellValue(value);
		 return value;
	}
	
	public static void output(File f,Workbook wb) throws IOException {
		 FileOutputStream fos = new FileOutputStream(f);
		 wb.write(fos);
		 wb.close();
	}
}
