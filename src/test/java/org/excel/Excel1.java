package org.excel;

import java.io.File;
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

public class Excel1 {
public static void main(String[] args) {
	WebDriverManager.chromedriver().setup();
	WebDriver driver = new ChromeDriver();
	File f = new File("C:\\Users\\1611r\\Desktop\\framewwork");
	Workbook w =new XSSFWorkbook();
	Sheet createSheet = w.createSheet("ram");
	WebElement findElement = driver.findElement(By.tagName("tbody"));
	List<WebElement> findElements = findElement.findElements(By.tagName("th"));
	
	for (int i = 0; i < args.length; i++) {
		Row createRow = createSheet.createRow(i);
		
		
		Cell createCell = createRow.createCell(i);
	}
	
	
	
	
	
	
	
}
}
