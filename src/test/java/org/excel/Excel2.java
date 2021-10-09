package org.excel;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Excel2 {
public static void main(String[] args) throws IOException {
	WebDriverManager.chromedriver().setup();
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.seleniumeasy.com/test/table-pagination-demo.html");
	WebElement findElement = driver.findElement(By.tagName("table"));
	WebElement findElement2 = findElement.findElement(By.tagName("thead"));
	WebElement findElement3 = findElement2.findElement(By.tagName("tr"));
	List<WebElement> findElements = findElement3.findElements(By.tagName("th"));
	int size = findElements.size();
	File f = new File("C:\\Users\\1611r\\Desktop\\framewwork\\excel17.xlsx");
	Workbook w = new XSSFWorkbook();
	Sheet createSheet = w.createSheet("ramesh");
	Row createRow = createSheet.createRow(0);
	for (int i = 0; i < size; i++) {
		Cell createCell = createRow.createCell(i);
		WebElement webElement = findElements.get(i);
		String text = webElement.getText();
		createCell.setCellValue(text);
	}
	WebElement findElement4 = findElement.findElement(By.tagName("tbody"));
	List<WebElement> findElements2 = findElement4.findElements(By.tagName("tr"));
	for (int i = 0; i < findElements2.size(); i++) {
		Row createRow2 = createSheet.createRow(i+1);
		WebElement webElement = findElements2.get(i);
		List<WebElement> findElements3 = webElement.findElements(By.tagName("td"));
		for (int j = 0; j < findElements3.size(); j++) {
			WebElement webElement2 = findElements3.get(j);
			String text = webElement2.getText();
			Cell createCell = createRow2.createCell(j);
			createCell.setCellValue(text);
			
		}
		
	}
	FileOutputStream fil =new FileOutputStream(f);
	w.write(fil);
}
}
