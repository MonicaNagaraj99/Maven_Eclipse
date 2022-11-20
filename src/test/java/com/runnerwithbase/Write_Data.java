package com.runnerwithbase;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Logger;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;

import com.projectsconcepts.DataDriven_WriteData;
import com.utilityfiles.BaseClass_DataDriven;

public class Write_Data extends BaseClass_DataDriven{
	
	static Logger  log = Logger.getLogger(Write_Data.class);
	
  public static void main(String[] args) throws IOException {
	  
	  BasicConfigurator.configure();
	  
	 File f = path("C:\\Users\\HP\\Desktop\\writedata_utility.xlsx");
	 Workbook wb = input(f);
     create_Sheet(wb, "withlogger");
	 Sheet s2 = get_Sheet(wb, "withlogger");
	 create_setValue(s2, 0, 0, "color");
	 get_SetValue(s2 ,0, 1, "pink");
	 get_SetValue(s2, 0, 2, "blue");
	 create_setValue(s2, 1, 0, "place");
	 get_SetValue(s2, 1, 1, "Coimbatore");
	 get_SetValue(s2,  1, 2, "chennai");
	 output(f, wb);
	 
	 log.info("Data passed successfully");
}
  
  
}
