package com.reader_singleton;

import java.io.IOException;

public class Filedata_Manager {

	private Filedata_Manager() {}
	
	public static Filedata_Manager getInstanceFD(){

		Filedata_Manager reader = new Filedata_Manager();
		return reader;

	}
	public TestData_Reader getInstanceTD() throws IOException {

		TestData_Reader reader = new TestData_Reader();
		return reader;

	}
}
