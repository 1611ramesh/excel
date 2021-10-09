package org.excel;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.jsoup.helper.DataUtil;
import org.openqa.selenium.WebDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Exceltoexel {

	public static void main(String[] args) throws IOException {
		WebDriverManager.chromedriver().setup();
		File f = new File("C:\\Users\\1611r\\eclipse-workspace\\New\\testdata\\Book1.xlsx" );
		File f2 = new File("C:\\Users\\1611r\\eclipse-workspace\\New\\testdata\\Book2.xlsx");
		FileInputStream fi = new FileInputStream(f);
		FileInputStream fi2 = new FileInputStream(f2);
		File f1 = new File("C:\\Users\\1611r\\Desktop\\framewwork\\xtox19.xlsx");
		Workbook w1 = new XSSFWorkbook();
		Workbook w2 = new XSSFWorkbook(fi2);
		Sheet sheet2 = w2.getSheet("Sheet1");
		Sheet createSheet = w1.createSheet("ram");
		Workbook w = new XSSFWorkbook(fi); 
		Sheet sheet = w.getSheet("Sheet1");
		int a = sheet.getPhysicalNumberOfRows();
		for (int i = 0; i < a; i++) {
			Row row2 = sheet.getRow(i);
			Row createRow = createSheet.createRow(i);
			int b = row2.getPhysicalNumberOfCells();
			for (int j = 0; j < b; j++) {
				Cell cell = row2.getCell(j);
				Cell createCell = createRow.createCell(j);
				
				int cellType = cell.getCellType();
				
				
				int z = sheet2.getPhysicalNumberOfRows();
				for (int k = 0; k < z; k++) {
				Row row = sheet2.getRow(k);
				Row createRow2 = createSheet.createRow(k+a);
					int y = row.getPhysicalNumberOfCells();
					for (int l = 0; l < y; l++) {
						Cell cell2 = row.getCell(l);
						Cell createCell2 = createRow2.createCell(l);
						
						int cellType2 = cell2.getCellType();
						if (cellType2==1) {
							String ab = cell2.getStringCellValue();	
							createCell2.setCellValue(ab);
						}
						else if (DateUtil.isCellDateFormatted(createCell2)) {
							Date dateCellValue = cell2.getDateCellValue();
							SimpleDateFormat si = new SimpleDateFormat("dd/MM/yyyy");
							String format = si.format(dateCellValue);
							createCell2.setCellValue(format);
						} else {
double numericCellValue = cell2.getNumericCellValue();
							long l1 = (long)numericCellValue;
							createCell2.setCellValue(l1);
							
						}
						
					}	
				}
				if ((cellType )==1) {
					String stringCellValue2 = cell.getStringCellValue();
					createCell.setCellValue(stringCellValue2);
				}		
				else if (DateUtil.isCellDateFormatted(cell)) {
					Date dateCellValue = cell.getDateCellValue();
					SimpleDateFormat si = new SimpleDateFormat("dd/MM/yyyy");
					String format = si.format(dateCellValue);
					createCell.setCellValue(format);
				}
				else  {
					double numericCellValue = cell.getNumericCellValue();
					long l =(long)numericCellValue;
					createCell.setCellValue(l);
				}	
			}
		}
		FileOutputStream fil1 =new FileOutputStream(f1);
		w1.write(fil1);	
		
	}	
}
