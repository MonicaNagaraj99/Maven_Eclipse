package com.selenium.concepts;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class GetMethods_Dropdown {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\HP\\eclipse-workspace\\Selenium_Programs\\Drive\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.get("https://letcode.in/dropdowns");

		WebElement fruits = driver.findElement(By.id("fruits"));

		WebElement superheros = driver.findElement(By.id("superheros"));

		Select f = new Select(fruits);
		f.selectByValue("3");
		f.selectByValue("2");

		Select sh = new Select(superheros);
		sh.selectByIndex(5);
		sh.selectByValue("am");
		sh.selectByVisibleText("Batwoman");

		List<WebElement> options_f = f.getOptions();

		System.out.println("Single dropdown");

		for (int i = 0; i < options_f.size(); i++) {
			System.out.println(options_f.get(i).getText());
		}
		System.out.println("-----------------");

		for (WebElement i : options_f) {
			System.out.println(i.getText());
		}

		System.out.println("--------All Selected---------");
		List<WebElement> option_f2 = f.getAllSelectedOptions();

		for (WebElement y : option_f2) {
			System.out.println(y.getText());
		}

		System.out.println("==================");
		System.out.println("Multiple dropdown");

		List<WebElement> options_h = sh.getOptions();

		for (int v = 0; v < options_h.size(); v++) {
			System.out.println(options_h.get(v).getText());
		}
		System.out.println("--------All Selected--------");
		List<WebElement> allSelectedOptions = sh.getAllSelectedOptions();

		for (WebElement v : allSelectedOptions) {
			System.out.println(v.getText());
		}

		System.out.println("-----------------");
		for (int u = 0; u < allSelectedOptions.size(); u++) {
			System.out.println(allSelectedOptions.get(u).getText());
		}
		System.out.println("--------FirstSelected---------");

		WebElement firstSelectedOption = sh.getFirstSelectedOption();
		System.out.println(firstSelectedOption.getText());
	}
}
