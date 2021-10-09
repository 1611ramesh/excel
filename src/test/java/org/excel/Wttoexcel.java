package org.excel;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.List;

import org.apache.poi.ss.formula.udf.UDFFinder;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellStyle;
import org.apache.poi.ss.usermodel.CreationHelper;
import org.apache.poi.ss.usermodel.DataFormat;
import org.apache.poi.ss.usermodel.Font;
import org.apache.poi.ss.usermodel.Name;
import org.apache.poi.ss.usermodel.PictureData;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.Row.MissingCellPolicy;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Wttoexcel {

	public static void main(String[] args) throws IOException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.seleniumeasy.com/test/table-pagination-demo.html");
		WebElement findElement = driver.findElement(By.tagName("table"));
		WebElement findElement2 = findElement.findElement(By.tagName("thead"));
		List<WebElement> findElements = findElement2.findElements(By.tagName("th"));
		WebElement findElement3 = findElement.findElement(By.tagName("tbody"));
		
		File fi = new File("C:\\Users\\1611r\\Desktop\\framewwork\\excel12.xlsx");
		Workbook w = new XSSFWorkbook();
		Sheet createSheet = w.createSheet();
		int size = findElements.size();
		Row createRow = createSheet.createRow(0);
		for (int i = 0; i < size; i++) {
			
			WebElement webElement = findElements.get(i);
			String text = webElement.getText();
			Cell createCell = createRow.createCell(i);
			createCell.setCellValue(text);
		}
		List<WebElement> findElements2 = findElement3.findElements(By.tagName("tr"));
		for (int i = 0; i < findElements2.size(); i++) {
			Row createRow2 = createSheet.createRow(i+1);
			WebElement webElement = findElements2.get(i);
			
			List<WebElement> findElements3 = webElement.findElements(By.tagName("td"));
			int size2 = findElements3.size();
	for (int j = 0; j < size2; j++) {
		Cell createCell = createRow2.createCell(j);
		WebElement webElement2 = findElements3.get(j);
		String text = webElement2.getText();
		createCell.setCellValue(text);
		
			}
			
			
			
		
		
			
			
			
		}
		FileOutputStream fil = new FileOutputStream(fi);
		w.write(fil);
		
}}