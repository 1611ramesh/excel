package org.excel;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;
import java.beans.PropertyChangeListener;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import java.util.function.Function;

import javax.swing.Action;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Navigation;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.Wait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Baseclass {
	static WebDriver driver;
	Actions a;
	Robot r;
	public static Select s;

	public static void getdriver(String url) {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get(url);

	}

	public static WebElement findelement(String a, String b) {
		if (a.equals("id")) {
			WebElement findElement = driver.findElement(By.id(b));
			return findElement;
		} else if (a.equals("name")) {
			WebElement findElement = driver.findElement(By.name(b));
			return findElement;
		} else {
			WebElement findElement = driver.findElement(By.xpath(b));
			return findElement;
		}

	}

	public static void sendkey(WebElement a, String b) {
		a.sendKeys(b);
	}

	public static void click(WebElement a) {
		a.click();
	}

	public String gettext(WebElement a) {
		String text = a.getText();
		return text;
	}

	public String getattributes(WebElement a, String value) {
		String attribute = a.getAttribute(value);
		return attribute;
	}

	public boolean equals(WebElement a, WebElement b) {
		boolean equals = a.equals(b);
		return equals;
	}

	public static String tagname(WebElement a) {
		String tagName = a.getTagName();
		return tagName;
	}

	public static void selectall(WebElement a) {

		Select s = new Select(a);
		s.deselectAll();
	}

	public static void selectbyvisibletext(WebElement a ,String b) {
		Select s = new Select(a);
		s.selectByVisibleText(b);
	}

	public  void selectbyindex(WebElement a, int b) {
		Select s = new Select(a);
		s.selectByIndex(b);

	}

	public List<WebElement> findelements(String a, String b) {
		if (a.equals("id")) {
			List<WebElement> findElements = driver.findElements(By.id(b));
			return findElements;
		} else if (a.equals("name")) {
			List<WebElement> findElement = driver.findElements(By.name(b));
			return findElement;
		} else {
			List<WebElement> findElement = driver.findElements(By.xpath(b));
			return findElement;
		}

	}

	public String getcellvalue(String a, String b, int c, int d) throws IOException {
		File f = new File(a);
		FileInputStream f1 = new FileInputStream(f);
		Workbook w = new XSSFWorkbook(f1);
		Sheet sheet = w.getSheet(b);
		Row row = sheet.getRow(c);
		Cell cell = row.getCell(d);
		int cellType = cell.getCellType();
		if (cellType == 1) {
			String stringCellValue = cell.getStringCellValue();
			return stringCellValue;
		} else if (DateUtil.isCellDateFormatted(cell)) {
			Date dateCellValue = cell.getDateCellValue();
			SimpleDateFormat s = new SimpleDateFormat("dd/MM/yyyy");
			String format = s.format(dateCellValue);
			return format;

		} else {
			double numericCellValue = cell.getNumericCellValue();
			long l = (long) numericCellValue;
			String valueOf = String.valueOf(l);
			return valueOf;
		}
	}

	public void createcellvalue(String fileplace, String sheetname, int rowi, int celli ,String setvalue)
			throws IOException {
		File f = new File(fileplace);
		Workbook w = new XSSFWorkbook();
		Sheet sheet = w.createSheet(sheetname);
		Row row = sheet.createRow(rowi);
		Cell createCell = row.createCell(celli);
		createCell.setCellValue(setvalue);
		FileOutputStream f1 = new FileOutputStream(f);
		w.write(f1);

	}

	public void movetoelement(WebElement webelement) {
		a = new Actions(driver);
		a.moveToElement(webelement).perform();;

	}

	public void doubleclick(WebElement element) {
		a = new Actions(driver);
		a.doubleClick(element).perform();
	}

	public void contextclick(WebElement element) {
		a = new Actions(driver);
		a.contextClick(element).perform();
	}

	public void draganddrop(WebElement source, WebElement destination) {
		a = new Actions(driver);
		a.dragAndDrop(source, destination);
	}

	public void roboenter() throws AWTException {
		r = new Robot();
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
	}

	public void robokeydown(int b) throws AWTException {

		for (int i = 0; i < b; i++) {
			r = new Robot();
			r.keyPress(KeyEvent.VK_DOWN);
			r.keyRelease(KeyEvent.VK_DOWN);
		}

	}

	public void roboenter(int b) throws AWTException {
		r = new Robot();
		for (int i = 0; i < b; i++) {
			r.keyPress(KeyEvent.VK_ENTER);
			r.keyRelease(KeyEvent.VK_ENTER);
		}}
		public static String gettitle() {
String title = driver.getTitle();
return title;
		}
		
		public static String windowhandle() {
String windowHandle = driver.getWindowHandle();
return windowHandle;
		}
		public Set<String> windowhandles() {
Set<String> windowHandles = driver.getWindowHandles();
return windowHandles ;
		}
	public static void fluentwait(final String a) {
		Wait<WebDriver> we =new FluentWait<WebDriver>(driver).withTimeout(20, TimeUnit.SECONDS).pollingEvery(4, TimeUnit.SECONDS).ignoring(Exception.class);
		WebElement until = we.until(new Function<WebDriver, WebElement>() {

			public WebElement apply(WebDriver t) {
				return driver.findElement(By.xpath(a));
			}
		});}
	public static void implicitwait() {
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
	}
	
	
	
	
	
	
		
		
		
		
}
