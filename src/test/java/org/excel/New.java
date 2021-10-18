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

public class New {
	
	public static void main(String[] args) throws IOException {
		
		File f = new File("C:\\Users\\1611r\\eclipse-workspace\\excel\\testdata\\Book1.xlsx");
		FileInputStream f2 = new FileInputStream(f);
		File f5 = new File("C:\\Users\\1611r\\Desktop\\poona1.xlsx");
		
		Workbook w = new XSSFWorkbook(f2);
		Workbook w2 = new XSSFWorkbook();
		
		Sheet sheet = w.getSheet("Sheet1");
		Sheet createSheet = w2.createSheet();
		
		int physicalNumberOfRows = sheet.getPhysicalNumberOfRows();
		for (int i = 0; i < physicalNumberOfRows; i++) {
			Row row = sheet.getRow(i);
			Row createRow = createSheet.createRow(i);
			
			for (int j = 0; j < row.getPhysicalNumberOfCells(); j++) {
				Cell cell = row.getCell(j);
				Cell createCell = createRow.createCell(j);
				
				int cellType = cell.getCellType();
				if (cellType==1) {
					String stringCellValue = cell.getStringCellValue();
					createCell.setCellValue(stringCellValue);
				}
				else if (DateUtil.isCellDateFormatted(cell)) {
					Date dateCellValue = cell.getDateCellValue();
					SimpleDateFormat s1 = new SimpleDateFormat("dd/MM/yyyy");
					String format = s1.format(dateCellValue);
					createCell.setCellValue(format);
					
				} else {
					double numericCellValue = cell.getNumericCellValue();
long l = (long)numericCellValue;
createCell.setCellValue(l);
				}
				
				
				
				
				
				
				
				
			}
			
		}
		
	FileOutputStream f8 = new FileOutputStream(f5);	
		
		w2.write(f8);
		
		
		
	}
}
