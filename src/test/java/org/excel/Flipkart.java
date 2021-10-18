package org.excel;

import java.awt.AWTException;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

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
import io.github.bonigarcia.wdm.managers.ChromeDriverManager;

public class Flipkart extends Baseclass{
public static void main(String[] args) throws AWTException, IOException {
	Baseclass b = new Baseclass();
	b.getdriver("https://www.amazon.in/");
	WebElement findelement = b.findelement("id", "twotabsearchtextbox");
	b.sendkey(findelement, "iphone");
WebElement findelement2 = b.findelement("id", "nav-search-submit-button");
findelement2.click();
List<WebElement> findelements = b.findelements("xpath", "//span[@class='a-size-medium a-color-base a-text-normal']");
List<WebElement> findelements2 = b.findelements("xpath", "//span[@class='a-price-whole']");
File f = new File("C:\\Users\\1611r\\Desktop\\framewwork\\flipkart4.xlsx");
Workbook w = new XSSFWorkbook();
Sheet createSheet = w.createSheet();


for (int i = 0; i < findelements.size(); i++) {
	Row createRow = createSheet.createRow(i);
	
	WebElement webElement = findelements.get(i);
	String text = webElement.getText();
	Cell createCell = createRow.createCell(0);
	Cell createCell2 = createRow.createCell(1);
	createCell.setCellValue(text);
	
	for (int j = i; j < i+1; j++) {
		WebElement webElement2 = findelements2.get(j);
		String text2 = webElement2.getText();
		
		createCell2.setCellValue(text2);
		Map<String, String> m = new TreeMap<String, String>();
				m.put(text, text2);
				Set<String> keySet = (Set<String>) m.values();
				System.out.println(keySet);
				
				
				
				
	}
}
FileOutputStream f1 = new FileOutputStream(f);
w.write(f1);

}


	
}
	
	

	
	

