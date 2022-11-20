package com.reader_singleton;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class TestData_Reader {

	public static Properties p;

	public TestData_Reader() throws IOException {
		File f = new File(
				"C:\\Users\\HP\\eclipse-workspace\\Project_Maven\\src\\main\\java\\com\\properties_singleton\\AdactinData.properties");
		FileInputStream fis = new FileInputStream(f);
		p = new Properties();
		p.load(fis);
	}

	public String getUsername() {
		String username = p.getProperty("Username");
		return username;
	}

	public String getPassword() {
		String Password = p.getProperty("Password");
		return Password;
	}

	public String getIndate() {
		String Indate = p.getProperty("Indate");
		return Indate;
	}

	public String getOutdate() {
		String Outdate = p.getProperty("Outdate");
		return Outdate;
	}

	public String getFilename() {
		String Fristname = p.getProperty("Fristname");
		return Fristname;
	}

	public String getLastname() {
		String Lastname = p.getProperty("Lastname");
		return Lastname;
	}

	public String getAddress() {
		String Address = p.getProperty("Address");
		return Address;
	}

	public String getCC_Num() {
		String CC_Num = p.getProperty("CC_Num");
		return CC_Num;
	}

	public String getCVV_Num() {
		String CVV_Num = p.getProperty("CVV_Num");
		return CVV_Num;
	}

	public String getLocation() {
		String Location = p.getProperty("Location");
		return Location;
	}

	public String getHotelIndex() {
		String HotelIndex = p.getProperty("HotelIndex");
		return HotelIndex;
	}

	public String getRoomType() {
		String RoomType = p.getProperty("RoomType");
		return RoomType;
	}

	public String getNoofRooms() {
		String NoofRooms = p.getProperty("NoofRooms");
		return NoofRooms;
	}

	public String getNoofAdult() {
		String NoAdults = p.getProperty("NoAdults");
		return NoAdults;
	}

	public String getNoofChildren() {
		String NoChildren = p.getProperty("NoChildren");
		return NoChildren;
	}

	public String getcctypeIndex() {
		String CCtypeIndex = p.getProperty("CCtypeIndex");
		return CCtypeIndex;
	}

	public String getExpirymonth() {
		String ExpiryMonth = p.getProperty("ExpiryMonth");
		return ExpiryMonth;
	}

	public String getexpiryyear() {
		String ExpiryYear = p.getProperty("ExpiryYear");
		return ExpiryYear;
	}
}
