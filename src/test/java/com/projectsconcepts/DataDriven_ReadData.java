package com.projectsconcepts;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Iterator;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class DataDriven_ReadData {
  
	public static void particular_Cell_Data() throws IOException {
	
		 System.out.println("Particular Cell : Balas's Tamil Mark ");
		 
	 File f = new File("C:\\Users\\HP\\eclipse-workspace\\Project_Maven\\DatDriven - sample.xlsx"); 
	 FileInputStream fis = new  FileInputStream(f); 
	 Workbook wb = new XSSFWorkbook(fis); 
	 Sheet s = wb.getSheetAt(0);   
	 Row r = s.getRow(3); 
	 Cell c = r.getCell(2); 
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
	public static void particular_Row_Data() throws IOException {
		 
		 File f = new File("C:\\Users\\HP\\eclipse-workspace\\Project_Maven\\DatDriven - sample.xlsx"); 
		 FileInputStream fis = new  FileInputStream(f); 
		 Workbook wb = new XSSFWorkbook(fis); 
		 Sheet s = wb.getSheetAt(0);  
		 Row r = s.getRow(1);
		 
		 int noofcells = r.getPhysicalNumberOfCells();
		 System.out.println("No of Cells: " + noofcells);
		 System.out.println("Particular Row : Abhi Marks ");
		
		  for (int i = 0; i < r.getPhysicalNumberOfCells() ; i++) {
			   Cell c = r.getCell(i); 
		      CellType type = c.getCellType(); 
			 
			 if (type.equals(CellType.STRING)) {
			   	 String value = c.getStringCellValue();
			   	 System.out.println(value);
			   	 }
			 else if (type.equals(CellType.NUMERIC)) {
				double d = c.getNumericCellValue();
				System.out.println(d);
			}
		  }
		  wb.close();
	}
	 public static  void particular_column_Data() throws IOException {
		 
		 File f = new File("C:\\Users\\HP\\eclipse-workspace\\Project_Maven\\DatDriven - sample.xlsx"); 
		 FileInputStream fis = new  FileInputStream(f); 
		 Workbook wb = new XSSFWorkbook(fis); 
		 Sheet s = wb.getSheetAt(0); 
		 
		 int noofrows = s.getPhysicalNumberOfRows();
		 System.out.println("No of Rows: " + noofrows);
		 System.out.println("Particular Column : Students Name");
		 
		  for (int i = 0; i <noofrows ; i++) {
			  Row r = s.getRow(i);
	         Cell c = r.getCell(0);
				
			  CellType type = c.getCellType();
			  
			  if (type.equals(CellType.STRING)) {
				   	 String value = c.getStringCellValue();
				   	 System.out.println(value);
				   	 }
				 else if (type.equals(CellType.NUMERIC)) {
					double d = c.getNumericCellValue();
					System.out.println(d);
				}
		  
			  }
		  wb.close();
	}
	
	 public static  void all_Data() throws IOException {
		 File f = new File("C:\\Users\\HP\\eclipse-workspace\\Project_Maven\\DatDriven - sample.xlsx"); 
		 FileInputStream fis = new  FileInputStream(f); 
		 Workbook wb = new XSSFWorkbook(fis); 
		 Sheet s = wb.getSheetAt(0);
		 
		 int norows = s.getPhysicalNumberOfRows();
		 
		 for (int i = 0; i <norows; i++) {
			 Row r = s.getRow(i);
			 System.out.println();
			 int nocell = r.getPhysicalNumberOfCells();
			 
			 for (int j = 0; j <nocell; j++) {
				Cell c = r.getCell(j);
				
				CellType type = c.getCellType();
				
				  if (type.equals(CellType.NUMERIC)) {
					double d = c.getNumericCellValue();
					int a = (int) d;
					String value = String.valueOf(a);
					System.out.print(value);
					System.out.print(" ");
				}
				  else if (type.equals(CellType.STRING)) {
					   	 String value = c.getStringCellValue();
					   	 System.out.print(value);
					   	System.out.print(" ");
					   	 }
			}
		}
		 wb.close();
	 }     
		
	 public static void main(String[] args) throws IOException {
		particular_Cell_Data();
		particular_Row_Data();
		particular_column_Data();
		all_Data();
		
	}
}
