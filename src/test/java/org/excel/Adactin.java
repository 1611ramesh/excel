package org.excel;

import java.io.File;
import java.io.FileInputStream;
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
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.apache.poi.ss.usermodel.Row.MissingCellPolicy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Adactin extends Baseclass{
	public static void main(String[] args) throws IOException, InterruptedException {
		Baseclass b = new Baseclass();
		b.getdriver("https://adactinhotelapp.com/");
		WebElement findelement = b.findelement("id", "username");
		String getcellvalue = b.getcellvalue("C:\\Users\\1611r\\Desktop\\adactin.xlsx", "Sheet1", 0, 0);
		findelement.sendKeys(getcellvalue);
		WebElement findelement2 = b.findelement("id", "password");
		String getcellvalue2 = b.getcellvalue("C:\\Users\\1611r\\Desktop\\adactin.xlsx", "Sheet1", 1, 0);
		b.sendkey(findelement2, getcellvalue2);
		WebElement findelement3 = b.findelement("id", "login");
		findelement3.click();
		WebElement findelement4 = b.findelement("id", "location");
		String getcellvalue3 = b.getcellvalue("C:\\Users\\1611r\\Desktop\\adactin.xlsx", "Sheet1", 0, 1);
		findelement4.sendKeys(getcellvalue3);
		WebElement findelement5 = b.findelement("id", "hotels");
		String getcellvalue4 = b.getcellvalue("C:\\Users\\1611r\\Desktop\\adactin.xlsx", "Sheet1", 1, 1);
		findelement5.sendKeys(getcellvalue4);
		WebElement findelement6 = b.findelement("id", "room_type");
		String getcellvalue5 = b.getcellvalue("C:\\Users\\1611r\\Desktop\\adactin.xlsx", "Sheet1", 0, 2);
		findelement6.sendKeys(getcellvalue5);
		WebElement findelement7 = b.findelement("id", "room_nos");
		String getcellvalue6 = b.getcellvalue("C:\\Users\\1611r\\Desktop\\adactin.xlsx", "Sheet1", 1, 2);
		findelement7.sendKeys(getcellvalue6);
		WebElement findelement8 = b.findelement("id", "datepick_in");
		findelement8.clear();
		String getcellvalue7 = b.getcellvalue("C:\\Users\\1611r\\Desktop\\adactin.xlsx", "Sheet1", 2, 0);
		findelement8.sendKeys(getcellvalue7);
		WebElement findelement9 = b.findelement("id", "datepick_out");
		findelement9.clear();
		String getcellvalue8 = b.getcellvalue("C:\\Users\\1611r\\Desktop\\adactin.xlsx", "Sheet1", 2, 1);
		findelement9.sendKeys(getcellvalue8);
		WebElement findelement22 = b.findelement("id", "adult_room");
		findelement22.sendKeys(getcellvalue6);
		WebElement findelement10 = b.findelement("id", "Submit");
		findelement10.click();
		WebElement findelement11 = b.findelement("id", "radiobutton_0");
		findelement11.click();
		WebElement findelement12 = b.findelement("id", "continue");
		findelement12.click();
		WebElement findelement13 = b.findelement("id", "first_name");
		String getcellvalue9 = b.getcellvalue("C:\\Users\\1611r\\Desktop\\adactin.xlsx", "Sheet1", 2, 2);
		findelement13.sendKeys(getcellvalue9);
		WebElement findelement14 = b.findelement("id", "last_name");
		String getcellvalue10 = b.getcellvalue("C:\\Users\\1611r\\Desktop\\adactin.xlsx", "Sheet1", 3, 2);
		findelement14.sendKeys(getcellvalue10);
		WebElement findelement15 = b.findelement("id", "address");
		String getcellvalue11 = b.getcellvalue("C:\\Users\\1611r\\Desktop\\adactin.xlsx", "Sheet1", 3, 0);
		findelement15.sendKeys(getcellvalue11);
		WebElement findelement16 = b.findelement("id", "cc_num");
		String getcellvalue12 = b.getcellvalue("C:\\Users\\1611r\\Desktop\\adactin.xlsx", "Sheet1", 4, 0);
		findelement16.sendKeys(getcellvalue12);
		WebElement findelement17 = b.findelement("id", "cc_type");
		b.selectbyindex(findelement17, 2);
		WebElement findelement18 = b.findelement("id", "cc_exp_month");
		b.selectbyindex(findelement18, 4);
		WebElement findelement19 = b.findelement("id", "cc_exp_year");
		b.selectbyindex(findelement19, 12);
		WebElement findelement20 = b.findelement("id", "cc_cvv");
		String getcellvalue13 = b.getcellvalue("C:\\Users\\1611r\\Desktop\\adactin.xlsx", "Sheet1", 4, 1);
		findelement20.sendKeys(getcellvalue13);
		WebElement findelement21 = b.findelement("id", "book_now");
		findelement21.click();
		Thread.sleep(8000);
		WebElement findelement23 = b.findelement("id", "order_no");
		String attribute = findelement23.getAttribute("value");
		System.out.println(attribute);
		
		
		
		
		
		
		
	}

}
