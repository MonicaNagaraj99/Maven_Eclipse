package com.runnerwithbase;

import java.io.FileNotFoundException;
import java.io.IOException;

import com.utilityfiles.BaseClass_DataDriven;

public class ParticularCell_WithBaseClass extends BaseClass_DataDriven {
    
	
	public static void main(String[] args) throws IOException {
		System.out.println("Particular Cell : Balas's Tamil Mark ");
		read_Data("C:\\Users\\HP\\eclipse-workspace\\Project_Maven\\DatDriven - sample.xlsx",0, 3, 2);
	}
}
