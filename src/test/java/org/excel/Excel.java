package org.excel;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
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




public class Excel {
public static void main(String[] args) throws IOException, InterruptedException  {
	WebDriverManager.chromedriver().setup();
	WebDriver driver = new ChromeDriver();
	driver.get("https://adactinhotelapp.com/");
		File fi = new File("C:\\Users\\1611r\\eclipse-workspace\\New\\testdata\\Book1.xlsx");
		FileInputStream f =new FileInputStream(fi);
		Workbook w =new XSSFWorkbook(f);
		Sheet sheet = w.getSheet("Sheet1");
		int r = sheet.getPhysicalNumberOfRows();
		Row row = sheet.getRow(0);
		Cell cell = row.getCell(0);
		String z = cell.getStringCellValue();
		WebElement findElement = driver.findElement(By.id("username"));
		findElement.sendKeys(z);
		Row row1 = sheet.getRow(1);
		Cell cell1= row1.getCell(0);
		String z1 = cell1.getStringCellValue();
		WebElement findElement2 = driver.findElement(By.id("password"));
		findElement2.sendKeys(z1);
		WebElement findElement3 = driver.findElement(By.id("login"));
		findElement3.click();
		Row row2 = sheet.getRow(0);
		Cell cell2= row2.getCell(1);
		String z2 = cell2.getStringCellValue();
		WebElement findElement4 = driver.findElement(By.id("location"));
		findElement4.sendKeys(z2);
		Row row3 = sheet.getRow(1);
		Cell cell3= row3.getCell(1);
		String z3 = cell3.getStringCellValue();
		WebElement findElement5 = driver.findElement(By.id("hotels"));
		findElement5.sendKeys(z3);
		Row row4 = sheet.getRow(0);
		Cell cell4= row4.getCell(2);
		String z4 = cell4.getStringCellValue();
		WebElement findElement6 = driver.findElement(By.id("room_type"));
		findElement6.sendKeys(z4);
		WebElement findElement9 = driver.findElement(By.id("Submit"));
		findElement9.click();
		WebElement findElement7 = driver.findElement(By.id("radiobutton_0"));
		findElement7.click();
		WebElement findElement8 = driver.findElement(By.id("continue"));
		findElement8.click();
	}
}







