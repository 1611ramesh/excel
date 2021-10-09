package org.excel;

import java.io.File;
import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class New {
	
	File f = new File("C:\\Users\\1611r\\eclipse-workspace\\New\\testdata\\Book1.xlsx" );
	FileInputStream fi = new FileInputStream(f);
	File f1 = new File("C:\\Users\\1611r\\Desktop\\framewwork\\xtox13.xlsx");
	Workbook w1 = new XSSFWorkbook();
	Sheet createSheet = w1.createSheet("ram");
	Workbook w = new XSSFWorkbook(fi); 
	Sheet sheet = w.getSheet("Sheet1");
	int a = sheet.getPhysicalNumberOfRows();
}
