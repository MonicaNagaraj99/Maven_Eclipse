package com.utilityfiles;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.Point;
import org.openqa.selenium.Rectangle;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BaseClass_WebElements {

	// browser 
	
	public static WebDriver driver;
	
	public static WebDriver browser(String browsername) {
      if (browsername.equalsIgnoreCase("chrome") ) {
    	 System.setProperty("webdriver.chrome.driver","C:\\Users\\HP\\eclipse-workspace\\Project_Maven\\Drive\\chromedriver.exe");
    	  driver = new ChromeDriver();
	} 
      if (browsername.equalsIgnoreCase("edge")) {
    	  System.setProperty("webdriver.edge.driver","C:\\Users\\HP\\eclipse-workspace\\Project_Maven\\Drive\\msedgedriver.exe");
    	  driver = new EdgeDriver();
	}
  	      return driver;
	}

	// WebElement methods 
	public static void click_method(WebElement e) {
		e.click();
	}

	public static void sendKeys_method(WebElement e, String value) {
		e.sendKeys(value);
	}

	public static void clear_method(WebElement e) {
		e.clear();
	}

	public static String getText_method(WebElement e) {
		String text = e.getText();
		return text;
	}

	public static boolean isDisplayed_method(WebElement e) {
		boolean displayed = e.isDisplayed();
		return displayed;
	}

	public static boolean isEnabled_method(WebElement e) {
		boolean enabled = e.isEnabled();
		return enabled;
	}

	public static boolean isSelected_method(WebElement e) {
		boolean selected = e.isSelected();
		return selected;
	}

	public static String getAttributes_method(WebElement e, String attribute_name) {
		String attribute = e.getAttribute(attribute_name);
		return attribute;
	}

	public static String getTagName_method(WebElement e) {
		String tagName = e.getTagName();
		return tagName;
	}

	public static Point getLocation_method(WebElement e) {
		Point location = e.getLocation();
		return location;
	}

	public static Dimension getSize_method(WebElement e) {
		Dimension size = e.getSize();
		return size;
	}

	public static String getCssValue_method(WebElement e, String propertyname) {
		String cssValue = e.getCssValue(propertyname);
		return cssValue;
	}

	public static Rectangle getRectangle_method(WebElement e) {
		Rectangle rect = e.getRect();
		return rect;
	}
 
	// WebDriverMethods 
	
	public static void get_url(String url) {
      driver.get(url);
	}
	
	public static String get_title() {
      String title = driver.getTitle();
      return title;
	}
	
	public static String getCurrent_url() {
       String currentUrl = driver.getCurrentUrl();
       return currentUrl;
	}
	
	public static String get_pagesource() {
      String pageSource = driver.getPageSource();
      return pageSource;
	}
	
	public static void close_Method() {
      driver.close();
	}
	
	public static void quit_Method() {
       driver.quit();
	}
	// navigate to 
	public static void navigate_commands(String commands) {
	    
		 if (commands.equalsIgnoreCase("refresh")) {
			 driver.navigate().refresh(); 
		}
		 else if (commands.equalsIgnoreCase("back")) {
			 driver.navigate().back();
		}
		 else if (commands.equalsIgnoreCase("forward")) {
			 driver.navigate().forward();
		}
     
	    }
	
	public static void manage_commands(String commands) {
          if (commands.equalsIgnoreCase("maximize")) {
			driver.manage().window().maximize();
		}
          else if (commands.equalsIgnoreCase("fullscreen")) {
			driver.manage().window().minimize();
		}
          else if (commands.equalsIgnoreCase("cookies")) {
			driver.manage().deleteAllCookies();
		}
	}
	
	public static Dimension get_size() {
        Dimension size = driver.manage().window().getSize();
        return size;
	}
	public static void set_Size(int width,int height) {
		Dimension a = new Dimension(width,height);
              driver.manage().window().setSize(a);
	}
	//takescreenshot
	
	public static void screenshot(String path) throws IOException {
		TakesScreenshot ss = (TakesScreenshot) driver;
		File source = ss.getScreenshotAs(OutputType.FILE);
		File des = new File(path);
		FileUtils.copyFile(source, des);
	}
	
	// Dropdown methods
	
	public static void dropdown_index(String command, WebElement e, int index) {
		Select s = new Select(e);
		if (command.equalsIgnoreCase("select")) {
			s.selectByIndex(index);
		}
		else if (command.equalsIgnoreCase("deselect")) {
			s.deselectByIndex(index);
		}
	}
	public static void dropdown_value(String command,WebElement e, String value) {
    	 Select s = new Select(e);
    	 if (command.equalsIgnoreCase("select")) {
 			s.selectByValue(value);
 		}
 		else if (command.equalsIgnoreCase("deselect")) {
 			s.deselectByValue(value);
 		}
	}
	public static void dropdown_text(String command, WebElement e, String text) {
		 Select s = new Select(e);
		 if (command.equalsIgnoreCase("select")) {
	 			s.selectByVisibleText(text);
	 		}
	 		else if (command.equalsIgnoreCase("deselect")) {
	 			s.deselectByVisibleText(text);
	 		}
	}
	
	public static void deselect_all(WebElement e) {
		 Select s = new Select(e);
		 s.deselectAll();
	}

	public static boolean isMultiple(WebElement e) {
		 Select s = new Select(e);
		 boolean multiple = s.isMultiple();
		 return multiple;
	}
	
	public static List<WebElement> getOption_method(WebElement e) {
		Select s = new Select(e);
		List<WebElement> options = s.getOptions();
		return options;
	}

	public static List<WebElement> getAllSelected_method(WebElement e) {
		Select s = new Select(e);
		List<WebElement> allSelectedOptions = s.getAllSelectedOptions();
		return allSelectedOptions;
	}

	public static WebElement getFirstSelected_method(WebElement e) {
		Select s = new Select(e);
		WebElement firstSelectedOption = s.getFirstSelectedOption();
		return firstSelectedOption;
	}
	
	// Alert 
	
	public static void simple_alert(String command) {
       if (command.equalsIgnoreCase("accept")) {
    	    driver.switchTo().alert().accept();
	}
       else if (command.equalsIgnoreCase("dismiss")) {
    	   driver.switchTo().alert().dismiss();
       }
	}
	
	public static void alert_sendkeys(String value) {
        driver.switchTo().alert().sendKeys(value);
	}
	
	public static String alert_getText() {
     String text = driver.switchTo().alert().getText();
     return text;  
	}
	
	//Frame
	
	public static void frame_Index(int index) {
          driver.switchTo().frame(index);
	}
	public static void frame_idorname(String idname) {
        driver.switchTo().frame(idname);
	}
	public static void frame_webelement(WebElement e) {
        driver.switchTo().frame(e);
	}
	public static void frame_method(String command) {
     if (command.equalsIgnoreCase("default")) {
		driver.switchTo().defaultContent();
	}
     else if (command.equalsIgnoreCase("parent")) {
		driver.switchTo().parentFrame();
	}
	}
	
	//javascript executor
	
	public static void js_click(WebElement e) {
       JavascriptExecutor js = (JavascriptExecutor) driver;
       js.executeScript("arguments[0].click",e);
	}
	public static  void js_sendkeys(WebElement e,String value) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		   String a = "arguments[0].value='"+value+"'";
	       js.executeScript(a,e);
	}
	public static void js_scroll(WebElement e) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
	       js.executeScript("arguments[0].scrollIntoView()",e);
	}
	public static void highligh(WebElement e) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].setAttribute('style','color:yellow')", e);
	}
	
	//chromeoptions
	
	public static void chromeoptions(String command,String argument) {
          ChromeOptions options = new ChromeOptions();
        if (command.equalsIgnoreCase("notifications")) {
        	driver = new ChromeDriver(options);
        	options.addArguments(argument);
		}  
        else if (command.equalsIgnoreCase("incognito")) {
        	driver = new ChromeDriver(options);
        	options.addArguments(argument);
		}
	}
	//Action
	
	public static void Mouse_Actions( String method,WebElement e) {
      Actions a = new Actions(driver);
      if (method.equalsIgnoreCase("click")) {
    	   a.click(e).build().perform();
	}
      else if (method.equalsIgnoreCase("movetoelement")) {
    	  a.moveToElement(e).build().perform();
	}
      else if(method.equalsIgnoreCase("contextclick")) {
    	  a.contextClick().build().perform();
      }
      }
	
	public static void keyboard_action(String command) throws AWTException {
       Robot r = new Robot();
       if (command.equalsIgnoreCase("down")) {
    	   r.keyPress(KeyEvent.VK_DOWN);
   		  r.keyRelease(KeyEvent.VK_DOWN);
	}
       else if (command.equalsIgnoreCase("enter")) {
    	   r.keyPress(KeyEvent.VK_ENTER);
      	    r.keyRelease(KeyEvent.VK_ENTER);
       } 
	}
	
	// wait 
		public static void sleep(long milliseconds) throws InterruptedException {
			Thread.sleep(milliseconds);
		}
		
		public static void implicitWait(long milliseconds) {
	        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(milliseconds));
		}
		
		public static void explicitwait(long milliseconds) {
       WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(milliseconds));
         wait.until(ExpectedConditions.alertIsPresent());
		}
		
		public static void fluent_wait() {
         Wait<WebDriver> w = new FluentWait<WebDriver>(driver)
        		 .withTimeout(Duration.ofSeconds(0))
        		 .pollingEvery(Duration.ofSeconds(0))
        		 .ignoring(NoSuchElementException.class);
	}
	
		public static void pageload(long milliseconds) {
	       driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(milliseconds));
		}
		
		//windowhandling
		
		public static void windowHandling() {
			String parent = driver.getWindowHandle();
			Set<String> allwindows_ID = driver.getWindowHandles();

			for (String id : allwindows_ID) {
				if (id.equals(parent)) {
					continue;
				}else {
					driver.switchTo().window(id);
				}
			}
		}
		public static  void Multiplewindow(String URL) {
			Set<String> All_id = driver.getWindowHandles();
			for (String id : All_id) {
				if (driver.switchTo().window(id).getCurrentUrl().equals(URL)) {
					break;
				}
			}
		}
		
}
